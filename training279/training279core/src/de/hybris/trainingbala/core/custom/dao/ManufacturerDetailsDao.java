package de.hybris.trainingbala.core.custom.dao;

import de.hybris.trainingbala.core.model.ManufacturerDetailsModel;

import java.util.List;


public interface ManufacturerDetailsDao {

   ManufacturerDetailsModel findManufacturerDetailsById(final String id);


   List<ManufacturerDetailsModel> getAllManufacturerDetails(int start);

   List<ManufacturerDetailsModel> getAllDetailsByPagination(int currentPage);
}
