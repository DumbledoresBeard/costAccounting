package net.costaccounting.dto;

import net.costaccounting.model.ExpenseKind;
import net.costaccounting.model.SumOfExpenses;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class ExpenseDtoResponse {
    private Float expense;
    private String expenseKind;
    private LocalDate localDate;
    private SumOfExpenses sumOfExpenses;

    public ExpenseDtoResponse () {}

    public ExpenseDtoResponse(Float expense, String expenseKind, LocalDate localDate) {
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

    public String getExpenseKind() {
        return expenseKind;
    }

    public void setExpenseKind(String expenseKind) {
        this.expenseKind = expenseKind;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public SumOfExpenses getSumOfExpenses() {
        return sumOfExpenses;
    }

    public void setSumOfExpenses(SumOfExpenses sumOfExpenses) {
        this.sumOfExpenses = sumOfExpenses;
    }
}
