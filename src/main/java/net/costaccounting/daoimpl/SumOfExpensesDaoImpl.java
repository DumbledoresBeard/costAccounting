package net.costaccounting.daoimpl;

import net.costaccounting.dao.SumOfExpensesDao;
import net.costaccounting.model.ExpenseKind;
import net.costaccounting.model.SumOfExpenses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SumOfExpensesDaoImpl implements SumOfExpensesDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(SumOfExpensesDaoImpl.class);


    @Override
    public SumOfExpenses insert(SumOfExpenses sumOfExpenses, ExpenseKind expenseKind) {
        return null;
    }

    @Override
    public SumOfExpenses getByExpenseKindId(int expenseKindId) {
        return null;
    }
}
