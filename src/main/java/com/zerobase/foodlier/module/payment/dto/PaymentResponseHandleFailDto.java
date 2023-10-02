package com.zerobase.foodlier.module.payment.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentResponseHandleFailDto {
    String errorCode;
    String errorMsg;
    String orderId;
}
