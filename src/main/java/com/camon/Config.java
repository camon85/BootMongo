package com.camon;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by jooyong on 2016-02-25.
 */
@Configuration
//@EnableJpaRepositories("com.camon.repositories")
@EnableMongoRepositories
public class Config {

}
