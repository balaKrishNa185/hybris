package de.hybris.trainingbala.core.custom.service;

import de.hybris.trainingbala.core.model.ProductionCompanyModel;

import java.util.List;

public interface PcService {


    List<ProductionCompanyModel> getAllpc();

    List<ProductionCompanyModel> getPc(int currentPage);

    ProductionCompanyModel getPcById(Integer id);
}
