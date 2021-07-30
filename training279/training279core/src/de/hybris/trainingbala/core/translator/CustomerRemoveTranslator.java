package de.hybris.trainingbala.core.translator;

import de.hybris.platform.impex.jalo.translators.AbstractValueTranslator;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.JaloInvalidParameterException;

public class CustomerRemoveTranslator extends AbstractValueTranslator {


    @Override
    public Object importValue(String value, Item item) throws JaloInvalidParameterException {

        boolean b =false;
        if(item==null)
        {
            setError();
        }
        else {
            if(value.equals("1"))
            {
                b=true;
                return b;
            }
            else
            {
                b=false;
                return b;
            }
        }
        return b;
    }

    @Override
    public String exportValue(Object o) throws JaloInvalidParameterException {
        return null;
    }
}
