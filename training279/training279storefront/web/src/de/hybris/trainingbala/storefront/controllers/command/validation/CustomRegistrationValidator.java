package de.hybris.trainingbala.storefront.controllers.command.validation;
import de.hybris.platform.acceleratorstorefrontcommons.forms.validation.RegistrationValidator;
import de.hybris.trainingbala.storefront.controllers.command.CustomRegisterForm;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;



@Component("customRegistrationValidator")
public class CustomRegistrationValidator extends RegistrationValidator {

    private static final Logger LOGGER=Logger.getLogger(CustomRegistrationValidator.class);

    @Override
    public boolean supports(Class<?> aClass) {
        return super.supports(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        super.validate(o, errors);
        final CustomRegisterForm customRegisterForm = (CustomRegisterForm) o;

        final boolean newBusinessUser = customRegisterForm.isNewBusinessUser();
        LOGGER.info("customform is validating.......");
        validateNewBusinessUser(errors,newBusinessUser);
    }


    protected void validateNewBusinessUser(final Errors errors,final boolean newBusinessUser)
    {
        if(!newBusinessUser)
        {
            errors.reject("newBusinessUser","register.not.a.Business.user");
        }
    }
}
