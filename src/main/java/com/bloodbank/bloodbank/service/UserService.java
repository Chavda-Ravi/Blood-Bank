package com.bloodbank.bloodbank.service;

import com.bloodbank.bloodbank.entity.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    User updateUser(Long id, User user);

    void deleteUser(Long id);

    User getByUsername(String username);
}