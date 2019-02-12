package net.costaccounting.dto;

import net.costaccounting.model.ExpenseKind;
import net.costaccounting.model.SumOfExpenses;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class ExpenseDtoResponse {
    private Float expense;
    private ExpenseKind expenseKind;
    private LocalDate localDate;
    private SumOfExpenses sumOfExpenses;

    public ExpenseDtoResponse () {}

    public ExpenseDtoResponse(Float expense, ExpenseKind expenseKind, LocalDate localDate) {
        this.expense = expense;
        this.expenseKind = expenseKind;
        this.localDate = localDate;
    }

    public Float getExpense() {
        return expense;
    }

    public void setExpense(Float expense) {
        this.expense = expense;
    }

    public ExpenseKind getExpenseKind() {
        return expenseKind;
    }

    public void setExpenseKind(ExpenseKind expenseKind) {
        this.expenseKind = expenseKind;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
