package com.camon.controller;

import com.camon.domain.User;
import com.camon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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


    @RequestMapping(value = "/dummy", method = RequestMethod.GET)
    public int dummy(@RequestParam(defaultValue = "100") int count) {
        List<User> users = new ArrayList<>();

        int i = 0;
        for ( ; i < count; i++) {
            User user = new User();
            String uuid = UUID.randomUUID().toString();
            user.setFirstname(uuid);
            user.setLastname(uuid);

            users.add(user);
        }

        userService.save(users);

        return users.size();
    }
}
