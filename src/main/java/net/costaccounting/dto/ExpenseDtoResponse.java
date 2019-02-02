package net.costaccounting.dto;

import java.util.Date;
import java.util.Objects;

public class ExpenseDtoResponse {
    private Float expense;
    private String expenseName;
    private Date date;

    public ExpenseDtoResponse () {}

    public ExpenseDtoResponse(Float expense, String expenseName, Date date) {
        this.expense = expense;
        this.expenseName = expenseName;
        this.date = date;
    }

    public Float getExpense() {
        return expense;
    }

    public void setExpense(Float expense) {
        this.expense = expense;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
