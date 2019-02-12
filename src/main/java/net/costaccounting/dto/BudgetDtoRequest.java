package net.costaccounting.dto;

import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
@Repository
public class BudgetDtoRequest {
    @NotNull(message = "Budget cannot be null")
    @Size(min = 1, message = "Budget cannot be empty")
    private Float budget;

    @NotNull(message = "Start date cannot be null")
    private LocalDate startDate;

    @NotNull(message = "End date cannot be null")
    private LocalDate endDate;

    public BudgetDtoRequest() {}

    public BudgetDtoRequest(@NotNull(message = "Budget cannot be null") @Size(min = 1, message = "Budget cannot be empty") Float budget, @NotNull(message = "Start date cannot be null") LocalDate startDate, @NotNull(message = "End date cannot be null") LocalDate endDate) {
        this.budget = budget;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Float getBudget() {
        return budget;
    }

    public void setBudget(Float budget) {
        this.budget = budget;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
