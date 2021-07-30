package de.hybris.trainingbala.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.trainingbala.core.model.CustomersModel;
import org.apache.log4j.Logger;

import java.util.Calendar;
import java.util.Date;

public class CustomerPrepareInterceptor implements PrepareInterceptor<CustomersModel> {

    private static final Logger LOG=Logger.getLogger(CustomerPrepareInterceptor.class);

    @Override
    public void onPrepare(CustomersModel customersModel, InterceptorContext interceptorContext) throws InterceptorException {

        boolean bool= OldOrNewCustomer(customersModel);
        LOG.info("CustomerPrepareInterceptor is started");
        customersModel.setNewCustomer(bool);
        LOG.info("CustomerPrepareInterceptor values is saved");
    }



    public Boolean OldOrNewCustomer(CustomersModel customersModel) {
        LOG.info("OldOrNewCustomer() is called");
        Date creationTime = customersModel.getCustomerCreated();
        Calendar cal = Calendar.getInstance();
        Date todayDate = cal.getTime();
        long diff = todayDate.getTime() - creationTime.getTime();
        long diffInDays = (diff / (1000 * 60 * 60 * 24)) % 365;
        if (diffInDays < 10) {
            return true;
        } else {
            return false;
        }
    }



}
