package com.colloquio.service.impl;

import com.colloquio.mapper.UserRepository;
import com.colloquio.model.User;
import com.colloquio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;


    @Override
    public List<User> getAll() {
        return repository.findAll();
    }
}
