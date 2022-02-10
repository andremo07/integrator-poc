package com.frwk.salesforce.integrator;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.core.MongoTemplate;


@Configuration
@EnableMongoAuditing
public class MongoConfig {

    @Value(value = "${mongo.database}")
    private String database;

    @Value(value = "${mongo.replicaset}")
    private String replicaSet;

    @Value(value = "${mongo.uri}")
    private String uri;

    @Value(value = "${mongo.user}")
    private String user;

    @Value(value = "${mongo.password}")
    private String password;

    @Bean
    public MongoClient mongo() {
        ConnectionString connectionString = new ConnectionString( String.format("mongodb://%s/%s?replicaSet=%s",uri,database,replicaSet));
        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .credential(MongoCredential.createCredential(user,database,password.toCharArray()))
                .build();

        return MongoClients.create(mongoClientSettings);
    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongo(), database);
    }
}
