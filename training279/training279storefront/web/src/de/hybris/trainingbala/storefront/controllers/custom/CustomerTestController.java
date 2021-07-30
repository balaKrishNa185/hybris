package de.hybris.trainingbala.storefront.controllers.custom;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.trainingbala.core.job.NewCustomerJob;
import de.hybris.trainingbala.storefront.controllers.ControllerConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class CustomerTestController {

    @Autowired
    private NewCustomerJob newCustomerJob;

    @RequestMapping(value = "/cus")
    public String getCus(Model model)
    {
     List<CustomerModel>customerModels= newCustomerJob.getOnlyNewCustomers(5);
     model.addAttribute("datas",customerModels);
     return ControllerConstants.Views.Pages.Customers.Cus;
    }
}
