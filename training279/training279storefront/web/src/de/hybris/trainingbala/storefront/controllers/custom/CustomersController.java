package de.hybris.trainingbala.storefront.controllers.custom;

import de.hybris.trainingbala.facades.facades.CustomersFacade;
import de.hybris.trainingbala.facades.product.data.CustomersData;
import de.hybris.trainingbala.storefront.controllers.ControllerConstants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

import java.util.List;

@Controller
@RequestMapping("/")
public class CustomersController
{

    @Resource(name = "customersFacade")
    private CustomersFacade customersFacade;


    @RequestMapping(value = "/customerData")
    public String getAllCustomersData(Model model)
    {
       List<CustomersData> dataList= customersFacade.getAllCustomerSData();
       model.addAttribute("allCustomers",dataList);
       return ControllerConstants.Views.Pages.Customers.AllCustomers;
    }

    @RequestMapping(value = "/customersData")
    public String getCustomersData(Model model)
    {
        List<CustomersData> dataList1= customersFacade.getAllCustomerS();
        model.addAttribute("Customers",dataList1);
        return ControllerConstants.Views.Pages.Customers.Customers;
    }


}
