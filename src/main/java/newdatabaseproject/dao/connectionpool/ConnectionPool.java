package newdatabaseproject.dao.connectionpool;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import zoo.Monkey;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Stack;
import java.util.Vector;
public class ConnectionPool {
    private final static Logger LOGGER = LogManager.getLogger(ConnectionPool.class);
    private static final int CON_POOL_SIZE = 5;
    private static Properties p = new Properties();
    private static String userName;
    private static String url;
    private static String password;
    private Vector<Connection> conPool = new Vector<>(CON_POOL_SIZE, 1);
    private Vector<Connection> activeConnections = new Stack<>();

    private ConnectionPool() {
        for (int i = 0; i < CON_POOL_SIZE; i++) {
            Connection connection = null;
            try {
                connection = DriverManager.getConnection(url, userName, password);
            } catch (SQLException e) {
                LOGGER.info(e);
            }
            conPool.add(connection);
        }
    }

    static {
        try (FileInputStream f = new FileInputStream("/Users/veriko/Desktop/practiseInSLV-master/src/main/resources/database.properties")) {
            p.load(f);
        } catch (IOException e) {
            LOGGER.info(e);
        }
        url = p.getProperty("url");
        userName = p.getProperty("userName");
        password = p.getProperty("password");
    }

    private Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, userName, password);
        } catch (Exception e) {
            LOGGER.info(e);
        }
        return conn;
    }

    public synchronized Connection retrieve() {
        Connection newConn = null;
        if (conPool.size() == 0) {
            newConn = getConnection();
        } else {
            newConn = (Connection) conPool.lastElement();
            conPool.removeElement(newConn);
        }
        activeConnections.addElement(newConn);
        LOGGER.info("The connection was retrieved: " + newConn.toString());
        return newConn;
    }

    public synchronized void Back(Connection c) {
        if (c != null) {
            if (activeConnections.removeElement(c)) {
                conPool.addElement(c);
                LOGGER.info("connection back to Connection pool: " + c.toString());
            } else {
                throw new NullPointerException("Connection is not in the Active Connections array");
            }
        }
    }
}
