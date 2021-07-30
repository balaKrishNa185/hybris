package de.hybris.trainingbala.core.custom.dao.Impl;

import de.hybris.platform.commerceservices.customer.dao.impl.DefaultCustomerDao;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.trainingbala.core.custom.dao.CustomerDaoCustom;
import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.*;

public class DefaultCustomerDaoCustom  implements CustomerDaoCustom {


    private static final Logger LOG = Logger.getLogger(DefaultCustomerDaoCustom.class);
    private FlexibleSearchService flexibleSearchService;

    @Override
    public List<CustomerModel> getOnlyNewCustomers(int days) {

        LOG.info("DefaultCustomerDaoCustom is called");
        final Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, -days);
        final Date noOfDaysToConsider = cal.getTime();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String date = simpleDateFormat.format(noOfDaysToConsider);
        LOG.info("In DefaultCustomerDaoCustom date is calculated");


        String query = "SELECT {" + CustomerModel.PK + "} FROM {" + CustomerModel._TYPECODE + "} WHERE {" + CustomerModel.CREATIONTIME + "}<=?date";
        Map<String, Object> params = new HashMap<>();
        params.put("date", date);

        SearchResult<CustomerModel> modelSearchResult = getFlexibleSearchService().search(query, params);
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


