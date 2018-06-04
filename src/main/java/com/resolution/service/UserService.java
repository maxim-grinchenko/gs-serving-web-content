package com.resolution.service;

import com.resolution.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    Optional<User> findById(long id);

//    User findBySSO(String sso);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserByID(long id);

    List<User> findAllUsers();

//    boolean isUserSSOUnique(Integer id, String sso);

}