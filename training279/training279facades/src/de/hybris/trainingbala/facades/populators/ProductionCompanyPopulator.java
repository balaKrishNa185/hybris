package de.hybris.trainingbala.facades.populators;


import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.trainingbala.core.model.ProductionCompanyModel;
import de.hybris.trainingbala.facades.product.data.ProductionCompanyData;
import org.apache.log4j.Logger;

public class ProductionCompanyPopulator implements Populator<ProductionCompanyModel, ProductionCompanyData>
{

    Logger log=Logger.getLogger(ProductionCompanyPopulator.class);
    @Override
    public void populate(ProductionCompanyModel source, ProductionCompanyData target) throws ConversionException {

        target.setId(source.getDid());
        target.setName(source.getDname());
        target.setCountry(source.getDcountry());
        log.info("------------------ProductionCompanyPopulator is called-------");
    }
}