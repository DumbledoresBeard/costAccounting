package net.costaccounting.model;

import java.util.Objects;

public class Settings {
    private int id;
    private String periodStartDate;
    private boolean autoCounting;

    public Settings(int id, String periodStartDate, boolean autoCounting) {
        this.id = id;
        this.periodStartDate = periodStartDate;
        this.autoCounting = autoCounting;
    }

    public Settings(String periodStartDate, boolean autoCounting) {
        this.periodStartDate = periodStartDate;
        this.autoCounting = autoCounting;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPeriodStartDate() {
        return periodStartDate;
    }

    public void setPeriodStartDate(String periodStartDate) {
        this.periodStartDate = periodStartDate;
    }

    public boolean isAutoCounting() {
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
                isAutoCounting() == settings.isAutoCounting() &&
                Objects.equals(getPeriodStartDate(), settings.getPeriodStartDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPeriodStartDate(), isAutoCounting());
    }
}
