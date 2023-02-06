package newdatabaseproject.dao.mybatis;

import newdatabaseproject.dao.interfaces.IDeliveriesDAO;
import newdatabaseproject.models.Deliveries;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.List;

public class DeliveriesDAO {
    private static final Logger LOGGER = LogManager.getLogger(DeliveriesDAO.class);

    public Deliveries getById(Long id){
        SqlSession session = MyBatis.getSqlSessionFactory().openSession();
        try{
            IDeliveriesDAO iDeliveriesDAO =  session.getMapper(IDeliveriesDAO.class);
            return iDeliveriesDAO.getById(id);
        }finally {
            session.rollback();
            session.close();
        }
    }

    public void insert(Deliveries object){
        SqlSession session = MyBatis.getSqlSessionFactory().openSession();
        try{
            IDeliveriesDAO iDeliveriesDAO = session.getMapper(IDeliveriesDAO.class);
            iDeliveriesDAO.insert(object);
            session.commit();
            LOGGER.info("inserted successfully");
        }finally {
            session.rollback();
            session.close();
        }
    }

    public void update(Deliveries object){
        SqlSession session = MyBatis.getSqlSessionFactory().openSession();
        try{
            IDeliveriesDAO iDeliveriesDAO = session.getMapper(IDeliveriesDAO.class);
            iDeliveriesDAO.update(object);
            session.commit();
            LOGGER.info("updated successfully");
        }finally {
            session.rollback();
            session.close();
        }
    }

    public void delete(Long id) {
        SqlSession session = MyBatis.getSqlSessionFactory().openSession();
        try{
            IDeliveriesDAO iDeliveriesDAO = session.getMapper(IDeliveriesDAO.class);
            iDeliveriesDAO.delete(id);
            session.commit();
            LOGGER.info("deleted successfully");
        }finally {
            session.rollback();
            session.close();
        }
    }

    public List<Deliveries> getAllDeliveries(){
        SqlSession session = MyBatis.getSqlSessionFactory().openSession();
        try{
            IDeliveriesDAO iDeliveriesDAO = session.getMapper(IDeliveriesDAO.class);
            return iDeliveriesDAO.getAllDeliveries();
        }finally {
            session.rollback();
            session.close();
        }
    }
}
