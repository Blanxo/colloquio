package com.colloquio.service;

import com.colloquio.model.User;

import java.util.List;

public interface UserService {

    User create(User city) throws Exception;

    public List<User> getAll();

    User getByUsername(String username) throws Exception;
}
