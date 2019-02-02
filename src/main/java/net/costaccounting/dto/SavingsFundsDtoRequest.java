package net.costaccounting.dto;

import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Repository
public class SavingsFundsDtoRequest {

    @NotNull (message = "Sum of savings funds cannot be null")
    @Size (min = 1, message = "Sum of savings funds cannot be empty")
    Float money;

    public SavingsFundsDtoRequest(){}

    public SavingsFundsDtoRequest(Float money) {
        this.money = money;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }
}
