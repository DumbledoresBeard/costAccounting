package net.costaccounting.daoimpl;

import net.costaccounting.dao.ExpenseKindDao;
import net.costaccounting.mappers.ExpenseKindMapper;
import net.costaccounting.model.ExpenseKind;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;



@Transactional
public class ExpenseKindDaoImpl implements ExpenseKindDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExpenseKindDaoImpl.class);

    @Autowired
    private ExpenseKindMapper expenseKindMapper;

    @Override
    @Transactional
    public ExpenseKind getByName(String name) {
        LOGGER.debug("DAO get ExpenseKind by Name {}", name);

            return expenseKindMapper.getByName(name);
    }

    @Override
    @Transactional
    public ExpenseKind insert(ExpenseKind expenseKind) {
        LOGGER.debug("DAO insert expense {}", expenseKind);
        expenseKindMapper.insert(expenseKind);
        return expenseKind;


    }


}
