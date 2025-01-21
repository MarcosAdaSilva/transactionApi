package com.marcosDev.Transaction_api.services;

import com.marcosDev.Transaction_api.repository.UsersRepository;

public class UsersServiceImpl implements UsersService{

    private final UsersRepository usersRepository;

    public UsersServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }
}
