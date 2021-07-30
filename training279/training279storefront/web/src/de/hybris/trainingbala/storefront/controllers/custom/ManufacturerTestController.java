package de.hybris.trainingbala.storefront.controllers.custom;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class ManufacturerTestController extends AbstractPageController {

    @RequestMapping("/secondTest")
    public String getPage(Model model)
    {
        String page="testPage";
        try {
            final ContentPageModel contentPageModel= getContentPageForLabelOrId(page);
            storeCmsPageInModel(model,contentPageModel);
            setUpMetaDataForContentPage(model,contentPageModel);
        } catch (CMSItemNotFoundException e) {
            e.printStackTrace();
        }
        return getViewForPage(model);

    }
    }



