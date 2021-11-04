package com.qucoon.bbspaymentservicesb.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddPaymentLocalResult {

    private Integer CorporateCode;

    private String BatchReference;

    private String AccountNo;

    private int StatusCode;

    private String PaymentDescription;

}
