package de.hybris.trainingbala.core.custom.service.Impl;

import de.hybris.trainingbala.core.custom.dao.CustomersDao;
import de.hybris.trainingbala.core.custom.service.CustomersService;
import de.hybris.trainingbala.core.model.CustomersModel;
import org.springframework.beans.factory.annotation.Required;

import java.text.ParseException;
import java.util.List;

public class DefaultCustomersService implements CustomersService {


    private CustomersDao customersDao;

    @Override
    public List<CustomersModel> getAllCustomersFromDao() {
        return getCustomersDao().getAllCustomers();
    }


    @Override
    public List<CustomersModel> getCustomers() {
        return getCustomersDao().getCustomers();
    }

    public CustomersDao getCustomersDao() {
        return customersDao;
    }

    @Required
    public void setCustomersDao(CustomersDao customersDao) {
        this.customersDao = customersDao;
    }
}
