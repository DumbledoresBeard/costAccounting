package net.costaccounting;

import net.costaccounting.daoimpl.ExpenseDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CostAccountingConfig {

    @Bean
    public ExpenseDaoImpl expenseDao() {
        return new ExpenseDaoImpl();
    }


}
