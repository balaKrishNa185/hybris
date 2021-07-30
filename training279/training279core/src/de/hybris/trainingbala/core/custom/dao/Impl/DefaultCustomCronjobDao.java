package de.hybris.trainingbala.core.custom.dao.Impl;

import de.hybris.platform.core.GenericSearchConstants;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.trainingbala.core.custom.dao.CustomCronjobDao;
import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultCustomCronjobDao implements CustomCronjobDao {

    private static final Logger LOG=Logger.getLogger(DefaultCustomCronjobDao.class);
    private FlexibleSearchService flexibleSearchService;

    @Override
    public List<CustomerModel> getAllNewCustomers(int days) {
        LOG.info("NewCustomerJob inside getOnlyNewCustomers()  is called");
        LocalDate localDate = LocalDate.now().minusDays(days);
        String date=localDate.toString();
        LOG.info("date"+date);
        LOG.info("In NewCustomerJob date is calculated"+date);

        String query="SELECT {"+CustomerModel.PK+"} FROM {"+CustomerModel._TYPECODE+"} WHERE {"+CustomerModel.CREATIONTIME+"}>=?date";
        Map<String,Object> params=new HashMap<>();
        params.put("date",date);

        SearchResult<CustomerModel> modelSearchResult= getFlexibleSearchService().search(query,params);
        LOG.info("Flexible search query is executed");
        return modelSearchResult.getResult();
    }

    public List<CustomerModel> getRecentNewCustomers(Date date1)
    {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date2=simpleDateFormat.format(date1);

        String query="SELECT {"+CustomerModel.PK+"} FROM {"+CustomerModel._TYPECODE+"} WHERE {"+CustomerModel.CREATIONTIME+"}>=?date2";
        Map<String,Object> params=new HashMap<>();
        params.put("date2",date2);

        SearchResult<CustomerModel> modelSearchResult= getFlexibleSearchService().search(query,params);
        LOG.info("Flexible search query is executed");
        return modelSearchResult.getResult();

    }

    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }
}
