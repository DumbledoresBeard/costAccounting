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

public interface ExpenseMapper {


    @Insert("INSERT INTO expense (expense, local_date, expense_kind_id ) VALUES "
            + "( #{expense.expense}, #{expense.localDate}, #{expenseKind.expenseKindId} )")
    @Options(useGeneratedKeys = true, keyProperty = "expense.id")
    Integer insert(@Param("expense")Expense expense, @Param("expenseKind")ExpenseKind expenseKind);

    @Select("SELECT expense_kind_id, name, is_regular FROM expense_kind WHERE name = #{name}")
    @Results({
            @Result(property = "expenseKindId", column = "expense_kind_id"),
            @Result(property = "expenseName", column = "name", javaType = String.class),
            @Result(property = "isRegular", column = "is_regular", javaType = Boolean.class),

    })

    Expense getByExpenseKindId(int expenseKindId);



}
