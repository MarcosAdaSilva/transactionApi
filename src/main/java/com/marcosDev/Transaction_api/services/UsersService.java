package com.marcosDev.Transaction_api.services;

import com.marcosDev.Transaction_api.domain.dtos.UsersDto;
import jakarta.validation.Valid;


public interface UsersService {
    public void Users(@Valid UsersDto usersDto) {
    }
}
