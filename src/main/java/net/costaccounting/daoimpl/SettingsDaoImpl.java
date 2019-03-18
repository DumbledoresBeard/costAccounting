package net.costaccounting.daoimpl;

import net.costaccounting.dao.SettingsDao;
import net.costaccounting.mappers.SettingsMapper;
import net.costaccounting.model.Settings;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class SettingsDaoImpl implements SettingsDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(SettingsDaoImpl.class);

    @Autowired
    SettingsMapper settingsMapper;

  public Settings getById(int id) {
        LOGGER.debug("DAO get Settings by Id {}", id);

        return null;
    }
}
