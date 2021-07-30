package de.hybris.trainingbala.core.custom.dao.Impl;

import de.hybris.platform.core.servicelayer.data.SearchPageData;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.search.paginated.PaginatedFlexibleSearchParameter;
import de.hybris.platform.servicelayer.search.paginated.PaginatedFlexibleSearchService;
import de.hybris.platform.servicelayer.search.paginated.util.PaginatedSearchUtils;
import de.hybris.trainingbala.core.custom.dao.PcDao;
import de.hybris.trainingbala.core.model.ProductionCompanyModel;

import java.util.List;

public class DefaultPcDao implements PcDao {

    private FlexibleSearchService flexibleSearchService;
    private PaginatedFlexibleSearchService paginatedFlexibleSearchService;

    @Override
    public List<ProductionCompanyModel> getAllpc() {
        FlexibleSearchQuery fsk=new FlexibleSearchQuery("SELECT {"+ProductionCompanyModel.PK+"} FROM {"+ProductionCompanyModel._TYPECODE+"}");
        SearchResult<ProductionCompanyModel> searchResult=getFlexibleSearchService().search(fsk);
        return searchResult.getResult();
    }

    @Override
    public List<ProductionCompanyModel> getPc(int currentPage) {
        FlexibleSearchQuery fsk=new FlexibleSearchQuery("SELECT {"+ProductionCompanyModel.PK+"} FROM {"+ProductionCompanyModel._TYPECODE+"}");

        SearchPageData<ProductionCompanyModel> searchPageData =PaginatedSearchUtils.createSearchPageDataWithPagination(5,currentPage,true);

        PaginatedFlexibleSearchParameter parameter=new PaginatedFlexibleSearchParameter();
        parameter.setFlexibleSearchQuery(fsk);
        parameter.setSearchPageData(searchPageData);

        SearchPageData<ProductionCompanyModel> searchResult=getPaginatedFlexibleSearchService().search(parameter);
        return searchResult.getResults();
    }

    @Override
    public ProductionCompanyModel getPcById(Integer id) {
        FlexibleSearchQuery fsk=new FlexibleSearchQuery("SELECT {"+ProductionCompanyModel.PK+"} FROM {"+ProductionCompanyModel._TYPECODE+"} WHERE {"+ProductionCompanyModel.DID+"}=?id");
       SearchResult<ProductionCompanyModel>searchResult=  getFlexibleSearchService().search(fsk);
        return searchResult.getResult().get(0);
    }

    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }

    public PaginatedFlexibleSearchService getPaginatedFlexibleSearchService() {
        return paginatedFlexibleSearchService;
    }

    public void setPaginatedFlexibleSearchService(PaginatedFlexibleSearchService paginatedFlexibleSearchService) {
        this.paginatedFlexibleSearchService = paginatedFlexibleSearchService;
    }
}
