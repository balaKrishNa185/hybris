package de.hybris.trainingbala.core.custom.dao.Impl;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.servicelayer.data.SearchPageData;
import de.hybris.platform.product.daos.impl.DefaultProductDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.paginated.PaginatedFlexibleSearchParameter;
import de.hybris.platform.servicelayer.search.paginated.PaginatedFlexibleSearchService;
import de.hybris.platform.servicelayer.search.paginated.util.PaginatedSearchUtils;
import de.hybris.trainingbala.core.custom.dao.CustomProductDao;

import java.util.List;

public class DefaultCustomProductDao extends DefaultProductDao implements CustomProductDao {


    private PaginatedFlexibleSearchService paginatedFlexibleSearchService;

    public DefaultCustomProductDao(String typecode) {
        super(typecode);
    }

    @Override
    public List<ProductModel> getLatestProducts(int noOfLatestProducts) {

        int pageSize=noOfLatestProducts;
        int currentPage=0;
        boolean needsTotal=true;

        String query="select {"+ProductModel.PK+"} from {"+ProductModel._TYPECODE+"}";

        FlexibleSearchQuery fsk=new FlexibleSearchQuery(query);
        fsk.setNeedTotal(true);

        final SearchPageData<ProductModel> searchPageData = PaginatedSearchUtils.createSearchPageDataWithPagination(pageSize,currentPage,needsTotal);

        PaginatedFlexibleSearchParameter parameter=new PaginatedFlexibleSearchParameter();
        parameter.setSearchPageData(searchPageData);
        parameter.setFlexibleSearchQuery(fsk);

       SearchPageData<ProductModel> searchPageData1= getPaginatedFlexibleSearchService().search(parameter);

        return searchPageData1.getResults();
    }

    public PaginatedFlexibleSearchService getPaginatedFlexibleSearchService() {
        return paginatedFlexibleSearchService;
    }

    public void setPaginatedFlexibleSearchService(PaginatedFlexibleSearchService paginatedFlexibleSearchService) {
        this.paginatedFlexibleSearchService = paginatedFlexibleSearchService;
    }
}
