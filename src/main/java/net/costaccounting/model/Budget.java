package net.costaccounting.model;

import java.time.LocalDate;
import java.util.Objects;

public class Budget {
    private int id;
    private Float budget;
    private LocalDate startDate;
    private LocalDate endDate;


    public Budget(int id, Float budget, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.budget = budget;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Budget)) return false;
        Budget budget1 = (Budget) o;
        return getId() == budget1.getId() &&
                Objects.equals(getBudget(), budget1.getBudget()) &&
                Objects.equals(getStartDate(), budget1.getStartDate()) &&
                Objects.equals(getEndDate(), budget1.getEndDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getBudget(), getStartDate(), getEndDate());
    }
}
