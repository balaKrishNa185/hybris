package de.hybris.trainingbala.facades.populators;

import de.hybris.platform.commercefacades.user.converters.populator.CustomerPopulator;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.apache.log4j.Logger;
import org.springframework.util.Assert;

public class IsNewCustomerPopulator extends CustomerPopulator implements Populator<CustomerModel, CustomerData> {


    private static final Logger LOG = Logger.getLogger(IsNewCustomerPopulator.class);

    @Override
    public void populate(CustomerModel customerModel, CustomerData customerData) throws ConversionException {

        Assert.notNull(customerModel, "Parameter source cannot be null.");

        if (customerModel.getIsNewCustomer() != null) {
            customerData.setIsNewCustomer(customerModel.getIsNewCustomer());
            LOG.info("IsNewCustomerPopulator class is called" +customerData.getIsNewCustomer());
        }
    }
}
