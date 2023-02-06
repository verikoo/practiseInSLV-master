package newdatabaseproject.dao.jdbc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class MySqlDao {
    private static final Logger LOGGER = LogManager.getLogger(MySqlDao.class);
    static {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            LOGGER.error("Class not found");
        }
    }

}
