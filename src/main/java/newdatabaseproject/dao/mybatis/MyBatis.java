package newdatabaseproject.dao.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.Reader;

public class MyBatis {
    private static final Logger LOGGER = LogManager.getLogger(MyBatis.class);

    private static SqlSessionFactory factory;

    private MyBatis(){}

    static {
        Reader reader = null;
        try{
            reader = Resources.getResourceAsReader("mybatis/mybatisConfig.xml");
        }catch(IOException e){
            LOGGER.error(e);
        }
        factory = new SqlSessionFactoryBuilder().build(reader);
    }
    public static SqlSessionFactory getSqlSessionFactory(){
        return factory;
    }
}
