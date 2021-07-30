package de.hybris.trainingbala.facades.facades.Impl;
import de.hybris.platform.commercefacades.customer.impl.DefaultCustomerFacade;
import de.hybris.platform.commercefacades.user.data.RegisterData;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.trainingbala.facades.facades.CustomCustomerFacade;
import org.apache.log4j.Logger;


public class DefaultCustomCustomerFacade extends DefaultCustomerFacade implements CustomCustomerFacade {

    private static final Logger LOGGER=Logger.getLogger(DefaultCustomCustomerFacade.class);

    @Override
    protected void setCommonPropertiesForRegister(final RegisterData registerData, final CustomerModel customerModel)
    {
        facadeCalled();
        customerModel.setIsNewBusinessUser(registerData.isIsNewBusinessUser());
        super.setCommonPropertiesForRegister(registerData,customerModel);
    }

    @Override
    public void facadeCalled() {
        LOGGER.info("DefaultCustomCustomerFacade is called");
    }
}
