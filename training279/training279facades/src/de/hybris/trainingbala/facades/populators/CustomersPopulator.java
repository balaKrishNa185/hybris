package de.hybris.trainingbala.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.trainingbala.core.model.CustomersModel;
import de.hybris.trainingbala.facades.product.data.CustomersData;

public class CustomersPopulator implements Populator<CustomersModel, CustomersData>
{

    @Override
    public void populate(CustomersModel source, CustomersData target) throws ConversionException {

        target.setCustomerCreated(source.getCustomerCreated());
        target.setName(source.getName());
        target.setPhone(source.getPhone());
        target.setNewCustomer(source.getNewCustomer());
    }
}
