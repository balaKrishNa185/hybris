package de.hybris.trainingbala.facades.populators;

import de.hybris.platform.commercefacades.user.converters.populator.CustomerPopulator;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.apache.log4j.Logger;

public class NewBusinessUserPopulator extends CustomerPopulator implements Populator<CustomerModel, CustomerData> {


    private static final Logger LOG= Logger.getLogger(NewBusinessUserPopulator.class);

    @Override
    public void populate(CustomerModel customerModel, CustomerData customerData) throws ConversionException {
        LOG.info("NewBusinessUserPopulator is called");
        customerData.setIsNewBusinessUser(customerModel.getIsNewBusinessUser());
    }
}
