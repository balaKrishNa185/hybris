package de.hybris.trainingbala.core.event;

import de.hybris.platform.orderprocessing.events.OrderProcessingEvent;
import de.hybris.platform.orderprocessing.model.OrderProcessModel;

public class CustomEmailAttachmentEvent extends OrderProcessingEvent {

    public CustomEmailAttachmentEvent(OrderProcessModel process) {
        super(process);
    }
}
