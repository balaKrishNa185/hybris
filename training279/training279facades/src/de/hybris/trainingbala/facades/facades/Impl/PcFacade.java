package de.hybris.trainingbala.facades.facades.Impl;

import de.hybris.trainingbala.core.model.ProductionCompanyModel;
import de.hybris.trainingbala.facades.product.data.ProductionCompanyData;

import java.util.List;

public interface PcFacade {



    List<ProductionCompanyData> getAllpc();

    List<ProductionCompanyData> getPc(int currentPage);

    ProductionCompanyData getPcById(Integer id);
}
