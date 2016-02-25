package com.camon;

import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.net.UnknownHostException;

/**
 * Created by jooyong on 2016-02-25.
 */
@Configuration
//@EnableJpaRepositories("com.camon.repositories")
@EnableMongoRepositories
public class Config {

    @Value("${spring.data.mongodb.host}")
    private String mongodbHost;

    @Value("${spring.data.mongodb.port}")
    private int mongodbPort;

    @Value("${spring.data.mongodb.database}")
    private String mongodbDatabase;

    @Bean
    public MongoDbFactory mongoDbFactory() throws UnknownHostException {
        return new SimpleMongoDbFactory(new MongoClient(mongodbHost, mongodbPort), mongodbDatabase);
    }

    @Bean
    public MongoTemplate mongoTemplate() throws UnknownHostException {
        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());

        return mongoTemplate;

    }

}
