package de.hybris.trainingbala.facades.populators;

import de.hybris.platform.commercefacades.user.converters.populator.AddressPopulator;
import de.hybris.platform.commercefacades.user.data.AddressData;
import de.hybris.platform.core.model.user.AddressModel;
import org.apache.log4j.Logger;
import org.springframework.util.Assert;

public class VATNumberPopulator extends AddressPopulator {


    private final Logger log=Logger.getLogger(VATNumberPopulator.class);
    @Override
    public void populate(AddressModel source, AddressData target) {
        super.populate(source, target);

        Assert.notNull(source, "Parameter source cannot be null.");
        Assert.notNull(target, "Parameter target cannot be null.");

        if(source!=null)
        {
            target.setVATNumber(source.getVATNumber());
            log.info("VATNumberPopulator is called Successfully");
        }

    }
}
