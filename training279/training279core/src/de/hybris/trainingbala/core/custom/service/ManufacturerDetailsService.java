package de.hybris.trainingbala.core.custom.service;

import de.hybris.trainingbala.core.model.ManufacturerDetailsModel;

import java.util.List;

public interface ManufacturerDetailsService {

    ManufacturerDetailsModel getManufacturerDetailsbyIdFromDao(String id);

    List<ManufacturerDetailsModel> getAllDetailsFromDao(int start);


    List<ManufacturerDetailsModel> getAllDetailsByPaginationFromDao(int currentPage);
}
