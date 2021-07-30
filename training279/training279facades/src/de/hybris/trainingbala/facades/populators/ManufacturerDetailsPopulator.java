package de.hybris.trainingbala.facades.populators;

import de.hybris.platform.converters.Populator;

import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.trainingbala.core.model.ManufacturerDetailsModel;
import de.hybris.trainingbala.facades.product.data.ManufacturerDetailsData;
import org.apache.log4j.Logger;

public class ManufacturerDetailsPopulator implements Populator<ManufacturerDetailsModel, ManufacturerDetailsData> {

    private static final Logger LOG = Logger.getLogger(ManufacturerDetailsPopulator.class);
    @Override
    public void populate(ManufacturerDetailsModel source, ManufacturerDetailsData target) throws ConversionException {


        LOG.info("ManufacturerDetailsPopulator is called");
        target.setId(source.getId());
        target.setName(source.getName());
        target.setCountry(source.getCountry());
    }
}
