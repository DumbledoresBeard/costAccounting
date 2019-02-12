package net.costaccounting.model;

import java.time.LocalDate;
import java.util.Objects;

public class SavingsFunds {
    private int savingsFundsId;
    private Float money;
    private LocalDate date;

    public SavingsFunds(int savingsFundsId, Float money, LocalDate date) {
        this.savingsFundsId = savingsFundsId;
        this.money = money;
        this.date = date;
    }

    public int getSavingsFundsId() {
        return savingsFundsId;
    }

    public void setSavingsFundsId(int savingsFundsId) {
        this.savingsFundsId = savingsFundsId;
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
        return getSavingsFundsId() == that.getSavingsFundsId() &&
                Objects.equals(getMoney(), that.getMoney()) &&
                Objects.equals(getDate(), that.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSavingsFundsId(), getMoney(), getDate());
    }
}
