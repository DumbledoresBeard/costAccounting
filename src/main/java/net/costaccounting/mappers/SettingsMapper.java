package net.costaccounting.mappers;

import net.costaccounting.model.ExpenseKind;
import net.costaccounting.model.Settings;
import org.apache.ibatis.annotations.*;


public interface SettingsMapper {

    @Select("SELECT id, period_start_date, auto_counting FROM settings WHERE id = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "periodStartDate", column = "period_start_date", javaType = String.class),
            @Result(property = "autoCounting", column = "auto_counting", javaType = Boolean.class),

    })
    Settings getById(int id);


    @Insert("INSERT INTO settings (period_start_date, auto_counting) VALUES "
            + "( #{settings.periodStartDate}, #{settings.autoCounting} )")
    @Options(useGeneratedKeys = true, keyProperty = "settings.id")
    Integer insert(@Param("settings") Settings settings);
}
