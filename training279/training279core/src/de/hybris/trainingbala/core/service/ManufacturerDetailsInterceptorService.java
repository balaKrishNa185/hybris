package de.hybris.trainingbala.core.service;

import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.trainingbala.core.model.ManufacturerDetailsModel;

public interface ManufacturerDetailsInterceptorService {

    public String saveModelObjectThroughService(ManufacturerDetailsModel manufacturerDetailsModel) throws InterceptorException;
}
