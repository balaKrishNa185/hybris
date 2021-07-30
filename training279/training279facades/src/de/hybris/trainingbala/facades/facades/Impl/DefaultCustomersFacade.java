package de.hybris.trainingbala.facades.facades.Impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.trainingbala.core.custom.service.CustomersService;
import de.hybris.trainingbala.core.model.CustomersModel;
import de.hybris.trainingbala.facades.facades.CustomersFacade;
import de.hybris.trainingbala.facades.product.data.CustomersData;
import java.text.ParseException;
import java.util.List;

public class DefaultCustomersFacade implements CustomersFacade {

    private CustomersService customersService;
    private Converter<CustomersModel,CustomersData> customersDataConverter;


    @Override
    public List<CustomersData> getAllCustomerSData() {

        List<CustomersModel> models=  getCustomersService().getAllCustomersFromDao();
        List<CustomersData> data = getCustomersDataConverter().convertAll(models);
        return data;
    }

    @Override
    public List<CustomersData> getAllCustomerS() {
        List<CustomersModel> models=  getCustomersService().getCustomers();
        List<CustomersData> data1 = getCustomersDataConverter().convertAll(models);
        return data1;
    }

    public CustomersService getCustomersService() {
        return customersService;
    }

    public void setCustomersService(CustomersService customersService) {
        this.customersService = customersService;
    }

    public Converter<CustomersModel, CustomersData> getCustomersDataConverter() {
        return customersDataConverter;
    }

    public void setCustomersDataConverter(Converter<CustomersModel, CustomersData> customersDataConverter) {
        this.customersDataConverter = customersDataConverter;
    }
}
