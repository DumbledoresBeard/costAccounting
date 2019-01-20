package net.costaccounting.dto;

import org.springframework.stereotype.Repository;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;

@Repository
public class ExpenseDtoRequest {

    @NotNull(message = "Expense cannot be null")
    private Float expense;

    public ExpenseDtoRequest () {}

    public ExpenseDtoRequest(@NotNull(message = "Expense cannot be null") Float expense) {
        this.expense = expense;
    }

    public Float getExpense() {
        return expense;
    }

    public void setExpense(Float expense) {
        this.expense = expense;
    }
}
