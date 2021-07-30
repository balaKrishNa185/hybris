package de.hybris.trainingbala.storefront.controllers.custom;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NewTemplateController extends AbstractPageController {



    @RequestMapping(value = "/LatestPage", method = RequestMethod.GET)
    public String testCmsPage(Model model){
        try {
            final ContentPageModel contentPageModel= getContentPageForLabelOrId("LatestPage");
            storeCmsPageInModel(model,contentPageModel);
            setUpMetaDataForContentPage(model,contentPageModel);
        } catch (CMSItemNotFoundException e) {
            e.printStackTrace();
        }
        return getViewForPage(model);

    }

}
