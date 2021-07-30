package de.hybris.trainingbala.storefront.controllers.custom;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import de.hybris.trainingbala.core.model.ManufacturerDetailsModel;
import de.hybris.trainingbala.core.service.ManufacturerDetailsInterceptorService;
import de.hybris.trainingbala.facades.facades.ManufacturerDetailsFacade;
import de.hybris.trainingbala.facades.product.data.ManufacturerDetailsData;
import de.hybris.trainingbala.storefront.controllers.ControllerConstants;
import de.hybris.trainingbala.storefront.controllers.command.ManufacturerDetailsUtil;
import de.hybris.trainingbala.storefront.controllers.command.ManufacturerDetailsForm;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.annotation.Resource;
import java.util.List;

@Controller
public class ManufacturerDetailsController extends AbstractPageController {

    private static final Logger LOG = Logger.getLogger(ManufacturerDetailsController.class);

    @Resource(name="manufacturerDetailsFacade")
    private ManufacturerDetailsFacade manufacturerDetailsFacade;

    @Resource(name="manufacturerDetailsInterceptorService")
    private ManufacturerDetailsInterceptorService manufacturerDetailsInterceptorService;

    @Resource(name="manufacturerDetailsUtil")
    private ManufacturerDetailsUtil manufacturerDetailsUtil;

    @RequestMapping(value ="/manuDetails/{id}" ,method = RequestMethod.GET)
    public String displayManufacturerDetailsById(@PathVariable("id") String id, Model model) {

        ManufacturerDetailsData data=manufacturerDetailsFacade.getManufacturerDetailsFromService(id);
        model.addAttribute("manufacturerDetails",data);
        LOG.info("ManufacturerDetailsController is called");
        return ControllerConstants.Views.Pages.custom.ManufacturerDetails;
    }

    @RequestMapping(value ="/all/{start}" ,method = RequestMethod.GET)
    public String displayAllManufacturerDetails(@PathVariable("start")int start, Model model)
    {
      List<ManufacturerDetailsData> allData= manufacturerDetailsFacade.getAllDataFromService(start);
      model.addAttribute("allDetails",allData);
      return ControllerConstants.Views.Pages.ManufacturerDetails.ALLManufacturerDetails;
    }


    @RequestMapping(value ="/manu/{currentPage}" ,method = RequestMethod.GET)
    public String displayAllManufacturerDetailsByPagination(@PathVariable("currentPage")int currentPage, Model model)
    {
        List<ManufacturerDetailsData> allData1= manufacturerDetailsFacade.getAllDetailsByPaginationFromService(currentPage);
        model.addAttribute("allDetailsPage",allData1);
        return ControllerConstants.Views.Pages.ManufacturerDetails.ALLManufacturerDetailsByPagination;
    }


 /*   @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String addManufacturerDetails(@ModelAttribute("Manufacturer") ManufacturerDetailsForm manufacturerDetailsForm)
    {
        LOG.info(" new  ManufacturerDetailsModel() is created");
       return ControllerConstants.Views.Pages.ManufacturerDetails.AddManufacturerDetails;
    }


    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String saveManufacturerDetails(@ModelAttribute("Manufacturer")ManufacturerDetailsForm manufacturerDetailsForm,Model model)
    {
        LOG.info(" manufacturerDetailsForm is created");
     final ManufacturerDetailsModel manufacturerDetailsModel= manufacturerDetailsUtil.convertDataToModel(manufacturerDetailsForm);
        LOG.info(" manufacturerDetailsForm is passed to helper class");
        String msg=null;
        try {
            msg= manufacturerDetailsInterceptorService.saveModelObjectThroughService(manufacturerDetailsModel);
        }
        catch (Exception e)
        {
            model.addAttribute("error","Enter only Alphanumeric");
        }
        model.addAttribute("saved",msg);
        LOG.info(" model object is saved");
        return ControllerConstants.Views.Pages.ManufacturerDetails.AddManufacturerDetails;
    }*/


    @RequestMapping(value = "/manupage")
    public String newCmsPage(final Model model, ManufacturerDetailsForm manufacturerDetailsForm)
    {
        final String manuCMSpage="manufacturerpage";
        try {
            model.addAttribute("Manufacturer",new ManufacturerDetailsForm());
         final ContentPageModel contentPageModel= getContentPageForLabelOrId(manuCMSpage);
         storeCmsPageInModel(model,contentPageModel);
         setUpMetaDataForContentPage(model,contentPageModel);
        } catch (CMSItemNotFoundException e) {
            e.printStackTrace();
        }
        return getViewForPage(model);
    }




    @RequestMapping(value = "/savemanu",method = RequestMethod.POST)
    public String newCmsPage1(@ModelAttribute("Manufacturer")ManufacturerDetailsForm manufacturerDetailsForm,final Model model)
    {
        final String manuCMSpage="manufacturersavepage";
        try {
            final ManufacturerDetailsModel manufacturerDetailsModel= manufacturerDetailsUtil.convertDataToModel(manufacturerDetailsForm);
            String msg=null;
            try {
                msg= manufacturerDetailsInterceptorService.saveModelObjectThroughService(manufacturerDetailsModel);
            }
            catch (Exception e)
            {
                model.addAttribute("error","Enter only Alphanumeric");
            }
            model.addAttribute("save","Details saved");
            final ContentPageModel contentPageModel= getContentPageForLabelOrId(manuCMSpage);
            storeCmsPageInModel(model,contentPageModel);
            setUpMetaDataForContentPage(model,contentPageModel);
        } catch (CMSItemNotFoundException e) {
            e.printStackTrace();
        }
        return getViewForPage(model);
    }




    @RequestMapping(value = "/testcms", method = RequestMethod.GET)
    public String testCmsPage(Model model){
        try {
            final ContentPageModel contentPageModel= getContentPageForLabelOrId("testingPage");
            storeCmsPageInModel(model,contentPageModel);
            setUpMetaDataForContentPage(model,contentPageModel);
        } catch (CMSItemNotFoundException e) {
            e.printStackTrace();
        }
        return getViewForPage(model);

    }

}