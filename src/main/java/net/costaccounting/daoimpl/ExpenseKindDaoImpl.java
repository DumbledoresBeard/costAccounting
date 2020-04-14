package net.costaccounting.daoimpl;

import net.costaccounting.dao.ExpenseKindDao;
import net.costaccounting.model.ExpenseKind;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ExpenseKindDaoImpl implements ExpenseKindDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExpenseKindDaoImpl.class);


    @Override
    public ExpenseKind getByName(String name) {
        return null;
    }

    @Override
    public ExpenseKind insert(ExpenseKind expenseKind) {
        return null;
    }
}
