package net.costaccounting.service;

import net.costaccounting.dao.ExpenseDao;
import net.costaccounting.daoimpl.ExpenseDaoImpl;
import net.costaccounting.dto.ExpenseDtoRequest;
import net.costaccounting.model.Expense;

public class CostAccountingService {

    private ExpenseDao expenseDaoImpl;


    public Expense addExpense (ExpenseDtoRequest expenseDtoRequest) {
            expenseDaoImpl.insert(new Expense(expenseDtoRequest.getExpense(),
                    expenseDtoRequest.getExpenseKind(), expenseDtoRequest.getLocalDate()),
                    expenseDtoRequest.getExpenseKind());


        return null;
    }

}
