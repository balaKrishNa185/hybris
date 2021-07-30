package de.hybris.trainingbala.facades.facades.Impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.trainingbala.core.custom.service.ManufacturerDetailsService;
import de.hybris.trainingbala.core.model.ManufacturerDetailsModel;
import de.hybris.trainingbala.facades.facades.ManufacturerDetailsFacade;
import de.hybris.trainingbala.facades.product.data.ManufacturerDetailsData;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;


public class DefaultManufacturerDetailsFacade implements ManufacturerDetailsFacade {

    private static final Logger LOG = Logger.getLogger(DefaultManufacturerDetailsFacade.class);

    private ManufacturerDetailsService manufacturerDetailsService;
    private Converter<ManufacturerDetailsModel, ManufacturerDetailsData> manufacturerDetailsConvertor;


    @Override
    public ManufacturerDetailsData getManufacturerDetailsFromService(String id) {

        final ManufacturerDetailsModel detailsModel= getManufacturerDetailsService().getManufacturerDetailsbyIdFromDao(id);
        final ManufacturerDetailsData detailsData = getManufacturerDetailsConvertor().convert(detailsModel);
        LOG.info(" ManufacturerDetailsConvertor is getting called in facade ");
        LOG.info(detailsData);
        return detailsData;
    }


    @Override
    public List<ManufacturerDetailsData> getAllDataFromService(int start) {

       final List<ManufacturerDetailsModel> models= getManufacturerDetailsService().getAllDetailsFromDao(start);
        final List<ManufacturerDetailsData> data = getManufacturerDetailsConvertor().convertAll(models);
        return data;
    }

    @Override
    public List<ManufacturerDetailsData> getAllDetailsByPaginationFromService(int currentPage) {

        final List<ManufacturerDetailsModel> models1=  getManufacturerDetailsService().getAllDetailsByPaginationFromDao(currentPage);
        final List<ManufacturerDetailsData> data1 =getManufacturerDetailsConvertor().convertAll(models1);
        return data1;
    }

    public ManufacturerDetailsService getManufacturerDetailsService() {
        return manufacturerDetailsService;
    }


    @Required
    public void setManufacturerDetailsService(ManufacturerDetailsService manufacturerDetailsService) {
        this.manufacturerDetailsService = manufacturerDetailsService;
    }


    public Converter<ManufacturerDetailsModel, ManufacturerDetailsData> getManufacturerDetailsConvertor() {
        return manufacturerDetailsConvertor;
    }

    @Required
    public void setManufacturerDetailsConvertor(Converter<ManufacturerDetailsModel, ManufacturerDetailsData> manufacturerDetailsConvertor) {
        this.manufacturerDetailsConvertor = manufacturerDetailsConvertor;
    }
}
