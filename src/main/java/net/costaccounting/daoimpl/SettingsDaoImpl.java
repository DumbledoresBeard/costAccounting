package net.costaccounting.daoimpl;

import net.costaccounting.dao.SettingsDao;
import net.costaccounting.model.Settings;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SettingsDaoImpl extends DaoImplBase implements SettingsDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(SettingsDaoImpl.class);

    public Settings getById(int id) {
        LOGGER.debug("DAO get Settings by Id {}", id);
        try (SqlSession sqlSession = getSession()) {
            return getSettingsMapper(sqlSession).getById(id);
        } catch (RuntimeException ex) {
            LOGGER.info("Can't get Settings {}", ex);
            throw ex;
        }
    }
}
