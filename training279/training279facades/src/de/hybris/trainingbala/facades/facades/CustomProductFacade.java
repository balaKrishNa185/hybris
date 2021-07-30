package de.hybris.trainingbala.facades.facades;

import de.hybris.platform.commercefacades.product.data.ProductData;

import java.util.List;

public interface CustomProductFacade {

    List<ProductData> getAllProductData(int noOfLatestProduct);
}
