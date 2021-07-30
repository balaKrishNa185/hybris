package de.hybris.trainingbala.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.apache.log4j.Logger;

public class Product_isNewProductPopulator implements Populator<ProductModel, ProductData> {

    private static final Logger LOG = Logger.getLogger(Product_isNewProductPopulator.class);


    @Override
    public void populate(ProductModel source, ProductData target) throws ConversionException {

      LOG.info("my populator is called");
        target.setIsNewProduct(source.getIsNewProduct());
    }
}
