package com.onotation.onotation.service;

import org.springframework.stereotype.Service;

@Service
public class MainService {

    public void executeProcess () {

        // Constant Time Algorithm
        System.out.println("");

        // Logarithmic Time Algorithm
        for (int x=0; x < 10; x+=2) {
        }

        // Linear Time Algorithm
        for (int x=0; x < 10; x++) {
        }

        // N Log N Time Algorithm
        for (int x=0; x < 10; x++) {
            for (int y=0; y < 10; y+=2) {
            }
        }

        // Polynomial Time Algorithm
        for (int x=0; x < 10; x++) {
            for (int y=0; y < 10; y++) {  
            }
        }

        // Exponential Time Algorithm
        for (int x=0; x < Math.pow(2, 2); x++) {
        }

        // Factorial Time Algorithm
        for (int x=0; x < factorial(4); x++) {
        }
    }

    private int factorial (int number) {
        int product = number;

        for (int x=number; x > 1; x--) {
            product = product * (x-1);
        }

        return product;
    }
    
}
