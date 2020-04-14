package net.costaccounting.daoimpl;

import net.costaccounting.dao.SettingsDao;
import net.costaccounting.model.Settings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SettingsDaoImpl implements SettingsDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(SettingsDaoImpl.class);


  public Settings getById(int id) {
        LOGGER.debug("DAO get Settings by Id {}", id);

        return null;
    }
}
