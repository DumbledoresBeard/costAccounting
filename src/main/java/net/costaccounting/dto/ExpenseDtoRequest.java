package net.costaccounting.dto;

import org.springframework.stereotype.Repository;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;
import java.util.Date;

@Repository
public class ExpenseDtoRequest {

    @NotNull(message = "Expense cannot be null")
    @Size (min = 1, message = "Expense cannot be empty")
    private Float expense;

    @NotNull(message = "Expense kind cannot be null")
    private String expenseName;


    @NotNull(message = "Date cannot be null")
    private Date date;

    public ExpenseDtoRequest () {}

    public ExpenseDtoRequest(@NotNull(message = "Expense cannot be null") @Size(min = 1, message = "Expense cannot be empty") Float expense, @NotNull(message = "Expense kind cannot be null") String expenseName, @NotNull(message = "Date cannot be null") Date date) {
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
