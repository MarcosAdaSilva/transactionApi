package com.marcosDev.Transaction_api.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDto {
    private BigDecimal total;
    private LocalDateTime createdAt;
    private String cardNumber;
    private String cvv;
    private String owner;
    private String ein;
}