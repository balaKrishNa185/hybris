package de.hybris.trainingbala.core.service.impl;

import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.trainingbala.core.model.ManufacturerDetailsModel;
import de.hybris.trainingbala.core.service.ManufacturerDetailsInterceptorService;
import org.apache.log4j.Logger;

public class DefaultManufacturerDetailsInterceptorService implements ManufacturerDetailsInterceptorService {

    private static final Logger LOG = Logger.getLogger(DefaultManufacturerDetailsInterceptorService.class);
    private ModelService modelService;

    @Override
    public String saveModelObjectThroughService(ManufacturerDetailsModel manufacturerDetailsModel) throws InterceptorException {
        LOG.info("getModelService().save is called in service class");
       getModelService().save(manufacturerDetailsModel);
       return "data inserted";
    }


    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }
}
