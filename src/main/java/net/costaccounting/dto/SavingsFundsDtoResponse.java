package net.costaccounting.dto;

public class SavingsFundsDtoResponse {

    Float money;

    public SavingsFundsDtoResponse(Float money) {
        this.money = money;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }
}
