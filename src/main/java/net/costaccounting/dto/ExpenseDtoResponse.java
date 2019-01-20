package net.costaccounting.dto;

public class ExpenseDtoResponse {
    private Float expense;

    public ExpenseDtoResponse () {}

    public ExpenseDtoResponse(Float expense) {
        this.expense = expense;
    }

    public Float getExpense() {
        return expense;
    }

    public void setExpense(Float expense) {
        this.expense = expense;
    }
}
