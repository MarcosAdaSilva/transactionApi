package com.marcosDev.Transaction_api.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_transactions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "transaction_id")
    private UUID id;

    @Column(name = "total", nullable = false)
    private BigDecimal total;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "card_number", nullable = false)
    @JsonIgnore
    private String cardNumber;

    @Column(name = "cvv", nullable = false)
    @JsonIgnore
    private String cvv;

    @Column(name = "owner", nullable = false)
    private String owner;

    @Column(name = "ein", nullable = false)
    private String ein;
}