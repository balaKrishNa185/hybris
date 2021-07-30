package de.hybris.trainingbala.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.trainingbala.core.model.ManufacturerDetailsModel;
import de.hybris.trainingbala.facades.product.data.ManufacturerDetailsData;
import org.apache.log4j.Logger;

public class CustomProductPopulatorForManuDetails implements Populator<ProductModel , ProductData> {

    Converter<ManufacturerDetailsModel, ManufacturerDetailsData> manufacturerDetailsConvertor;

    private static final Logger LOG = Logger.getLogger(CustomProductPopulatorForManuDetails.class);
    public Converter<ManufacturerDetailsModel, ManufacturerDetailsData> getManufacturerDetailsConvertor() {
        return manufacturerDetailsConvertor;
    }

    public void setManufacturerDetailsConvertor(Converter<ManufacturerDetailsModel, ManufacturerDetailsData> manufacturerDetailsConvertor) {
        this.manufacturerDetailsConvertor = manufacturerDetailsConvertor;
    }

    @Override
    public void populate(ProductModel source, ProductData target) throws ConversionException {
    target.setManufacturerDetails(getManufacturerDetailsConvertor().convertAll(source.getManufacturerDetails()));
    LOG.info("CustomProductPopulatorForManuDetails is called...");
    }
}
