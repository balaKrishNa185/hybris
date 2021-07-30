package de.hybris.trainingbala.facades.facades.Impl;

import de.hybris.platform.commercefacades.product.ProductOption;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.product.impl.DefaultProductFacade;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.trainingbala.core.custom.service.CustomProductService;
import de.hybris.trainingbala.facades.facades.CustomProductFacade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DefaultCustomProductFacade extends DefaultProductFacade implements CustomProductFacade {

    private CustomProductService customProductService;
    final List<ProductOption> productOptions= Arrays.asList(ProductOption.BASIC, ProductOption.IMAGES, ProductOption.DESCRIPTION, ProductOption.PRICE);


    @Override
    public List<ProductData> getAllProductData(int noOfLatestProduct) {
            List<ProductModel> models=  getCustomProductService().getLatestProducts(noOfLatestProduct);
        List<ProductData> productData=new ArrayList<>();
        for(ProductModel productModel:models){
            productData.add(getProductForCodeAndOptions(productModel.getCode(),productOptions));
        }
        return productData;
    }


    public CustomProductService getCustomProductService() {
        return customProductService;
    }

    public void setCustomProductService(CustomProductService customProductService) {
        this.customProductService = customProductService;
    }

}
