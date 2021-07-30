package de.hybris.trainingbala.core.interceptors;


import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;
import de.hybris.platform.servicelayer.interceptor.PersistenceOperation;
import de.hybris.trainingbala.core.model.ManufacturerDetailsEntryModel;
import de.hybris.trainingbala.core.model.ManufacturerDetailsModel;

import java.util.Date;

public class ManufacturerDetailsNameRemoveInterceptor implements RemoveInterceptor<ManufacturerDetailsModel> {


    @Override
    public void onRemove(ManufacturerDetailsModel manufacturerDetailsModel, InterceptorContext interceptorContext) throws InterceptorException {
        {
            final ManufacturerDetailsEntryModel source = interceptorContext.getModelService().create(ManufacturerDetailsEntryModel.class);
            if (source != null)
            {
                source.setName(manufacturerDetailsModel.getName());
                source.setSavingTime(new Date());
                interceptorContext.registerElementFor(source, PersistenceOperation.SAVE);
                }
            }
        }
    }

