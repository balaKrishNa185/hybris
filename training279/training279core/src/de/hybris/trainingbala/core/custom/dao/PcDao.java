package de.hybris.trainingbala.core.custom.dao;

import de.hybris.platform.acceleratorservices.dataexport.googlelocal.model.Product;
import de.hybris.trainingbala.core.model.ProductionCompanyModel;

import java.util.List;

public interface PcDao {


  List<ProductionCompanyModel> getAllpc();

  List<ProductionCompanyModel> getPc(int currentPage);

  ProductionCompanyModel getPcById(Integer id);
}
