package de.hybris.trainingbala.storefront.controllers.custom;


import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.trainingbala.core.model.LatestProductComponentModel;
import de.hybris.trainingbala.facades.facades.CustomProductFacade;
import de.hybris.trainingbala.storefront.controllers.ControllerConstants;
import de.hybris.trainingbala.storefront.controllers.cms.AbstractAcceleratorCMSComponentController;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller("LatestProductComponentController")
@RequestMapping(value = ControllerConstants.Actions.Cms.LatestComponent)
public class LatestProductComponentController extends AbstractAcceleratorCMSComponentController<LatestProductComponentModel> {

       private Logger logger=Logger.getLogger(LatestProductComponentController.class);

    @Autowired
    private CustomProductFacade customProductFacade;

    @Override
    protected void fillModel(HttpServletRequest request, Model model, LatestProductComponentModel component) {
        logger.info("inside controller before");
        List<ProductData> productData= customProductFacade.getAllProductData(component.getNo0fLatestProduct());
        logger.info("inside controller after"+productData.size());
          model.addAttribute("data",productData);

    }


}
