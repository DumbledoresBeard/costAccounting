package net.costaccounting.dto;

public class ExpenseKindDtoResponse {
    private String expenseName;
    private boolean isRegular;

    public ExpenseKindDtoResponse() {}

    public ExpenseKindDtoResponse(String expenseName, boolean isRegular) {
        this.expenseName = expenseName;
        this.isRegular = isRegular;
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
}
