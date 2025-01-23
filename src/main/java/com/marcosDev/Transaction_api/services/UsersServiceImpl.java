package com.marcosDev.Transaction_api.services;

import com.marcosDev.Transaction_api.domain.dtos.UsersDto;
import com.marcosDev.Transaction_api.domain.entity.Users;
import com.marcosDev.Transaction_api.repository.UsersRepository;

import java.util.List;
import java.util.UUID;

public class UsersServiceImpl implements UsersService{

    private final UsersRepository usersRepository;

    public UsersServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public List<Users> findAll() {
        return List.of();
    }

    @Override
    public Users save(UsersDto usersDto) {
        return null;
    }

    @Override
    public Users findById(UUID id) {
        return null;
    }

    @Override
    public Users update(UUID id, UsersDto usersDto) {
        return null;
    }

    @Override
    public void Users(UsersDto usersDto) {

    }
}
