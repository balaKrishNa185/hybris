package de.hybris.trainingbala.fulfilmentprocess.email;

import de.hybris.platform.orderprocessing.model.OrderProcessModel;
import de.hybris.platform.processengine.action.AbstractProceduralAction;
import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.task.RetryLaterException;
import de.hybris.trainingbala.core.event.CustomEmailAttachmentEvent;
import org.apache.log4j.Logger;

public class CustomEmailAttachmentAction extends AbstractProceduralAction<OrderProcessModel> {


    private static final Logger LOG = Logger.getLogger(CustomEmailAttachmentAction.class);
    private EventService eventService;

    @Override
    public void executeAction(OrderProcessModel process) throws RetryLaterException, Exception {
        getEventService().publishEvent(new CustomEmailAttachmentEvent(process));
        LOG.info("CustomEmailAttachmentAction  is called");
    }

    public EventService getEventService() {
        return eventService;
    }

    public void setEventService(EventService eventService) {
        this.eventService = eventService;
    }
}
