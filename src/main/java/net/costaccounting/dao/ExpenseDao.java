package net.costaccounting.dao;

import net.costaccounting.model.Expense;
import net.costaccounting.model.ExpenseKind;

import java.time.LocalDate;

public interface ExpenseDao {

    public Expense insert(Expense expense, ExpenseKind expenseKind);

    public Expense getById(int id);

    public Expense update(Expense expense);

    void delete (Expense expense);

    public Expense getByParams(ExpenseKind expenseKind, LocalDate localDate);


}
