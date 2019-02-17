package net.costaccounting.mappers;

import net.costaccounting.model.Settings;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;


public interface SettingsMapper {

    @Select("SELECT settings_id, periodStartDate, autoCounting FROM settings WHERE id = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "periodStartDate", column = "period_start_date", javaType = String.class),
            @Result(property = "autoCounting", column = "auto_counting", javaType = Boolean.class),

    })
    Settings getById(int id);

}
