package com.camon.service;

import com.camon.domain.User;
import com.camon.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jooyong on 2016-02-25.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public List<User> findByLastname(String lastname) {
        return userRepository.findByLastname(lastname);
    }

}
