package de.hybris.trainingbala.core.custom.dao;

import de.hybris.platform.core.model.user.CustomerModel;

import java.util.Date;
import java.util.List;

public interface CustomCronjobDao {

    List<CustomerModel> getAllNewCustomers(int days);
    List<CustomerModel> getRecentNewCustomers(Date date1);
}
