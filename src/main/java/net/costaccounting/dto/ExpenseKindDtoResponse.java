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

    public boolean getIsRegular() {
        return isRegular;
    }

    public void setIsRegular(boolean isRegular) {
        this.isRegular = isRegular;
    }
}
