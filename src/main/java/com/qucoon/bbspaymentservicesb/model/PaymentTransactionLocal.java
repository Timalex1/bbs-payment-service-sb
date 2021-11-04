package com.qucoon.bbspaymentservicesb.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PaymentTransactionLocal {
    
    private String DestinationBankCode;

    private String Beneficiary;

    private Integer AccountNumber;

    private Double Amount;

    private String Narration;

    private Date ValueDate;

    private String TransactionReference;

    private String BeneficiaryEmail;

    private Integer BeneficiaryPhone;

}
