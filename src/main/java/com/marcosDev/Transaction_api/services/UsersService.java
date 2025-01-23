package com.marcosDev.Transaction_api.services;

import com.marcosDev.Transaction_api.domain.dtos.TransactionDto;
import com.marcosDev.Transaction_api.domain.dtos.UsersDto;
import com.marcosDev.Transaction_api.domain.entity.Transaction;
import com.marcosDev.Transaction_api.domain.entity.Users;
import jakarta.validation.Valid;

import java.util.List;
import java.util.UUID;


public interface UsersService {
    List<Users> findAll();
    Users save(UsersDto usersDto);
    Users findById(UUID id);
    Users update(UUID id, UsersDto usersDto);

    void Users(@Valid UsersDto usersDto);
}
