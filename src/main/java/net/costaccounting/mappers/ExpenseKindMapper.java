package net.costaccounting.mappers;
import net.costaccounting.model.ExpenseKind;
import org.apache.ibatis.annotations.*;
import java.sql.Date;
import java.util.List;
import org.apache.ibatis.mapping.FetchType;
import net.costaccounting.dao.ExpenseDao;
import net.costaccounting.model.Expense;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;


public interface ExpenseKindMapper {

    @Select("SELECT expense_kind_id, name, is_regular FROM expense_kind WHERE name = #{name}")
    @Results({
            @Result(property = "id", column = "expense_kind_id"),
            @Result(property = "name", column = "name", javaType = String.class),
            @Result(property = "is_regular", column = "is_regular", javaType = Boolean.class),

    })

    ExpenseKind getByName(String name);


    @Insert("INSERT INTO expense_kind (name, is_reqular ) VALUES "
            + "( #{expenseKind.expenseName}, #{expenseKind.isReqular} )")
    @Options(useGeneratedKeys = true, keyProperty = "expense_kind_id")
    Integer insert(@Param("expense_kind")ExpenseKind expenseKind);
}
