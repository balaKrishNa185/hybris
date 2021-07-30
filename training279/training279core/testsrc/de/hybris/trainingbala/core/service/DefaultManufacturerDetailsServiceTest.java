package de.hybris.trainingbala.core.service;


import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.trainingbala.core.custom.dao.ManufacturerDetailsDao;
import de.hybris.trainingbala.core.custom.service.Impl.DefaultManufacturerDetailsService;
import de.hybris.trainingbala.core.model.ManufacturerDetailsModel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

@UnitTest
public class DefaultManufacturerDetailsServiceTest {

    @InjectMocks
    private DefaultManufacturerDetailsService defaultManufacturerDetailsService;

    @Mock
    private ManufacturerDetailsDao manufacturerDetailsDao;

    @Test
    public void getManufacturerDetailsForNullId() {
        Mockito.when(manufacturerDetailsDao.findManufacturerDetailsById(null)).thenReturn(null);
        ManufacturerDetailsModel model=defaultManufacturerDetailsService.getManufacturerDetailsbyIdFromDao(null);
        Assert.assertNull(model);
    }
}
