package de.hybris.trainingbala.core.customHook;

import de.hybris.platform.commerceservices.order.CommerceCartModification;
import de.hybris.platform.commerceservices.order.CommerceCartModificationException;
import de.hybris.platform.commerceservices.order.hook.CommerceAddToCartMethodHook;
import de.hybris.platform.commerceservices.service.data.CommerceCartParameter;
import de.hybris.platform.core.model.product.ProductModel;
import org.apache.log4j.Logger;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNullStandardMessage;

public class SoldProductAddToCartMethodHook  implements CommerceAddToCartMethodHook {


  private Logger log=Logger.getLogger("SoldProductAddToCartMethodHook");

    @Override
    public void beforeAddToCart(CommerceCartParameter parameters) throws CommerceCartModificationException {

        validateParameterNotNullStandardMessage("parameter", parameters);
            final ProductModel productModel = parameters.getProduct();
        log.info("SoldProductAddToCartMethodHook,  is called...");
            if (productModel.getCanBeSold()==false) {
                  log.info("SoldProductAddToCartMethodHook, can be sold attribute is false...");

                throw  new CommerceCartModificationException("can be sold should be true");

            }
        }

            @Override
            public void afterAddToCart (CommerceCartParameter parameters, CommerceCartModification result) throws
            CommerceCartModificationException {

            }

        }


