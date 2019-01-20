package net.costaccounting.dto;

public class ExpenseKindDtoResponse {
    private String expenseName;

    public ExpenseKindDtoResponse() {}

    public ExpenseKindDtoResponse(String expenseName) {
        this.expenseName = expenseName;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }
}
