package net.costaccounting;

import net.costaccounting.daoimpl.ExpenseDaoImpl;
import net.costaccounting.utils.MyBatisUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CostAccountingConfig {

    @Bean
    public ExpenseDaoImpl expenseDao() {
        return new ExpenseDaoImpl();
    }

}
