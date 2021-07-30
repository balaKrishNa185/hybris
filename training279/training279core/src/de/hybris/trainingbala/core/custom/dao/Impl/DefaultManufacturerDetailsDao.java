package de.hybris.trainingbala.core.custom.dao.Impl;

import de.hybris.platform.core.servicelayer.data.SearchPageData;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.search.paginated.PaginatedFlexibleSearchParameter;
import de.hybris.platform.servicelayer.search.paginated.impl.DefaultPaginatedFlexibleSearchService;
import de.hybris.platform.servicelayer.search.paginated.util.PaginatedSearchUtils;
import de.hybris.trainingbala.core.custom.dao.ManufacturerDetailsDao;
import de.hybris.trainingbala.core.model.ManufacturerDetailsModel;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DefaultManufacturerDetailsDao  implements ManufacturerDetailsDao {

    private static final Logger LOG = Logger.getLogger(DefaultManufacturerDetailsDao.class);

    private FlexibleSearchService flexibleSearchService;
    private DefaultPaginatedFlexibleSearchService defaultPaginatedFlexibleSearchService;

    @Override
    public ManufacturerDetailsModel findManufacturerDetailsById(String id) {

            LOG.info("Getting ManufacturerDetailsbyId");

            StringUtils.isBlank(id);

            final FlexibleSearchQuery query= new FlexibleSearchQuery("SELECT {" + ManufacturerDetailsModel.PK +"} FROM {" + ManufacturerDetailsModel._TYPECODE +"}"
                             + "WHERE {" + ManufacturerDetailsModel.ID+"}=?id");
            query.addQueryParameter(ManufacturerDetailsModel.ID,id);

            SearchResult<ManufacturerDetailsModel> searchResult= getFlexibleSearchService().search(query);
            LOG.info(searchResult.getResult());
            return searchResult.getResult().get(0);
      }


    @Override
    public List<ManufacturerDetailsModel> getAllManufacturerDetails(int start) {

        int range=10;
        start=start*range;
        int total;
        int count;
        String query="SELECT {"+ManufacturerDetailsModel.PK+"} FROM{"+ManufacturerDetailsModel._TYPECODE+"}";
        FlexibleSearchQuery fQuery=new FlexibleSearchQuery(query);
        fQuery.setCount(range);
        fQuery.setNeedTotal(true);

        do {
            fQuery.setStart(start);
            SearchResult<ManufacturerDetailsModel> searchResult = getFlexibleSearchService().search(fQuery);
           count=searchResult.getCount();
           LOG.info(count);
           total= searchResult.getTotalCount();
           start=start+range;

           return searchResult.getResult();
        }while (start < total);
    }


    @Override
    public List<ManufacturerDetailsModel> getAllDetailsByPagination(int currentPage) {

        int pageSize=10;
        boolean needTotal=true;

        String query="SELECT {"+ManufacturerDetailsModel.PK+"} FROM {"+ManufacturerDetailsModel._TYPECODE+"}";

        final FlexibleSearchQuery fsk=new FlexibleSearchQuery(query);

        final  Map<String,String> sortedMap=new HashMap<>();
        sortedMap.put(ManufacturerDetailsModel.ID,"id");

        final SearchPageData<ManufacturerDetailsModel> searchPageData= PaginatedSearchUtils.createSearchPageDataWithPagination(pageSize,currentPage,needTotal);

        PaginatedFlexibleSearchParameter parameter=new PaginatedFlexibleSearchParameter();
        parameter.setSearchPageData(searchPageData);
        parameter.setFlexibleSearchQuery(fsk);
        parameter.setSortCodeToQueryAlias(sortedMap);

        final SearchPageData<ManufacturerDetailsModel> searchPageData1= getDefaultPaginatedFlexibleSearchService().search(parameter);
        return searchPageData1.getResults();
    }

    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
      }

      @Required
      public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }

    public DefaultPaginatedFlexibleSearchService getDefaultPaginatedFlexibleSearchService() {
        return defaultPaginatedFlexibleSearchService;
    }

    public void setDefaultPaginatedFlexibleSearchService(DefaultPaginatedFlexibleSearchService defaultPaginatedFlexibleSearchService) {
        this.defaultPaginatedFlexibleSearchService = defaultPaginatedFlexibleSearchService;
    }
}