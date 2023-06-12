package com.colloquio.service.impl;

import com.colloquio.repository.UserRepository;
import com.colloquio.model.User;
import com.colloquio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User create(User user) throws Exception {
        Optional<User> findUser = Optional.ofNullable(repository.findUserByUsername(user.getUsername()));
        if (findUser.isPresent()) {
            throw new Exception("L'utente esiste già");
        }
        repository.insert(user);
        return user;
    }

    @Override
    public List<User> getAll() {
        return repository.findAll();
    }

    @Override
    public User getByUsername(String username) throws Exception {
        Optional<User> findUser = Optional.ofNullable(repository.findUserByUsername(username));
        if (!findUser.isPresent()) {
            throw new Exception("Utente non presente");
        }
        return findUser.get();
    }
}
