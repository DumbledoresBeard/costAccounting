package net.costaccounting.dao;

import net.costaccounting.model.ExpenseKind;

public interface ExpenseKindDao {

    ExpenseKind getByName (String name);

    ExpenseKind insert(ExpenseKind expenseKind);
}
