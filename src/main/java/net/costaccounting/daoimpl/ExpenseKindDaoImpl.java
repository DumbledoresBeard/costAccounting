package net.costaccounting.daoimpl;

import net.costaccounting.dao.ExpenseKindDao;
import net.costaccounting.model.ExpenseKind;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.costaccounting.utils.MyBatisUtils.getSession;

public class ExpenseKindDaoImpl extends DaoImplBase implements ExpenseKindDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExpenseKindDaoImpl.class);

    @Override
    public ExpenseKind getByName(String name) {
        LOGGER.debug("DAO get ExpenseKind by Name {}", name);
        try (SqlSession sqlSession = getSession()) {
            return getExpenseKindMapper(sqlSession).getByName(name);
        } catch (RuntimeException ex) {
            LOGGER.info("Can't get ExpenseKind {}", ex);
            throw ex;
        }
    }

    @Override
    public ExpenseKind insert(ExpenseKind expenseKind) {
        LOGGER.debug("DAO insert expense {}", expenseKind);
        try (SqlSession sqlSession = getSession()) {
            try {
                getExpenseKindMapper(sqlSession).insert(expenseKind);
            } catch (RuntimeException ex) {
                LOGGER.info("Can't insert expense {}, {}", expenseKind, ex);
                sqlSession.rollback();
                throw ex;
            }
            sqlSession.commit();
        }
        return expenseKind;


    }


}
