package de.hybris.trainingbala.storefront.controllers.command;

import de.hybris.platform.acceleratorstorefrontcommons.forms.AddressForm;

public class CustomAddressForm extends AddressForm {

    private String VATNumber;

    public String getVATNumber() {
        return VATNumber;
    }

    public void setVATNumber(String VATNumber) {
        this.VATNumber = VATNumber;
    }
}
