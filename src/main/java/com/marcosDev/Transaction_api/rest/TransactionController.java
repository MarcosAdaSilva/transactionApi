package com.marcosDev.Transaction_api.rest;

import com.marcosDev.Transaction_api.domain.dtos.TransactionDto;
import com.marcosDev.Transaction_api.domain.entity.Transaction;
import com.marcosDev.Transaction_api.services.TransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping
    public ResponseEntity<Transaction> save(@RequestBody TransactionDto transactionDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(transactionService.save(transactionDto));
    }

    @GetMapping
    public ResponseEntity<List<Transaction>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(transactionService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Transaction> findById(@PathVariable("id") UUID id) {
        return ResponseEntity.status(HttpStatus.OK).body(transactionService.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Transaction> findById(@PathVariable("id") UUID id, @RequestBody TransactionDto transactionDto) {
        return ResponseEntity.status(HttpStatus.OK).body(transactionService.update(id, transactionDto));
    }

}
