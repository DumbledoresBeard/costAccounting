package net.costaccounting.model;

import java.time.LocalDate;
import java.util.Objects;

public class Expense {
    private int id;
    private Float expense;
    private ExpenseKind expenseKind;
    private LocalDate localDate;


    public Expense(int id, Float expense, ExpenseKind expenseKind, LocalDate localDate) {
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return getId() == expense1.getId() &&
                Objects.equals(getExpense(), expense1.getExpense()) &&
                Objects.equals(getExpenseKind(), expense1.getExpenseKind()) &&
                Objects.equals(getLocalDate(), expense1.getLocalDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getExpense(), getExpenseKind(), getLocalDate());
    }
}
