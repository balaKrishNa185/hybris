package de.hybris.trainingbala.core.emailService;

import de.hybris.platform.acceleratorservices.email.impl.DefaultEmailGenerationService;
import de.hybris.platform.acceleratorservices.model.cms2.pages.EmailPageModel;
import de.hybris.platform.acceleratorservices.model.email.EmailAttachmentModel;
import de.hybris.platform.acceleratorservices.model.email.EmailMessageModel;
import de.hybris.platform.processengine.model.BusinessProcessModel;
import de.hybris.platform.servicelayer.model.ModelService;
import org.apache.log4j.Logger;

import java.util.List;

public class CustomEmailGenerationService extends DefaultEmailGenerationService {

    private ModelService modelService;
    private Logger log=Logger.getLogger(CustomEmailGenerationService.class);

    @Override
    public EmailMessageModel generate(BusinessProcessModel businessProcessModel, EmailPageModel emailPageModel) {

        EmailMessageModel emailMessageModel= super.generate(businessProcessModel, emailPageModel);

      List<EmailAttachmentModel> emailAttachmentModels= businessProcessModel.getEmailAttachment();
      emailMessageModel.setAttachments(emailAttachmentModels);
      getModelService().saveAll(emailMessageModel);
      log.info("attachments are added in email message");
      return emailMessageModel;
    }

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }
}
