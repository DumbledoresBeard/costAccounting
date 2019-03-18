package net.costaccounting.mappers;

import net.costaccounting.model.Expense;
import net.costaccounting.model.ExpenseKind;
import net.costaccounting.model.SumOfExpenses;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;

public interface SumOfExpensesMapper {

    @Insert("INSERT INTO sum_of_expenses (sum_of_expenses, period_start_date, period_end_date, expense_kind_id ) VALUES "
            + "( #{sumOfExpenses.sumOfExpenses}, #{sumOfExpenses.startDate}, #{sumOfExpenses.endDate}, #{expenseKind.expenseKindId} )")
    @Options(useGeneratedKeys = true, keyProperty = "sumOfExpenses.id")
    Integer insert(@Param("sumOfExpenses") SumOfExpenses sumOfExpenses,
                   @Param("expenseKind") ExpenseKind expenseKind);


    @Select("SELECT id, sum_of_expenses, period_start_date, period_end_date FROM sum_of_expenses WHERE expense_kind_id = " +
            "#{expenseKindId} LIMIT 1")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "sumOfExpenses", column = "sum_of_expenses", javaType = Float.class),
            @Result(property = "startDate", column = "period_start_date", javaType = LocalDate.class),
            @Result(property = "endDate", column = "period_end_date", javaType = LocalDate.class),

    })
    SumOfExpenses getByExpenseKindId(int expenseKindId);

    @Select("SELECT id, sum_of_expenses, period_start_date, period_end_date FROM sum_of_expenses WHERE expense_kind_id = " +
            "#{expenseKindId} AND period_end_date < #{localDate} AND period_start_date > #{localDate}" )
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "sumOfExpenses", column = "sum_of_expenses", javaType = Float.class),
            @Result(property = "startDate", column = "period_start_date", javaType = LocalDate.class),
            @Result(property = "endDate", column = "period_end_date", javaType = LocalDate.class),

    })
    SumOfExpenses getByExpenseKindIdAndDate(int expenseKindId, LocalDate localDate);

}