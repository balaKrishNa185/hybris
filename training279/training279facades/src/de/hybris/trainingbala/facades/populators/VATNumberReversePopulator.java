package de.hybris.trainingbala.facades.populators;

import de.hybris.platform.commercefacades.user.converters.populator.AddressReversePopulator;
import de.hybris.platform.commercefacades.user.data.AddressData;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.apache.log4j.Logger;
import org.springframework.util.Assert;

public class VATNumberReversePopulator extends AddressReversePopulator {

    private final Logger log=Logger.getLogger(VATNumberReversePopulator.class);

    @Override
    public void populate(AddressData addressData, AddressModel addressModel) throws ConversionException {
        super.populate(addressData, addressModel);

        Assert.notNull(addressData, "Parameter addressData cannot be null.");
        Assert.notNull(addressModel, "Parameter addressModel cannot be null.");


        if(addressData!=null)
        {
            addressModel.setVATNumber(addressData.getVATNumber());
            log.info("VATNumberReversePopulator is called");
        }

    }
}
