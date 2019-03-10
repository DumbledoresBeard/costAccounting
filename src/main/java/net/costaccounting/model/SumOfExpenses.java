package net.costaccounting.model;

import java.time.LocalDate;
import java.util.Objects;

public class SumOfExpenses {
    private int id;
    private ExpenseKind expenseKind;
    private Float sumOfExpenses;
    private LocalDate startDate;
    private LocalDate endDate;


    public SumOfExpenses(int id, ExpenseKind expenseKind, Float sumOfExpenses, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.expenseKind = expenseKind;
        this.sumOfExpenses = sumOfExpenses;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public SumOfExpenses(ExpenseKind expenseKind, Float sumOfExpenses, LocalDate startDate, LocalDate endDate) {
        this.expenseKind = expenseKind;
        this.sumOfExpenses = sumOfExpenses;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SumOfExpenses)) return false;
        SumOfExpenses that = (SumOfExpenses) o;
        return id == that.id &&
                Objects.equals(getExpenseKind(), that.getExpenseKind()) &&
                Objects.equals(getSumOfExpenses(), that.getSumOfExpenses());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getExpenseKind(), getSumOfExpenses());
    }
}
