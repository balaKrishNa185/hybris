package de.hybris.trainingbala.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.apache.log4j.Logger;

public class IsCountPopulator implements Populator<ProductModel, ProductData> {


    Logger log=Logger.getLogger(IsCountPopulator.class);
    @Override
    public void populate(ProductModel productModel, ProductData productData) throws ConversionException {
        productData.setIsCount(productModel.getIsCount());
        log.info("---------------------IsCountPopulator is called-------------------------");
    }
}
