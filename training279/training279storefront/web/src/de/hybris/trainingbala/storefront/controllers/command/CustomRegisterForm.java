package de.hybris.trainingbala.storefront.controllers.command;

import de.hybris.platform.acceleratorstorefrontcommons.forms.RegisterForm;

public class CustomRegisterForm extends RegisterForm {


    private boolean newBusinessUser;


    public boolean isNewBusinessUser() {
        return newBusinessUser;
    }

    public void setNewBusinessUser(boolean newBusinessUser) {
        this.newBusinessUser = newBusinessUser;
    }
}
