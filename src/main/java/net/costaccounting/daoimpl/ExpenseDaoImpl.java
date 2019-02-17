package net.costaccounting.daoimpl;

import net.costaccounting.dao.ExpenseDao;
import net.costaccounting.model.Expense;
import net.costaccounting.model.ExpenseKind;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;

import static net.costaccounting.utils.MyBatisUtils.getSession;


public class ExpenseDaoImpl extends DaoImplBase implements ExpenseDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExpenseDaoImpl.class);

    @Override
    public Expense insert(Expense expense, ExpenseKind expenseKind) {
        LOGGER.debug("DAO insert expense {}", expense);
        try (SqlSession sqlSession = getSession()) {
            try {
               getExpenseMapper(sqlSession).insert(expense, expenseKind);
            } catch (RuntimeException ex) {
                LOGGER.info("Can't insert expense {}, {}", expense, ex);
                sqlSession.rollback();
                throw ex;
            }
            sqlSession.commit();
        }
        return expense;

    }

    @Override
    public Expense getById(int id) {
        return null;
    }

    @Override
    public Expense update(Expense expense) {
        return null;
    }

    @Override
    public void delete(Expense expense) {

    }

    @Override
    public Expense getByParams(ExpenseKind expenseKind, LocalDate localDate) {
        return null;
    }
}
