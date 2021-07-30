package de.hybris.trainingbala.core.decorator;


import de.hybris.platform.impex.jalo.header.AbstractImpExCSVCellDecorator;

import java.util.Map;

public class CustomerUidDecorator extends AbstractImpExCSVCellDecorator {


    @Override
    public String decorate(int position, Map<Integer, String> source) {

        String uId = source.get(position);
        String currency = source.get(position + 3);
        String requiredCurrency = "USD";
        if (currency != null && currency.equals(requiredCurrency)) {
            if (uId != null) {
                uId = uId + "_" + requiredCurrency;

            }
        }
        return uId;
    }
}



