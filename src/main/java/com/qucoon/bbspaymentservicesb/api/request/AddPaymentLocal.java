package com.qucoon.bbspaymentservicesb.api.request;

import com.qucoon.bbspaymentservicesb.model.PaymentTransactionLocal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddPaymentLocal {

    private List<PaymentTransactionLocal> PaymentTransactions;

    private String CorporateCode;

    private String Currency;

    private String SingleDebitNarration;

    private Integer EnableSingleDigit = 0;

    private Date DatePay;

    private Integer TotalTransactions;

    private String SourceAccount;

    private Double Amount;

    private Integer PaymentMethodId;

    private Integer PaymentTypeId;

    private String BatchReference;

    private String Username;

    private String Password;
}
