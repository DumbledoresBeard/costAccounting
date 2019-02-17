package net.costaccounting.dto;

public class ExpenseKindDtoResponse {
    private String expenseName;
    private boolean isReqular;

    public ExpenseKindDtoResponse() {}

    public ExpenseKindDtoResponse(String expenseName, boolean isReqular) {
        this.expenseName = expenseName;
        this.isReqular = isReqular;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public boolean isReqular() {
        return isReqular;
    }

    public void setReqular(boolean reqular) {
        isReqular = reqular;
    }
}
