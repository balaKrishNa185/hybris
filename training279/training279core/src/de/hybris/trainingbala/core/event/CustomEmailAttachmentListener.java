package de.hybris.trainingbala.core.event;

import de.hybris.platform.acceleratorservices.email.EmailService;
import de.hybris.platform.acceleratorservices.model.email.EmailAttachmentModel;
import de.hybris.platform.acceleratorservices.site.AbstractAcceleratorSiteEventListener;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commerceservices.enums.SiteChannel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.orderprocessing.model.OrderProcessModel;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.util.ServicesUtil;
import org.apache.log4j.Logger;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class CustomEmailAttachmentListener extends AbstractAcceleratorSiteEventListener<CustomEmailAttachmentEvent> {

    private ModelService modelService;
    private BusinessProcessService businessProcessService;
    private EmailService emailService;
    private final Logger log=Logger.getLogger(CustomEmailAttachmentListener.class);



    @Override
    protected void onSiteEvent(CustomEmailAttachmentEvent event) {
      final OrderModel orderModel= event.getProcess().getOrder();
      final OrderProcessModel orderProcessModel=getBusinessProcessService().createProcess( "customEmailAttachmentProcess-" + orderModel.getCode() + "-" + System.currentTimeMillis(),
              "customEmailAttachmentProcess");

      //attachment to the business process
        String filepath="D:\\Documents\\emailAttachment_user.txt";
        try {
            FileInputStream inputStream=new FileInputStream(filepath);

            final DataInputStream dataInputStream =new DataInputStream(inputStream);
            final String fileName= "attachment_for_user"+System.currentTimeMillis()+".txt";
            final String mimeType="text";

            final EmailAttachmentModel attachment= getEmailService().createEmailAttachment(dataInputStream,fileName,mimeType);
            List<EmailAttachmentModel> attachments=new ArrayList<>();
            attachments.add(attachment);

            //setting EmailAttachments to the OrderProcessModel
            orderProcessModel.setEmailAttachment(attachments);
            log.info("attachments are added in orderProcess");
            orderProcessModel.setOrder(orderModel);
            getModelService().save(orderProcessModel);
            getBusinessProcessService().startProcess(orderProcessModel);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    @Override
    protected SiteChannel getSiteChannelForEvent(CustomEmailAttachmentEvent event) {
        final OrderModel order = event.getProcess().getOrder();
        ServicesUtil.validateParameterNotNullStandardMessage("event.order", order);
        final BaseSiteModel site = order.getSite();
        ServicesUtil.validateParameterNotNullStandardMessage("event.order.site", site);
        return site.getChannel();
    }
    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    public BusinessProcessService getBusinessProcessService() {
        return businessProcessService;
    }

    public void setBusinessProcessService(BusinessProcessService businessProcessService) {
        this.businessProcessService = businessProcessService;
    }

    public EmailService getEmailService() {
        return emailService;
    }

    public void setEmailService(EmailService emailService) {
        this.emailService = emailService;
    }
}
