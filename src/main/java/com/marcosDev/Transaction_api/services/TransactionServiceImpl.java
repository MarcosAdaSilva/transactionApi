package com.marcosDev.Transaction_api.services;

import com.marcosDev.Transaction_api.domain.dtos.TransactionDto;
import com.marcosDev.Transaction_api.domain.entity.Transaction;
import com.marcosDev.Transaction_api.repository.TransactionRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public Transaction save(TransactionDto transactionDto) {
        Transaction transaction = new Transaction();
        BeanUtils.copyProperties(transactionDto, transaction);
        return transactionRepository.save(transaction);
    }

    @Override
    public List<Transaction> findAll() {
        return transactionRepository.findAll();
    }


    @Override
    public Transaction findById(UUID id) {
        return transactionRepository.findById(id).get();
    }

    @Override
    public Transaction update(UUID id, TransactionDto transactionDto) {
        Optional<Transaction> transaction = transactionRepository.findById(id);
        if (transaction.isPresent()) {
            throw new RuntimeException("Transaction not found");
        }
        BeanUtils.copyProperties(transactionDto, transaction.get());
        return transactionRepository.save(transaction.get());
    }


}
