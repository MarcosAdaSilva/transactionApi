package com.marcosDev.Transaction_api.services;

import com.marcosDev.Transaction_api.domain.dtos.TransactionDto;
import com.marcosDev.Transaction_api.domain.entity.Transaction;
import com.marcosDev.Transaction_api.repository.TransactionRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class TransactionServiceImpl implements TransactionService {
    private final TransactionRepository transactionRepository;

    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    @Transactional
    public Transaction save(TransactionDto transactionDto) {
        Transaction transaction = new Transaction();
        BeanUtils.copyProperties(transactionDto, transaction);
        return transactionRepository.save(transaction);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Transaction> findAll() {
        return transactionRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Transaction findById(UUID id) {
        return transactionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Transaction not found with id: " + id));
    }

    @Override
    @Transactional
    public Transaction update(UUID id, TransactionDto transactionDto) {
        Transaction transaction = findById(id);
        BeanUtils.copyProperties(transactionDto, transaction);
        transaction.setId(id);
        return transactionRepository.save(transaction);
    }
}