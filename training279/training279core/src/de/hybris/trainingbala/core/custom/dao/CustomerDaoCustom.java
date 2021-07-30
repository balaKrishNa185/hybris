package de.hybris.trainingbala.core.custom.dao;

import de.hybris.platform.core.model.user.CustomerModel;

import java.util.List;

public interface CustomerDaoCustom {


    List<CustomerModel> getOnlyNewCustomers(int days);
}
