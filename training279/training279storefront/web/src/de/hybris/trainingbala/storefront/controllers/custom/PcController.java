package de.hybris.trainingbala.storefront.controllers.custom;

import de.hybris.trainingbala.facades.facades.Impl.DefaultPcFacade;
import de.hybris.trainingbala.facades.product.data.ProductionCompanyData;
import de.hybris.trainingbala.storefront.controllers.ControllerConstants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/")
public class PcController {


    @Resource(name="defaultPcFacade")
    private DefaultPcFacade defaultPcFacade;


    @RequestMapping(value ="/pc/{id}" ,method = RequestMethod.GET)
    public String displayProductionrDetailsById(@PathVariable("id") Integer id, Model model) {

        ProductionCompanyData data=defaultPcFacade.getPcById(id);
        model.addAttribute("data",data);

        return ControllerConstants.Views.Pages.custom.ProductionDetails;
    }


    @RequestMapping(value ="/allpc" ,method = RequestMethod.GET)
    public String displayAllProDetails( Model model)
    {
        List<ProductionCompanyData> allData= defaultPcFacade.getAllpc();
        model.addAttribute("allDetailsproduction",allData);
        return ControllerConstants.Views.Pages.custom.ALLProductionDetails;
    }



    @RequestMapping(value ="/allpcs/{currentPage}" ,method = RequestMethod.GET)
    public String displayAllManufacturerDetails(@PathVariable("currentPage")int currentPage, Model model)
    {

        List<ProductionCompanyData> allData= defaultPcFacade.getPc(currentPage);
        model.addAttribute("allDetails",allData);
        return ControllerConstants.Views.Pages.custom.ALLProductionDetailsbyPagination;    }

}
