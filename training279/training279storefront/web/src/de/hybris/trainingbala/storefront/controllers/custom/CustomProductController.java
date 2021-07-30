package de.hybris.trainingbala.storefront.controllers.custom;


import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.trainingbala.facades.facades.Impl.DefaultCustomProductFacade;
import de.hybris.trainingbala.storefront.controllers.ControllerConstants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/")
public class CustomProductController {

    @Resource(name="defaultCustomProductFacade")
    private DefaultCustomProductFacade defaultCustomProductFacade;


    @RequestMapping("/latest/{noOfLatestProducts}")
    public String getAllProducts(@PathVariable("noOfLatestProducts") int noOfLatestProducts, Model model)
    {
       List<ProductData> productData= defaultCustomProductFacade.getAllProductData(noOfLatestProducts);
       model.addAttribute("data",productData);
        return ControllerConstants.Views.Pages.custom.ProductDetails;
    }
}
