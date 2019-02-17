package net.costaccounting.model;

import java.time.LocalDate;
import java.util.Objects;

public class Expense {
    private int expenseId;
    private Float expense;
    private ExpenseKind expenseKind;
    private LocalDate localDate;


    public Expense(int expenseId, Float expense, ExpenseKind expenseKind, LocalDate localDate) {
        this.expenseId = expenseId;
        this.expense = expense;
        this.expenseKind = expenseKind;
        this.localDate = localDate;
    }

    public Expense(Float expense, ExpenseKind expenseKind, LocalDate localDate) {
        this.expense = expense;
        this.expenseKind = expenseKind;
        this.localDate = localDate;
    }

    public Expense(Float expense, LocalDate localDate) {
        this.expense = expense;
        this.localDate = localDate;
    }

    public int getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(int expenseId) {
        this.expenseId = expenseId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Expense)) return false;
        Expense expense1 = (Expense) o;
        return getExpenseId() == expense1.getExpenseId() &&
                Objects.equals(getExpense(), expense1.getExpense()) &&
                Objects.equals(getExpenseKind(), expense1.getExpenseKind()) &&
                Objects.equals(getLocalDate(), expense1.getLocalDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getExpenseId(), getExpense(), getExpenseKind(), getLocalDate());
    }
}
