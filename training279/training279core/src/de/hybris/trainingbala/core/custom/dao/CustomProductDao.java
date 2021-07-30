package de.hybris.trainingbala.core.custom.dao;

import de.hybris.platform.core.model.product.ProductModel;

import java.util.List;

public interface CustomProductDao {


    List<ProductModel> getLatestProducts(int noOfLatestProducts);
}
