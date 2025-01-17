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

    private boolean isRegular;

    public ExpenseKindDtoRequest() {}

    public ExpenseKindDtoRequest(@NotNull(message = "Name of expense cannot be null") @Size(min = 1, message = "Expense field cannot be empty") String expenseName, boolean isRegular) {
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
