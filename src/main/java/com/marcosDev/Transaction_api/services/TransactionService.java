package com.marcosDev.Transaction_api.services;

import com.marcosDev.Transaction_api.domain.dtos.TransactionDto;
import com.marcosDev.Transaction_api.domain.entity.Transaction;

import java.util.List;
import java.util.UUID;

public interface TransactionService {
    List<Transaction> findAll();
    Transaction save(TransactionDto transactionDto);
    Transaction findById(UUID id);
    Transaction update(UUID id, TransactionDto transactionDto);
}