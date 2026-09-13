package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() throws Exception {

        String hostname =
                InetAddress.getLocalHost().getHostName();

        return """
                Hello from Docker!

                version: 1.0
                hostname: %s
                """.formatted(hostname);
    }
}