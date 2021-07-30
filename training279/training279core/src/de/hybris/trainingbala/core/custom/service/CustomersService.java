package de.hybris.trainingbala.core.custom.service;

import de.hybris.trainingbala.core.model.CustomersModel;

import java.text.ParseException;
import java.util.List;

public interface CustomersService {


    List<CustomersModel> getAllCustomersFromDao();

    public List<CustomersModel> getCustomers();
}
