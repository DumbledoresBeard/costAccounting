package net.costaccounting.model;

import java.time.LocalDate;
import java.util.Objects;

public class SavingsFunds {
    private int id;
    private Float money;
    private LocalDate date;

    public SavingsFunds(int id, Float money, LocalDate date) {
        this.id = id;
        this.money = money;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int savingsFundsId) {
        this.id = id;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SavingsFunds)) return false;
        SavingsFunds that = (SavingsFunds) o;
        return getId() == that.getId() &&
                Objects.equals(getMoney(), that.getMoney()) &&
                Objects.equals(getDate(), that.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMoney(), getDate());
    }
}
