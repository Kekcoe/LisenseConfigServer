package com.optimagrowth.lisenseconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class LisenseConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LisenseConfigServerApplication.class, args);
    }

}
