package it.develhope.deploy02.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {

    @GetMapping("/sum")
    public int mainEndpoint() {
        // Generate random number
        int SIDES = 10;
        int a = 1 + (int) (Math.random() * SIDES);
        int b = 1 + (int) (Math.random() * SIDES);
        int sum = a + b;
        return sum;

    }
}
