package newdatabaseproject.dao.mybatis;

import newdatabaseproject.dao.interfaces.ICustomersDAO;
import newdatabaseproject.models.Customers;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class CustomersDAO {
    private static final Logger LOGGER = LogManager.getLogger(CustomersDAO.class);
    public Customers getById(Long id){
        SqlSession session = MyBatis.getSqlSessionFactory().openSession();
        try{
            ICustomersDAO iCustomersDAO = session.getMapper(ICustomersDAO.class);
            return iCustomersDAO.getById(id);
        }finally {
            session.rollback();
            session.close();
        }
    }

    public void insert(Customers object){
        SqlSession session = MyBatis.getSqlSessionFactory().openSession();
        try{
            ICustomersDAO iCustomersDAO = session.getMapper(ICustomersDAO.class);
            iCustomersDAO.insert(object);
            session.commit();
            LOGGER.info("inserted successfully");
        }finally {
            session.rollback();
            session.close();
        }
    }

    public void update(Customers object, long l){
        SqlSession session = MyBatis.getSqlSessionFactory().openSession();
        try{
            ICustomersDAO iCustomersDAO = session.getMapper(ICustomersDAO.class);
            iCustomersDAO.insert(object);
            session.commit();
            LOGGER.info("updates successfully");
        }finally {
            session.rollback();
            session.close();
        }
    }

    public void delete(Long id){
        SqlSession session = MyBatis.getSqlSessionFactory().openSession();
        try{
            ICustomersDAO iCustomersDAO = session.getMapper(ICustomersDAO.class);
            iCustomersDAO.delete(id);
            session.commit();
            LOGGER.info("deleted successfully");
        }finally {
            session.rollback();
            session.close();
        }
    }

    public List<Customers> getAllCustomers(){
        SqlSession session = MyBatis.getSqlSessionFactory().openSession();
        try{
            ICustomersDAO iCustomersDAO = session.getMapper(ICustomersDAO.class);
            return iCustomersDAO.getAllCustomers();
        }finally {
            session.rollback();
            session.close();
        }
    }
}
