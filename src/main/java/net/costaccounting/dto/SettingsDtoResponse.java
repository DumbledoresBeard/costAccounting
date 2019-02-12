package net.costaccounting.dto;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class SettingsDtoResponse {
        private String periodStartDate;
        private boolean autoCounting;

    public SettingsDtoResponse() {}

    public SettingsDtoResponse(String periodStartDate, boolean autoCounting) {
        this.periodStartDate = periodStartDate;
        this.autoCounting = autoCounting;
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
}
