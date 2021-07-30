package de.hybris.trainingbala.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;


import de.hybris.trainingbala.core.model.ManufacturerDetailsModel;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

public class ManufacturerDetailsNameValidateInterceptor implements ValidateInterceptor<ManufacturerDetailsModel>
{
    private static final Logger LOG = Logger.getLogger(ManufacturerDetailsNameValidateInterceptor.class);

    @Override
    public void onValidate(ManufacturerDetailsModel manufacturerDetailsModel, InterceptorContext interceptorContext) throws InterceptorException {


        final String name=manufacturerDetailsModel.getName();
        LOG.info("ManufacturerDetailsNameValidateInterceptor is called.....");
             if(!StringUtils.isAlphanumeric(name))
                throw new InterceptorException("Name should be AlphaNumeric");
            }

        }



