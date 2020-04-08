package com.ddavydov.bugtrackeraccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BugTrackerAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(BugTrackerAccountApplication.class, args);
    }

}
