package net.costaccounting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class CostAccounting {
    public static void main (String args []) {
        SpringApplication.run(CostAccounting.class, args);
    }

}
