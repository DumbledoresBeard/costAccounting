package net.costaccounting.dto;

import org.springframework.stereotype.Repository;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;

@Repository
public class ExpenseKindDtoRequest {

    @NotNull (message = "Name of expense cannot be null")
    @Size (min = 1, message = "Name of expense cannot be empty")
    private String expenseName;

    public ExpenseKindDtoRequest() {}

    public ExpenseKindDtoRequest(@NotNull(message = "Name of expense cannot be null") String expenseName) {
        this.expenseName = expenseName;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }
}
