package com.example.demo;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Endpoint(id = "customstatus")
public class CustomStatusEndpoint {

    @ReadOperation
    public Map<String, String> customStatus() {
        return Map.of("app-status", "running", "author", "Ciccio");
    }
}
