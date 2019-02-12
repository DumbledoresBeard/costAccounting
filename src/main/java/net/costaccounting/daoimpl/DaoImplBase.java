package net.costaccounting.daoimpl;
import net.costaccounting.utils.MyBatisUtils;
import net.costaccounting.mappers.ExpenseMapper;

import org.apache.ibatis.session.SqlSession;

public class DaoImplBase {

    protected SqlSession getSession() {
        return MyBatisUtils.getSqlSessionFactory().openSession();
    }

    protected ExpenseMapper getExpenseMapper(SqlSession sqlSession) {
        return sqlSession.getMapper(ExpenseMapper.class);
    }

  /*  protected GroupMapper getGroupMapper(SqlSession sqlSession) {
        return sqlSession.getMapper(GroupMapper.class);
    }

    protected TraineeMapper getTraineeMapper(SqlSession sqlSession) {
        return sqlSession.getMapper(TraineeMapper.class);
    }

    protected SubjectMapper getSubjectMapper(SqlSession sqlSession) {
        return sqlSession.getMapper(SubjectMapper.class);
    }*/


}
