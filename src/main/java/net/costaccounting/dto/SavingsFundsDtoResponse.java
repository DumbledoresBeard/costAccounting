package net.costaccounting.dto;

import java.time.LocalDate;

public class SavingsFundsDtoResponse {

    private Float money;
    private LocalDate date;

    public SavingsFundsDtoResponse(Float money, LocalDate date) {
        this.money = money;
        this.date = date;
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
}
