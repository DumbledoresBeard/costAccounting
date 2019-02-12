package net.costaccounting.dto;

import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Repository
public class SavingsFundsDtoRequest {

    @NotNull (message = "Sum of savings funds cannot be null")
    @Size (min = 1, message = "Sum of savings funds cannot be empty")
    private Float money;

    @NotNull(message = "Date cannot be null")
    private LocalDate date;

    public SavingsFundsDtoRequest(){}

    public SavingsFundsDtoRequest(@NotNull(message = "Sum of savings funds cannot be null") @Size(min = 1, message = "Sum of savings funds cannot be empty") Float money, @NotNull(message = "Date cannot be null") LocalDate date) {
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
