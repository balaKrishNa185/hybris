package de.hybris.trainingbala.core.custom;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.model.attribute.AbstractDynamicAttributeHandler;

import java.util.Calendar;
import java.util.Date;

public class Product_isItYesterdayProduct extends AbstractDynamicAttributeHandler<Boolean, ProductModel> {


    @Override
    public Boolean get(ProductModel model) {


        Date creationTime = model.getCreationtime();

        Calendar cal = Calendar.getInstance();

        Date todayDate = cal.getTime();

        long diff = todayDate.getTime() - creationTime.getTime();


        long diffInDays = (diff / (1000 * 60 * 60 * 24)) % 365;

        if (diffInDays < 2) {
            return true;
        } else {
            return false;
        }
    }
}
