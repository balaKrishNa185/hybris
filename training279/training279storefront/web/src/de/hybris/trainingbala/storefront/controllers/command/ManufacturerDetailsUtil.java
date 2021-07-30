package de.hybris.trainingbala.storefront.controllers.command;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.trainingbala.core.model.ManufacturerDetailsModel;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("manufacturerDetailsUtil")
public class ManufacturerDetailsUtil
{

    @Autowired
    private ModelService modelService;

    private static final Logger LOG = Logger.getLogger(ManufacturerDetailsUtil.class);


    public ManufacturerDetailsModel convertDataToModel(final ManufacturerDetailsForm manufacturerDetailsForm)
    {
     final ManufacturerDetailsModel manufacturerDetailsModel=modelService.create(ManufacturerDetailsModel.class);
     LOG.info("manufacturerDetailsModel object is created through ModelService");
       manufacturerDetailsModel.setId(manufacturerDetailsForm.getId());

       if(manufacturerDetailsModel.getName()!=null) {
           manufacturerDetailsModel.setName(manufacturerDetailsForm.getName());
    }


       manufacturerDetailsModel.setCountry(manufacturerDetailsForm.getCountry());
        LOG.info("manufacturerDetailsform object is set to manufacturerDetailsModel object");
       return manufacturerDetailsModel;

    }

}
