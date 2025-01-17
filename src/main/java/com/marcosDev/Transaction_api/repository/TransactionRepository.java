package com.marcosDev.Transaction_api.repository;

import com.marcosDev.Transaction_api.domain.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TransactionRepository extends JpaRepository<Transaction, UUID> {
}
