package de.hybris.trainingbala.core.payment;

import de.hybris.platform.commerceservices.order.CommercePaymentAuthorizationStrategy;
import de.hybris.platform.commerceservices.order.impl.DefaultCommercePaymentAuthorizationStrategy;
import de.hybris.platform.commerceservices.service.data.CommerceCheckoutParameter;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.order.payment.PaymentInfoModel;
import de.hybris.platform.payment.dto.TransactionStatus;
import de.hybris.platform.payment.model.PaymentTransactionEntryModel;
import de.hybris.platform.payment.model.PaymentTransactionModel;


import java.util.Arrays;
import java.util.UUID;

public class CustomCommercePaymentAuthorizationStrategy extends DefaultCommercePaymentAuthorizationStrategy {


    @Override
    public PaymentTransactionEntryModel authorizePaymentAmount(CommerceCheckoutParameter parameter) {

        PaymentTransactionEntryModel paymentTransactionEntryModel = super.authorizePaymentAmount(parameter);

        final CartModel cartModel = parameter.getCart();
        final PaymentInfoModel paymentInfo = cartModel.getPaymentInfo();

        String responseCode = UUID.randomUUID().toString();
        paymentTransactionEntryModel.setResponseCode(responseCode);

        final PaymentTransactionModel paymentTransaction = paymentTransactionEntryModel.getPaymentTransaction();
        paymentTransaction.setResponseCode(responseCode);

        if (TransactionStatus.ACCEPTED.name().equals(paymentTransactionEntryModel.getTransactionStatus())
                || TransactionStatus.REVIEW.name().equals(paymentTransactionEntryModel.getTransactionStatus())) {
            paymentTransaction.setOrder(cartModel);
            paymentTransaction.setInfo(paymentInfo);
            getModelService().saveAll(cartModel, paymentTransaction);
        } else {
            // TransactionStatus is error or reject remove the PaymentTransaction and TransactionEntry
            getModelService().removeAll(Arrays.asList(paymentTransaction, paymentTransactionEntryModel));
        }

        return paymentTransactionEntryModel;

    }

}
