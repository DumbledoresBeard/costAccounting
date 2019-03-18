package net.costaccounting.daoimpl;

import net.costaccounting.dao.ExpenseDao;
import net.costaccounting.mappers.ExpenseMapper;
import net.costaccounting.model.Expense;
import net.costaccounting.model.ExpenseKind;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;




public class ExpenseDaoImpl implements ExpenseDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExpenseDaoImpl.class);

    @Autowired
    private ExpenseMapper expenseMapper;

    @Override
    @Transactional
    public Expense insert(Expense expense, ExpenseKind expenseKind) {
        LOGGER.debug("DAO insert expense {}", expense);
      /*  try (SqlSession sqlSession = getSession()) {
            try {*/
               expenseMapper.insert(expense, expenseKind);
          /*  } catch (RuntimeException ex) {*/
               /* LOGGER.info("Can't insert expense {}, {}", expense, ex);*/
            /*    sqlSession.rollback();
                throw ex;
            }
            sqlSession.commit();*/
        /*}*/
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
