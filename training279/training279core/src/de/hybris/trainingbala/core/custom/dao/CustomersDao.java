package de.hybris.trainingbala.core.custom.dao;

import de.hybris.trainingbala.core.jalo.Customers;
import de.hybris.trainingbala.core.model.CustomersModel;

import java.text.ParseException;
import java.util.List;

public interface CustomersDao {

    List<CustomersModel> getAllCustomers();

    List<CustomersModel> getCustomers();
}
