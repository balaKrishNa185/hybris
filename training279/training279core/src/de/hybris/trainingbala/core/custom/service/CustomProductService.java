package de.hybris.trainingbala.core.custom.service;

import de.hybris.platform.core.model.product.ProductModel;

import java.util.List;

public interface CustomProductService {

    List<ProductModel> getLatestProducts(int noOfLatestProducts);
}
