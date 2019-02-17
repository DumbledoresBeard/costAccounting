package net.costaccounting.dto;

import org.springframework.stereotype.Repository;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;
import java.util.Objects;

@Repository
public class ExpenseKindDtoRequest {

    @NotNull (message = "Name of expense cannot be null")
    @Size (min = 1, message = "Expense field cannot be empty")
    private String expenseName;

    private boolean isReqular;

    public ExpenseKindDtoRequest() {}

    public ExpenseKindDtoRequest(@NotNull(message = "Name of expense cannot be null") @Size(min = 1, message = "Expense field cannot be empty") String expenseName, boolean isReqular) {
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
