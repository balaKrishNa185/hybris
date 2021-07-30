package de.hybris.trainingbala.core.custom.dao.Impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.trainingbala.core.custom.dao.CustomersDao;
import de.hybris.trainingbala.core.model.CustomersModel;
import org.springframework.beans.factory.annotation.Required;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DefaultCustomersDao implements CustomersDao {


    private FlexibleSearchService flexibleSearchService;

    @Override
    public List<CustomersModel> getAllCustomers() {

        StringBuilder sb=new StringBuilder();
        sb.append("SELECT {"+CustomersModel.PK+"}");
        sb.append("FROM {"+CustomersModel._TYPECODE+"}");

        FlexibleSearchQuery flexibleSearchQuery=new FlexibleSearchQuery(sb);

        SearchResult<CustomersModel> searchResult= getFlexibleSearchService().search(flexibleSearchQuery);

        return searchResult.getResult();
    }

    @Override
    public List<CustomersModel> getCustomers() {


       StringBuilder sb=new StringBuilder();
        sb.append("SELECT {"+CustomersModel.PK+"}");
        sb.append("FROM {"+CustomersModel._TYPECODE+"}");
        sb.append("WHERE {"+CustomersModel.CUSTOMERCREATED+"}");
        sb.append(">= DATE_SUB(NOW(), INTERVAL 10 DAY)");

        FlexibleSearchQuery flexibleSearchQuery=new FlexibleSearchQuery(sb);
        SearchResult<CustomersModel> searchResult= getFlexibleSearchService().search(flexibleSearchQuery);
        return searchResult.getResult();
    }

    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    @Required
    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }

}
