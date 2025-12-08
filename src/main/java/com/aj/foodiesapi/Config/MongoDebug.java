package com.aj.foodiesapi.Config;

import org.springframework.stereotype.Component;

@Component
public class MongoDebug {
    public MongoDebug(org.springframework.core.env.Environment env) {
        String uri = env.getProperty("spring.data.mongodb.uri");
        System.out.println(">>> MONGO URI = " + uri);
    }
}
