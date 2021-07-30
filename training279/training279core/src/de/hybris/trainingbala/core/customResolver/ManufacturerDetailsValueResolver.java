package de.hybris.trainingbala.core.customResolver;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.indexer.IndexerBatchContext;
import de.hybris.platform.solrfacetsearch.indexer.spi.InputDocument;
import de.hybris.platform.solrfacetsearch.provider.impl.AbstractValueResolver;
import de.hybris.trainingbala.core.jalo.ManufacturerDetails;
import de.hybris.trainingbala.core.model.ManufacturerDetailsModel;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ManufacturerDetailsValueResolver extends AbstractValueResolver<ProductModel,Object, List<ManufacturerDetails>> {


    private static final Logger LOG=Logger.getLogger(ManufacturerDetailsValueResolver.class);


    @Override
    protected void addFieldValues(InputDocument inputDocument, IndexerBatchContext indexerBatchContext, IndexedProperty indexedProperty, ProductModel productModel, ValueResolverContext<Object, List<ManufacturerDetails>> valueResolverContext) throws FieldValueProviderException {

        LOG.info("ManufacturerDetailsValueResolver is called.......");


      final Collection<String> manufacturerName=collectManufacturerDetails(productModel);

    if(!manufacturerName.isEmpty())
    {
        for(final String names :manufacturerName)
        {
            if(!StringUtils.isBlank(names))
            {
                inputDocument.addField(indexedProperty,names,valueResolverContext.getFieldQualifier());
                LOG.info("ManufacturerDetails is added in document.......");
            }
        }
    }
    else {
        throw new FieldValueProviderException("No value resolved for indexed property " + indexedProperty.getName());
    }
    }

    protected Collection<String>  collectManufacturerDetails(ProductModel productModel) {
        final Collection<String> manufacturerNames=new ArrayList<>();
        if(productModel!=null)
        {
            final Collection<ManufacturerDetailsModel> productManufacturers=productModel.getManufacturerDetails();
            if (productManufacturers!=null)
           // if(productManufacturers!=null && !productManufacturers.isEmpty())
            {
                for(final ManufacturerDetailsModel manufacturer :productManufacturers)
                {
                    String names =manufacturer.getName();
                    manufacturerNames.add(names);
                }
            }
        }
     return manufacturerNames;
    }
}
