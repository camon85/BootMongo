package com.camon.repositories;

import com.camon.domain.User;

import java.util.List;

/**
 * Created by jooyong on 2016-02-25.
 */
public interface UserRepository extends CrudRepository<User, Long> {

    Long countByLastname(String lastname);

    Long deleteByLastname(String lastname);

    List<User> removeByLastname(String lastname);

    List<User> findByLastname(String lastname);
}