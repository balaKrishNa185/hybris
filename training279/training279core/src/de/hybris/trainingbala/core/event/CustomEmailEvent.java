package de.hybris.trainingbala.core.event;

import de.hybris.platform.orderprocessing.events.OrderPlacedEvent;
import de.hybris.platform.orderprocessing.events.OrderProcessingEvent;
import de.hybris.platform.orderprocessing.model.OrderProcessModel;
import de.hybris.platform.servicelayer.event.events.AbstractEvent;

public class CustomEmailEvent extends OrderProcessingEvent {

    public CustomEmailEvent(OrderProcessModel process) {
        super(process);
    }
}

