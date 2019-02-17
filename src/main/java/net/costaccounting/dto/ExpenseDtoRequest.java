package net.costaccounting.dto;

import net.costaccounting.model.ExpenseKind;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;
import java.time.LocalDate;
import java.util.Date;

@Repository
public class ExpenseDtoRequest {

    @NotNull(message = "Expense cannot be null")
    @Size (min = 1, message = "Expense cannot be empty")
    private Float expense;

    @NotNull(message = "Expense kind cannot be null")
    private String expenseKind;


    @NotNull(message = "Date cannot be null")
    private LocalDate localDate;

    public ExpenseDtoRequest () {}

    public ExpenseDtoRequest(@NotNull(message = "Expense cannot be null") @Size(min = 1, message = "Expense cannot be empty") Float expense, @NotNull(message = "Expense kind cannot be null") String expenseKind, @NotNull(message = "Date cannot be null") LocalDate localDate) {
        this.expense = expense;
        this.expenseKind = expenseKind;
        this.localDate = localDate;
    }

    public Float getExpense() {
        return expense;
    }

    public void setExpense(Float expense) {
        this.expense = expense;
    }

    public String getExpenseKind() {
        return expenseKind;
    }

    public void setExpenseKind(String expenseKind) {
        this.expenseKind = expenseKind;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
