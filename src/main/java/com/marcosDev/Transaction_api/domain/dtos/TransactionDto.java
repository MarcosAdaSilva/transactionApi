package com.marcosDev.Transaction_api.domain.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TransactionDto {
    UUID id;
    BigDecimal total;
    LocalDateTime createdAt;
    String cardNumber;
    String cvv;
    String owner;
    String ein;
}