package net.costaccounting.model;

import java.time.LocalDate;
import java.util.Objects;

public class Settings {
    private int id;
    private LocalDate periodStartDate;
    private LocalDate periodEndDate;
    private boolean autoCounting;

    public Settings(int id, LocalDate periodStartDate, LocalDate periodEndDate, boolean autoCounting) {
        this.id = id;
        this.periodStartDate = periodStartDate;
        this.periodEndDate = periodEndDate;
        this.autoCounting = autoCounting;
    }

    public Settings(LocalDate periodStartDate, LocalDate periodEndDate, boolean autoCounting) {
        this.periodStartDate = periodStartDate;
        this.periodEndDate = periodEndDate;
        this.autoCounting = autoCounting;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getPeriodStartDate() {
        return periodStartDate;
    }

    public void setPeriodStartDate(LocalDate periodStartDate) {
        this.periodStartDate = periodStartDate;
    }

    public LocalDate getPeriodEndDate() {
        return periodEndDate;
    }

    public void setPeriodEndDate(LocalDate periodEndDate) {
        this.periodEndDate = periodEndDate;
    }

    public boolean getAutoCounting() {
        return autoCounting;
    }

    public void setAutoCounting(boolean autoCounting) {
        this.autoCounting = autoCounting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Settings)) return false;
        Settings settings = (Settings) o;
        return getId() == settings.getId() &&
                getAutoCounting() == settings.getAutoCounting() &&
                Objects.equals(getPeriodStartDate(), settings.getPeriodStartDate()) &&
                Objects.equals(getPeriodEndDate(), settings.getPeriodEndDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPeriodStartDate(), getPeriodEndDate(), getAutoCounting());
    }
}
