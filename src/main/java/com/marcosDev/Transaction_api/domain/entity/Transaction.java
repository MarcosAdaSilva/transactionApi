package com.marcosDev.Transaction_api.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "tb_transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID transactionId;

    @Column
    private BigDecimal total;

    @Column
    private LocalDateTime createdAt;

    @Column
    private String cardNumber;

    @Column
    private String cvv;

    @Column
    private String owner;

    @Column
    private String ein;

}
