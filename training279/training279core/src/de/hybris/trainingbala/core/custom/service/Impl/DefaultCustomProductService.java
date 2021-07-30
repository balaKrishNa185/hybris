package de.hybris.trainingbala.core.custom.service.Impl;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.product.impl.DefaultProductService;
import de.hybris.trainingbala.core.custom.dao.CustomProductDao;
import de.hybris.trainingbala.core.custom.service.CustomProductService;

import java.util.List;

public class DefaultCustomProductService extends DefaultProductService implements CustomProductService {


    private CustomProductDao customProductDao;
    @Override
    public List<ProductModel> getLatestProducts(int noOfLatestProducts) {
        return getCustomProductDao().getLatestProducts(noOfLatestProducts);
    }


    public CustomProductDao getCustomProductDao() {
        return customProductDao;
    }

    public void setCustomProductDao(CustomProductDao customProductDao) {
        this.customProductDao = customProductDao;
    }
}
