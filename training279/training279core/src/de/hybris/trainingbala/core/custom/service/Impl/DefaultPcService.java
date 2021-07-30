package de.hybris.trainingbala.core.custom.service.Impl;

import de.hybris.trainingbala.core.custom.dao.PcDao;
import de.hybris.trainingbala.core.custom.service.PcService;
import de.hybris.trainingbala.core.model.ProductionCompanyModel;

import java.util.List;

public class DefaultPcService implements PcService {

    private PcDao pcDao;

    @Override
    public List<ProductionCompanyModel> getAllpc() {
        return getPcDao().getAllpc();
    }

    @Override
    public List<ProductionCompanyModel> getPc(int currentPage) {
        return getPcDao().getPc(currentPage);
    }

    @Override
    public ProductionCompanyModel getPcById(Integer id) {
        return getPcDao().getPcById(id);
    }

    public PcDao getPcDao() {
        return pcDao;
    }

    public void setPcDao(PcDao pcDao) {
        this.pcDao = pcDao;
    }
}
