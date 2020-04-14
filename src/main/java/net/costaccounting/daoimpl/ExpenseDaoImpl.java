package net.costaccounting.daoimpl;

import net.costaccounting.dao.ExpenseDao;
import net.costaccounting.model.Expense;
import net.costaccounting.model.ExpenseKind;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;



@Repository
public class ExpenseDaoImpl implements ExpenseDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExpenseDaoImpl.class);

    @Override
    public Expense insert(Expense expense, ExpenseKind expenseKind) {
        return null;
    }

    @Override
    public Expense getById(int id) {
        return null;
    }

    @Override
    public Expense update(Expense expense) {
        return null;
    }

    @Override
    public void delete(Expense expense) {

    }

    @Override
    public Expense getByParams(ExpenseKind expenseKind, LocalDate localDate) {
        return null;
    }
}
