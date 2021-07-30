package de.hybris.trainingbala.core.job;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobHistoryModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.trainingbala.core.custom.dao.CustomCronjobDao;
import de.hybris.trainingbala.core.model.NewCustomerCronJobModel;
import org.apache.log4j.Logger;

import java.util.*;

public class IsNewCustomerJob extends AbstractJobPerformable<NewCustomerCronJobModel> {

    private static final Logger LOG = Logger.getLogger(IsNewCustomerJob.class);

    private ModelService modelService;
    private CustomCronjobDao customCronjobDao;


    @Override
    public PerformResult perform(NewCustomerCronJobModel newCustomerCronJobModel) {

        int days = newCustomerCronJobModel.getNoOfDaysToConsider();
        if (days!= 0) {
            final List<CronJobHistoryModel> model = newCustomerCronJobModel.getCronJobHistoryEntries();
            Date endOfpreviousJob = model.get(0).getEndTime();
            LOG.info("end of previous job===========" + endOfpreviousJob);
            if (endOfpreviousJob == null) {
                List<CustomerModel> customerModels = getCustomCronjobDao().getAllNewCustomers(days);
                settingValueForNewCustomer(customerModels);
            } else {
                final CronJobHistoryModel models = newCustomerCronJobModel.getCronJobHistoryEntries().get(0);
                Date date = models.getEndTime();
                LOG.info("last cronjob==" + date);
                List<CustomerModel> customerModels = getCustomCronjobDao().getRecentNewCustomers(date);
                settingValueForNewCustomer(customerModels);
                LOG.info("last end time:" + date);
            }
        }
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }

    public void  settingValueForNewCustomer(  List<CustomerModel> customerModels) {
        if (customerModels != null) {
            for (CustomerModel customerModel : customerModels) {
                customerModel.setIsNew(true);
                getModelService().save(customerModel);
                LOG.info("boolean value is set");

            }
        }
    }


            public ModelService getModelService () {
                return modelService;
            }

            @Override
            public void setModelService (ModelService modelService){
                this.modelService = modelService;
            }

            public CustomCronjobDao getCustomCronjobDao () {
                return customCronjobDao;
            }

            public void setCustomCronjobDao (CustomCronjobDao customCronjobDao){
                this.customCronjobDao = customCronjobDao;
            }


        }


