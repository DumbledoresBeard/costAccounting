package net.costaccounting.service;

import net.costaccounting.dao.ExpenseDao;
import net.costaccounting.dao.ExpenseKindDao;
import net.costaccounting.dao.SettingsDao;
import net.costaccounting.dao.SumOfExpensesDao;
import net.costaccounting.dto.ExpenseDtoRequest;
import net.costaccounting.dto.ExpenseKindDtoRequest;
import net.costaccounting.model.Expense;
import net.costaccounting.model.ExpenseKind;
import net.costaccounting.model.Settings;
import net.costaccounting.model.SumOfExpenses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CostAccountingService {

    @Autowired
    private ExpenseDao expenseDao;
   @Autowired
    private ExpenseKindDao expenseKindDao;
   @Autowired
   private SettingsDao settingsDao;
   @Autowired
   private SumOfExpensesDao sumOfExpensesDao;


    public Expense addExpense (ExpenseDtoRequest expenseDtoRequest) {
        ExpenseKind expenseKind = expenseKindDao.getByName(expenseDtoRequest.getExpenseKind());
        if (expenseDtoRequest.getLocalDate() == null) {
          expenseDtoRequest.setLocalDate(LocalDate.now());
        }
        expenseDao.insert(new Expense(expenseDtoRequest.getExpense(), expenseDtoRequest.getLocalDate()), expenseKind);
        /*Settings settings = settingsDao.getById(1);
        if (settings.isAutoCounting()) {

        }*/


        return new Expense(expenseDtoRequest.getExpense(), expenseKind, expenseDtoRequest.getLocalDate());
    }

    public ExpenseKind addExpenseKind (ExpenseKindDtoRequest expenseKindDtoRequest) {
        expenseKindDao.insert(new ExpenseKind(expenseKindDtoRequest.getExpenseName(),
                expenseKindDtoRequest.getIsRegular()));
        return new ExpenseKind(expenseKindDtoRequest.getExpenseName(),
                expenseKindDtoRequest.getIsRegular());
    }

    public SumOfExpenses countSumOfExpenses (Expense expense, Settings settings) {
       SumOfExpenses sumOfExpenses = sumOfExpensesDao.getByExpenseKindId(expense.getExpenseKind().getExpenseKindId());
       if (sumOfExpenses == null) {
          sumOfExpensesDao.insert(new SumOfExpenses(expense.getExpenseKind(), expense.getExpense(), settings.getPeriodStartDate(),
                  settings.getPeriodEndDate()), expense.getExpenseKind());
       }
        return null;
    }

    public Settings getSettings () {
       return settingsDao.getById(1);
    }

}
