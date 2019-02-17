package net.costaccounting.service;

import net.costaccounting.dao.ExpenseDao;
import net.costaccounting.dao.ExpenseKindDao;
import net.costaccounting.dao.SettingsDao;
import net.costaccounting.daoimpl.ExpenseDaoImpl;
import net.costaccounting.daoimpl.ExpenseKindDaoImpl;
import net.costaccounting.daoimpl.SettingsDaoImpl;
import net.costaccounting.dto.ExpenseDtoRequest;
import net.costaccounting.dto.ExpenseKindDtoRequest;
import net.costaccounting.model.Expense;
import net.costaccounting.model.ExpenseKind;
import net.costaccounting.model.Settings;
import net.costaccounting.utils.MyBatisUtils;

public class CostAccountingService {

    private ExpenseDao expenseDao;
    private ExpenseKindDao expenseKindDao = new ExpenseKindDaoImpl();
    private SettingsDao settingsDao;


    public Expense addExpense (ExpenseDtoRequest expenseDtoRequest) {
        ExpenseKind expenseKind = expenseKindDao.getByName(expenseDtoRequest.getExpenseKind());
        expenseDao.insert(new Expense(expenseDtoRequest.getExpense(),
                     expenseDtoRequest.getLocalDate()), expenseKind);
        /*Settings settings = settingsDao.getById(1);
        if (settings.isAutoCounting()) {

        }*/


        return new Expense(expenseDtoRequest.getExpense(), expenseKind, expenseDtoRequest.getLocalDate());
    }

    public ExpenseKind addExpenseKind (ExpenseKindDtoRequest expenseKindDtoRequest) {
        expenseKindDao.insert(new ExpenseKind(expenseKindDtoRequest.getExpenseName(),
                expenseKindDtoRequest.isReqular()));
        return new ExpenseKind(expenseKindDtoRequest.getExpenseName(),
                expenseKindDtoRequest.isReqular());
    }

}
