package com.camon.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by jooyong on 2016-02-25.
 */
@Data
@Document
public class User {

    @Field
    private String firstname;

    @Field
    private String lastname;
}
