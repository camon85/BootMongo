package com.camon.controller;

import com.camon.domain.User;
import com.camon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by jooyong on 2016-02-25.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<User> findAll() {
        return userService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @RequestMapping(value = "/{lastname}", method = RequestMethod.GET)
    public List<User> findByLastname(@PathVariable String lastname) {
        return userService.findByLastname(lastname);
    }

}
