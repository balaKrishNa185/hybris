package de.hybris.trainingbala.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.search.converters.populator.SearchResultVariantOptionsProductPopulator;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;
import org.apache.log4j.Logger;

import java.util.List;

public class ManufacturerNameSearchResultPopulator extends SearchResultVariantOptionsProductPopulator {


    private Logger Log= Logger.getLogger("ManufacturerSearchResultPopulator.Class");

    @Override
    public void populate(SearchResultValueData source, ProductData target) {
        super.populate(source, target);

        if(source!=null) {
                Log.info("ManufacturerNameSearchResultPopulator is called");

                target.setIndexedManufacturerName(this.getValue(source, "manufacturerDetails_string_mv"));

                Log.info("ManufacturerNameSearchResultPopulator is value is setted");
                if(target.getIndexedManufacturerName()!=null)
                {
                Log.info(target.getIndexedManufacturerName().get(0));
                 }
        }
    }
}
