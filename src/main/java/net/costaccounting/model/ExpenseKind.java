package net.costaccounting.model;

import java.util.Objects;

public class ExpenseKind {
    private int expenseKindId;
    private String expenseName;

    public ExpenseKind(int expenseKindId, String expenseName) {
        this.expenseKindId = expenseKindId;
        this.expenseName = expenseName;
    }

    public int getExpenseKindId() {
        return expenseKindId;
    }

    public void setExpenseKindId(int expenseKindId) {
        this.expenseKindId = expenseKindId;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExpenseKind)) return false;
        ExpenseKind that = (ExpenseKind) o;
        return getExpenseKindId() == that.getExpenseKindId() &&
                Objects.equals(getExpenseName(), that.getExpenseName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getExpenseKindId(), getExpenseName());
    }
}
