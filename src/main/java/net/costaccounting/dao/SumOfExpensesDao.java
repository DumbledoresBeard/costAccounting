package net.costaccounting.dao;

import net.costaccounting.model.ExpenseKind;
import net.costaccounting.model.SumOfExpenses;

import java.time.LocalDate;

public interface SumOfExpensesDao {

    SumOfExpenses insert (SumOfExpenses sumOfExpenses, ExpenseKind expenseKind);

    SumOfExpenses getByExpenseKindId (int expenseKindId);


}
