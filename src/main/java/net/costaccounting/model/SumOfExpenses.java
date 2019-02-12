package net.costaccounting.model;

import java.util.Objects;

public class SumOfExpenses {
    private int sumOfExpensesId;
    private ExpenseKind expenseKind;
    private Float sumOfExpenses;


    public SumOfExpenses(int sumOfExpensesId, ExpenseKind expenseKind, Float sumOfExpenses) {
        this.sumOfExpensesId = sumOfExpensesId;
        this.expenseKind = expenseKind;
        this.sumOfExpenses = sumOfExpenses;
    }

    public int getSumOfExpensesId() {
        return sumOfExpensesId;
    }

    public void setSumOfExpensesId(int sumOfExpensesId) {
        this.sumOfExpensesId = sumOfExpensesId;
    }

    public ExpenseKind getExpenseKind() {
        return expenseKind;
    }

    public void setExpenseKind(ExpenseKind expenseKind) {
        this.expenseKind = expenseKind;
    }

    public Float getSumOfExpenses() {
        return sumOfExpenses;
    }

    public void setSumOfExpenses(Float sumOfExpenses) {
        this.sumOfExpenses = sumOfExpenses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SumOfExpenses)) return false;
        SumOfExpenses that = (SumOfExpenses) o;
        return getSumOfExpensesId() == that.getSumOfExpensesId() &&
                Objects.equals(getExpenseKind(), that.getExpenseKind()) &&
                Objects.equals(getSumOfExpenses(), that.getSumOfExpenses());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSumOfExpensesId(), getExpenseKind(), getSumOfExpenses());
    }
}
