package de.hybris.trainingbala.storefront.controllers.command.validation;


import de.hybris.platform.acceleratorstorefrontcommons.forms.validation.AddressValidator;
import de.hybris.trainingbala.storefront.controllers.command.CustomAddressForm;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component("customAddressValidator")
public class CustomAddressValidator extends AddressValidator {

    private Logger log=Logger.getLogger(CustomAddressValidator.class);

    @Override
    public boolean supports(Class<?> aClass) {
        return super.supports(aClass);
    }

    @Override
    public void validate(Object object, Errors errors) {
        super.validate(object, errors);
        log.info("CustomAddressValidator is called");
        CustomAddressForm addressForm= (CustomAddressForm) object;
         String VATNumber= addressForm.getVATNumber();
       if(VATNumber!=null) {
           isAlphaNumeric(VATNumber, errors);
       }
    }

    private void isAlphaNumeric(String VATNumber,Errors errors) {

        boolean result = Pattern.matches("^[a-zA-Z0-9]+$", VATNumber);
        if (!result) {
            errors.reject("VATNumber", "checkVATNumber.not.a.alphanumeric");
            log.info("given checkVATNumber is not a alphanumeric");
        }
    }


    }
