package de.hybris.trainingbala.core.custom;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.model.attribute.AbstractDynamicAttributeHandler;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;

public class Product_isNewProductAttributeHandler extends AbstractDynamicAttributeHandler<Boolean, ProductModel> {

    @Override
    public Boolean get(ProductModel model) {

             int remainingDate;

             final Date modelCreationtime = model.getCreationtime();

            final Calendar cal = Calendar.getInstance();
            Date todayDate=cal.getTime();
            long diff=todayDate.getTime()-modelCreationtime.getTime();

           long difference_In_Days = (diff / (1000*60*60*24)) % 365;


            if(difference_In_Days< 10) {
                return true;
            } else {
                return false;
            }


    }

}
