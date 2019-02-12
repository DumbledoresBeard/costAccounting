package net.costaccounting.dto;

import java.time.LocalDate;

public class BudgetDtoResponse {
    private Float budget;
    private LocalDate startDate;
    private LocalDate endDate;

    public BudgetDtoResponse () {}

    public BudgetDtoResponse(Float budget, LocalDate startDate, LocalDate endDate) {
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
