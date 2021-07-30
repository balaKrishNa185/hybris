package de.hybris.trainingbala.core.event;

import de.hybris.platform.acceleratorservices.site.AbstractAcceleratorSiteEventListener;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commerceservices.enums.SiteChannel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.orderprocessing.model.OrderProcessModel;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.util.ServicesUtil;

public class CustomEmailNotificationListener extends AbstractAcceleratorSiteEventListener<CustomEmailEvent> {


    private ModelService modelService;
    private BusinessProcessService businessProcessService;


    @Override
    protected void onSiteEvent(CustomEmailEvent event) {
        final OrderModel orderModel = event.getProcess().getOrder();
        final OrderProcessModel orderProcessModel = getBusinessProcessService().createProcess(
                "customEmailNotificationProcess-" + orderModel.getCode() + "-" + System.currentTimeMillis(),
                "customEmailNotificationProcess");

        orderProcessModel.setOrder(orderModel);
        getModelService().save(orderProcessModel);
        getBusinessProcessService().startProcess(orderProcessModel);
    }


    @Override
    protected SiteChannel getSiteChannelForEvent(CustomEmailEvent event) {
        final OrderModel order = event.getProcess().getOrder();
        ServicesUtil.validateParameterNotNullStandardMessage("event.order", order);
        final BaseSiteModel site = order.getSite();
        ServicesUtil.validateParameterNotNullStandardMessage("event.order.site", site);
        return site.getChannel();
    }

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    public BusinessProcessService getBusinessProcessService() {
        return businessProcessService;
    }

    public void setBusinessProcessService(BusinessProcessService businessProcessService) {
        this.businessProcessService = businessProcessService;
    }
}
