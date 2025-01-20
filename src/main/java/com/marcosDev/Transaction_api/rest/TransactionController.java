package com.marcosDev.Transaction_api.rest;

import com.marcosDev.Transaction_api.domain.dtos.TransactionDto;
import com.marcosDev.Transaction_api.domain.entity.Transaction;
import com.marcosDev.Transaction_api.services.TransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/transactions")  // Melhor prática para versionamento da API
public class TransactionController {
    private static final Logger logger = LoggerFactory.getLogger(TransactionController.class);
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping
    public ResponseEntity<Transaction> save(@RequestBody TransactionDto transactionDto) {
        logger.info("Iniciando criação de nova transação");
        Transaction transaction = transactionService.save(transactionDto);
        logger.info("Transação criada com sucesso. ID: {}", transaction.getTransactionId());
        return ResponseEntity.status(HttpStatus.CREATED).body(transaction);
    }

    @GetMapping
    public ResponseEntity<List<Transaction>> findAll() {
        logger.info("Buscando todas as transações");
        return ResponseEntity.ok(transactionService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Transaction> findById(@PathVariable("id") UUID id) {
        logger.info("Buscando transação por ID: {}", id);
        return ResponseEntity.ok(transactionService.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Transaction> updateById(@PathVariable("id") UUID id, @RequestBody TransactionDto transactionDto) {
        logger.info("Atualizando transação. ID: {}", id);
        Transaction updatedTransaction = transactionService.update(id, transactionDto);
        logger.info("Transação atualizada com sucesso");
        return ResponseEntity.ok(updatedTransaction);
    }
}