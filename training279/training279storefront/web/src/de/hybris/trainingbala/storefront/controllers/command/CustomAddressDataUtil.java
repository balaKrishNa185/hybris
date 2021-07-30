package de.hybris.trainingbala.storefront.controllers.command;

import de.hybris.platform.acceleratorstorefrontcommons.forms.AddressForm;
import de.hybris.platform.acceleratorstorefrontcommons.util.AddressDataUtil;
import de.hybris.platform.commercefacades.user.data.AddressData;
import de.hybris.platform.commercefacades.user.data.CountryData;
import de.hybris.platform.commercefacades.user.data.RegionData;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;


@Component("customAddressDataUtil")
public class CustomAddressDataUtil extends AddressDataUtil {


    private final Logger log=Logger.getLogger(CustomAddressDataUtil.class);
    @Override
    public AddressData convertToAddressData(AddressForm addressForm) {
        //super.convertToAddressData(addressForm);
        CustomAddressForm customAddressForm= (CustomAddressForm) addressForm;

        final AddressData addressData=new AddressData();
        addressData.setId(addressForm.getAddressId());
        addressData.setTitleCode(addressForm.getTitleCode());
        addressData.setFirstName(addressForm.getFirstName());
        addressData.setLastName(addressForm.getLastName());
        addressData.setLine1(addressForm.getLine1());
        addressData.setLine2(addressForm.getLine2());
        addressData.setTown(addressForm.getTownCity());
        addressData.setPostalCode(addressForm.getPostcode());
        addressData.setBillingAddress(false);
        addressData.setShippingAddress(true);
        addressData.setPhone(addressForm.getPhone());

        if (addressForm.getCountryIso() != null)
        {
            final CountryData countryData = getI18NFacade().getCountryForIsocode(addressForm.getCountryIso());
            addressData.setCountry(countryData);
        }
        if (addressForm.getRegionIso() != null && !StringUtils.isEmpty(addressForm.getRegionIso()))
        {
            final RegionData regionData = getI18NFacade().getRegion(addressForm.getCountryIso(), addressForm.getRegionIso());
            addressData.setRegion(regionData);
        }

        addressData.setVATNumber(customAddressForm.getVATNumber());
        log.info("CustomAddressDataUtil is called");
        return addressData;
    }


    @Override
    public void convertBasic(AddressData source, AddressForm target) {
        super.convertBasic(source, target);
        CustomAddressForm modifiedTarget= (CustomAddressForm) target;
        modifiedTarget.setVATNumber(source.getVATNumber());
    }

    @Override
    public void convert(AddressData source, AddressForm target) {
        super.convert(source, target);
        CustomAddressForm modifiedTarget= (CustomAddressForm) target;
        modifiedTarget.setVATNumber(source.getVATNumber());
    }
}
