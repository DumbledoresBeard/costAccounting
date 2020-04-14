package net.costaccounting;

import net.costaccounting.dao.ExpenseDao;
import net.costaccounting.dao.ExpenseKindDao;
import net.costaccounting.dao.SettingsDao;
import net.costaccounting.dao.SumOfExpensesDao;
import net.costaccounting.daoimpl.ExpenseDaoImpl;
import net.costaccounting.daoimpl.ExpenseKindDaoImpl;
import net.costaccounting.daoimpl.SettingsDaoImpl;
import net.costaccounting.daoimpl.SumOfExpensesDaoImpl;
import net.costaccounting.model.Settings;
import net.costaccounting.service.CostAccountingService;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
public class CostAccountingConfig {

    @Bean
    public ExpenseDao expenseDao() {
        return new ExpenseDaoImpl();
    }

    @Bean
    public ExpenseKindDao expenseKindDao () {
        return new ExpenseKindDaoImpl();
    }

    @Bean
    public SettingsDao settingsDao () {return  new SettingsDaoImpl();
    }

    @Bean
    public SumOfExpensesDao sumOfExpensesDao () {return  new SumOfExpensesDaoImpl();
    }

    @Bean
    public Settings getSettings (CostAccountingService costAccountingService) {
        return costAccountingService.getSettings();
    }
}
