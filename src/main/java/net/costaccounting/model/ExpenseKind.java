package net.costaccounting.model;

import java.util.Objects;

public class ExpenseKind {
    private int expenseKindId;
    private String expenseName;
    private boolean isRegular;

    public ExpenseKind(int expenseKindId, String expenseName, boolean isRegular) {
        this.expenseKindId = expenseKindId;
        this.expenseName = expenseName;
        this.isRegular = isRegular;
    }

    public ExpenseKind(String expenseName, boolean isRegular) {
        this.expenseName = expenseName;
        this.isRegular = isRegular;
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

    public boolean isRegular() {
        return isRegular;
    }

    public void setRegular(boolean regular) {
        isRegular = regular;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExpenseKind)) return false;
        ExpenseKind that = (ExpenseKind) o;
        return getExpenseKindId() == that.getExpenseKindId() &&
                isRegular() == that.isRegular() &&
                Objects.equals(getExpenseName(), that.getExpenseName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getExpenseKindId(), getExpenseName(), isRegular());
    }
}
