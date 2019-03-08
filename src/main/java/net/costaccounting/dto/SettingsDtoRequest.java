package net.costaccounting.dto;

import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
@Repository
public class SettingsDtoRequest {

    @NotNull(message = "Start date of period cannot be null")
    private String startDate;

    private boolean autoCounting;


    public SettingsDtoRequest () {}


    public SettingsDtoRequest(@NotNull(message = "Start date of period cannot be null") String startDate, boolean autoCounting) {
        this.startDate = startDate;
        this.autoCounting = autoCounting;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public boolean getAutoCounting() {
        return autoCounting;
    }

    public void setAutoCounting(boolean autoCounting) {
        this.autoCounting = autoCounting;
    }
}
