package de.hybris.trainingbala.core.custom.service.Impl;


import de.hybris.trainingbala.core.custom.dao.ManufacturerDetailsDao;
import de.hybris.trainingbala.core.custom.service.ManufacturerDetailsService;
import de.hybris.trainingbala.core.model.ManufacturerDetailsModel;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

public class DefaultManufacturerDetailsService implements ManufacturerDetailsService {

    private static final Logger LOG = Logger.getLogger(DefaultManufacturerDetailsService.class);
    private ManufacturerDetailsDao manufacturerDetailsDao;

    @Override
    public ManufacturerDetailsModel getManufacturerDetailsbyIdFromDao(String id) {

        validateParameterNotNull(id, "Parameter id must not be null");
         LOG.info("Getting ManufacturerDetailsbyId from Dao");
         return getManufacturerDetailsDao().findManufacturerDetailsById(id);
    }

    @Override
    public List<ManufacturerDetailsModel> getAllDetailsFromDao(int start) {
        return getManufacturerDetailsDao().getAllManufacturerDetails(start);
    }


    @Override
    public List<ManufacturerDetailsModel> getAllDetailsByPaginationFromDao(int currentPage) {
        return getManufacturerDetailsDao().getAllDetailsByPagination(currentPage);
    }

    public ManufacturerDetailsDao getManufacturerDetailsDao() {
        return manufacturerDetailsDao;
    }

    @Required
    public void setManufacturerDetailsDao(ManufacturerDetailsDao manufacturerDetailsDao) {
        this.manufacturerDetailsDao = manufacturerDetailsDao;
    }
}
