package net.costaccounting;

import net.costaccounting.daoimpl.ExpenseDaoImpl;
import net.costaccounting.daoimpl.ExpenseKindDaoImpl;
import net.costaccounting.service.CostAccountingService;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import net.costaccounting.utils.MyBatisUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan("net.costaccounting.mappers")
public class CostAccountingConfig {

    @Bean
    public ExpenseDaoImpl expenseDao() {
        return new ExpenseDaoImpl();
    }

    @Bean
    public CostAccountingService costAccountingService () {
        return new CostAccountingService();
    }

    @Bean
    public ExpenseKindDaoImpl expenseKindDao () {
        return new ExpenseKindDaoImpl();
    }

    @Bean
    public DataSource getDataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/costaccounting?useUnicode=yes&characterEncoding=UTF8&useSSL=false&serverTimezone=Asia/Omsk");
        dataSource.setUsername("root");
        dataSource.setPassword("lifeli349");
        return dataSource;
    }

    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(getDataSource());
    }
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(getDataSource());
        return sessionFactory.getObject();
    }
}
