package de.hybris.trainingbala.fulfilmentprocess.email;

import de.hybris.platform.orderprocessing.model.OrderProcessModel;
import de.hybris.platform.processengine.action.AbstractProceduralAction;
import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.trainingbala.core.event.CustomEmailEvent;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

public class CustomNotificationEmailAction extends AbstractProceduralAction<OrderProcessModel>  {

     private static final Logger LOG = Logger.getLogger(CustomNotificationEmailAction.class);
     private EventService eventService;

     @Override
     public void executeAction(final OrderProcessModel process) {
        getEventService().publishEvent(new CustomEmailEvent(process));
        LOG.info("Process: " + process.getCode() + " in step " + getClass());
        LOG.info("CustomNotificationEmailAction class is called-----------");
        }

    public EventService getEventService() {
        return eventService;
    }

    @Required
    public void setEventService(EventService eventService) {
        this.eventService = eventService;
    }
}

