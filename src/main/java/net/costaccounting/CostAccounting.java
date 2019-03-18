package net.costaccounting;

import net.costaccounting.mappers.ExpenseKindMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
@MapperScan("net.costaccounting.mappers")
public class CostAccounting {
    public static void main (String args []) {
        SpringApplication.run(CostAccounting.class, args);

    }

}
