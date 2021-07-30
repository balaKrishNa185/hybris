package de.hybris.trainingbala.core.job;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.time.TimeService;
import de.hybris.trainingbala.core.model.CustomerCronJobNewModel;
import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class NewCustomerJob extends AbstractJobPerformable<CustomerCronJobNewModel> {

    private static final Logger LOG = Logger.getLogger(NewCustomerJob.class);

    private FlexibleSearchService flexibleSearchService;
    private ModelService modelService;
    private TimeService timeService;



    @Override
    public PerformResult perform(CustomerCronJobNewModel customerCronJobNewModel) {

        LOG.info("NewCustomerJob is called");
         Date time= customerCronJobNewModel.getEndTime();
         LOG.info("LAST EXCEUTION TIME:"+time);

        int days = customerCronJobNewModel.getNoOfDaysToConsider();
        List<CustomerModel> customerModels = getOnlyNewCustomers(days);

        if (customerModels != null) {
            for (CustomerModel customerModel : customerModels) {
                if (customerModel.getIsNewCustomer() == null) {
                    customerModel.setIsNewCustomer(true);
                    getModelService().save(customerModel);
                    LOG.info("boolean value is set");
                }

            }

        }
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }

    public List<CustomerModel> getOnlyNewCustomers(int days)
    {


        LocalDate localDate = LocalDate.now().minusDays(days);
        String date=localDate.toString();
        LOG.info("date"+date);

        String query = "SELECT {" + CustomerModel.PK + "} FROM {" + CustomerModel._TYPECODE + "} WHERE {" + CustomerModel.CREATIONTIME + "}>=?date";
        Map<String, Object> params = new HashMap<>();
        params.put("date", date);

        SearchResult<CustomerModel> modelSearchResult = getFlexibleSearchService().search(query, params);
        LOG.info("Flexible search query is executed");
        LOG.info(modelSearchResult.getTotalCount());
        return modelSearchResult.getResult();
    }



    public ModelService getModelService() {
        return modelService;
    }

    @Override
    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }


    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    @Override
    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }


    public TimeService getTimeService() {
        return timeService;
    }

    public void setTimeService(TimeService timeService) {
        this.timeService = timeService;
    }
}
