package de.hybris.trainingbala.facades.populators;

import de.hybris.platform.commercefacades.product.converters.populator.ProductPopulator;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;
import org.apache.log4j.Logger;

public class IsTestPopulator extends ProductPopulator {

    Logger log=Logger.getLogger(IsTestPopulator.class);
    @Override
    public void populate(ProductModel source, ProductData target) {
        super.populate(source, target);
        target.setIsTest(source.getIsTest());

        log.info("-----------------------IsTestPopulator is called------------------");

    }
}
