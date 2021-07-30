package de.hybris.trainingbala.facades.process.email.context;

import de.hybris.platform.acceleratorservices.model.cms2.pages.EmailPageModel;
import de.hybris.platform.acceleratorservices.process.email.context.AbstractEmailContext;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.orderhistory.model.OrderHistoryEntryModel;
import de.hybris.platform.orderprocessing.model.OrderProcessModel;
import de.hybris.platform.sap.productconfig.services.model.ProductConfigurationModel;

import java.util.List;

public class CustomNotificationEmailContext extends AbstractEmailContext<OrderProcessModel> {


    private static final String PRICE ="price" ;
    private static final String PRODUCTNAME = "productName";
    private static final String CODE = "code";
    private static final String USERNAME ="userName" ;


    @Override
    public void init(OrderProcessModel businessProcessModel, EmailPageModel emailPageModel) {
        super.init(businessProcessModel, emailPageModel);
        final CustomerModel customerModel = getCustomer(businessProcessModel);
        if (customerModel != null)
        {
            put(DISPLAY_NAME, customerModel.getDisplayName());
            put(EMAIL, getCustomerEmailResolutionService().getEmailForCustomer(customerModel));

            put(CODE,businessProcessModel.getOrder().getCode());
             put(USERNAME,businessProcessModel.getOrder().getUser());
             put(PRICE,businessProcessModel.getOrder().getTotalPrice());


         }

    }

    @Override
    protected BaseSiteModel getSite(OrderProcessModel businessProcessModel) {
        return businessProcessModel.getOrder().getSite();
    }

    @Override
    protected CustomerModel getCustomer(OrderProcessModel businessProcessModel) {
        return (CustomerModel) businessProcessModel.getOrder().getUser();
    }

    @Override
    protected LanguageModel getEmailLanguage(OrderProcessModel businessProcessModel) {
        return businessProcessModel.getOrder().getLanguage();

    }
}
