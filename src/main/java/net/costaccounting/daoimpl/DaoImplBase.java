package net.costaccounting.daoimpl;
import net.costaccounting.mappers.ExpenseKindMapper;
import net.costaccounting.mappers.SettingsMapper;
import net.costaccounting.utils.MyBatisUtils;
import net.costaccounting.mappers.ExpenseMapper;

import org.apache.ibatis.session.SqlSession;

import net.costaccounting.utils.MyBatisUtils;


public class DaoImplBase {

    protected SqlSession getSession() {
        return MyBatisUtils.getSqlSessionFactory().openSession();
    }

    protected ExpenseMapper getExpenseMapper(SqlSession sqlSession) {
        return sqlSession.getMapper(ExpenseMapper.class);
    }

    protected ExpenseKindMapper getExpenseKindMapper(SqlSession sqlSession) {
        return sqlSession.getMapper(ExpenseKindMapper.class);
    }

    protected SettingsMapper getSettingsMapper(SqlSession sqlSession) {
        return sqlSession.getMapper(SettingsMapper.class);
    }


}
