package de.hybris.trainingbala.facades.facades.Impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.trainingbala.core.custom.service.PcService;
import de.hybris.trainingbala.core.model.ManufacturerDetailsModel;
import de.hybris.trainingbala.core.model.ProductionCompanyModel;
import de.hybris.trainingbala.facades.product.data.ManufacturerDetailsData;
import de.hybris.trainingbala.facades.product.data.ProductionCompanyData;

import java.util.List;

public class DefaultPcFacade implements PcFacade{


    private PcService pcService;
    private Converter<ProductionCompanyModel,ProductionCompanyData> converter;

    @Override
    public List<ProductionCompanyData> getAllpc() {

        final List<ProductionCompanyModel> models= getPcService().getAllpc();
        final List<ProductionCompanyData> data = getConverter().convertAll(models);
        return data;
    }

    @Override
    public List<ProductionCompanyData> getPc(int currentPage) {
        final List<ProductionCompanyModel> models= getPcService().getPc(currentPage);
        final List<ProductionCompanyData> data1 = getConverter().convertAll(models);
        return data1;
    }

    @Override
    public ProductionCompanyData getPcById(Integer id) {
        final ProductionCompanyModel models= getPcService().getPcById(id);
        final ProductionCompanyData data = getConverter().convert(models);
        return data;
    }

    public Converter<ProductionCompanyModel, ProductionCompanyData> getConverter() {
        return converter;
    }

    public void setConverter(Converter<ProductionCompanyModel, ProductionCompanyData> converter) {
        this.converter = converter;
    }

    public PcService getPcService() {
        return pcService;
    }

    public void setPcService(PcService pcService) {
        this.pcService = pcService;
    }
}
