package de.hybris.trainingbala.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.trainingbala.core.model.ManufacturerDetailsModel;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

public class ManufacturerNameInitDefaultInterceptor implements InitDefaultsInterceptor<ManufacturerDetailsModel> {

    @Autowired
     private ModelService modelService;

    private static final Logger LOG = Logger.getLogger(ManufacturerNameInitDefaultInterceptor.class);
    @Override
    public void onInitDefaults(ManufacturerDetailsModel manufacturerDetailsModel, InterceptorContext interceptorContext) throws InterceptorException {

        manufacturerDetailsModel.setName("NEW USER");
        LOG.info("default user name"+ manufacturerDetailsModel.getName());
    }
}
