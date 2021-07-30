package de.hybris.trainingbala.facades.facades;


import de.hybris.trainingbala.facades.product.data.ManufacturerDetailsData;

import java.util.List;


public interface ManufacturerDetailsFacade {

   ManufacturerDetailsData getManufacturerDetailsFromService(final String id);


   List<ManufacturerDetailsData> getAllDataFromService(int start);

   List<ManufacturerDetailsData> getAllDetailsByPaginationFromService(int currentPage);
}