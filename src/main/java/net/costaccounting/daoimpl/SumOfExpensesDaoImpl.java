package net.costaccounting.daoimpl;

import net.costaccounting.dao.SumOfExpensesDao;
import net.costaccounting.mappers.SumOfExpensesMapper;
import net.costaccounting.model.ExpenseKind;
import net.costaccounting.model.SumOfExpenses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

public class SumOfExpensesDaoImpl implements SumOfExpensesDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(SumOfExpensesDaoImpl.class);
    @Autowired
    private SumOfExpensesMapper sumOfExpensesMapper;

    @Override
    @Transactional
    public SumOfExpenses insert (SumOfExpenses sumOfExpenses, ExpenseKind expenseKind) {
        LOGGER.debug("DAO insert sum of expenses {}", sumOfExpenses);
        sumOfExpensesMapper.insert(sumOfExpenses, expenseKind);
        return sumOfExpenses;

    }

    @Override
    public SumOfExpenses getByExpenseKindId(int expenseKindId) {
        LOGGER.debug("DAO get sum of expenses by expense kind id{}", expenseKindId);
        SumOfExpenses sumOfExpenses = sumOfExpensesMapper.getByExpenseKindId(expenseKindId);
        return sumOfExpenses;
    }


}
