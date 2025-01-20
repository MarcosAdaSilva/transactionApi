package com.marcosDev.Transaction_api.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID transactionId;

    @Column(nullable = false)
    private BigDecimal total;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    @JsonIgnore
    private String cardNumber;

    @Column(nullable = false)
    @JsonIgnore // Adicionado JsonIgnore para o CVV por segurança
    private String cvv;

    @Column(nullable = false)
    private String owner;

    @Column(nullable = false)
    private String ein;
}
