package com.camon.repositories;

import org.springframework.data.repository.Repository;

import java.io.Serializable;

/**
 * Created by jooyong on 2016-02-25.
 */
public interface CrudRepository<T, ID extends Serializable>
        extends Repository<T, ID> {

    <S extends T> S save(S entity);

    T findOne(ID primaryKey);

    Iterable<T> findAll();

    Long count();

    void delete(T entity);

    boolean exists(ID primaryKey);

    // … more functionality omitted.
}