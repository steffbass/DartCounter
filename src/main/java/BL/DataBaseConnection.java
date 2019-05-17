/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author stefan
 */
public class DataBaseConnection {

    /**
     * The one and only instance of the DataBase class.
     */
    private static DataBaseConnection theInstance;

    private static Connection conn;

    public DataBaseConnection() throws SQLException {
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:50024/winner", "postgres", "postgres");
    }

    /**
     * If the instance hasn't been created before, it gets created.
     *
     * @return Returns the DataBase instance.
     */
    public synchronized static DataBaseConnection getInstance() throws SQLException {
        if (theInstance == null) {
            theInstance = new DataBaseConnection();
        }
        return theInstance;
    }

    /**
     * inserts Values into Table
     *
     * @throws Exception
     */
    public void insert(Player p) throws Exception {
        LocalDateTime a = LocalDateTime.now();

        String name = p.getName();
        int format = p.getFormat();
        int würfe = p.getWürfe();
        int saveform = p.getSaveformat();
        double aver = (saveform - format) / würfe;

        a.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        String sql = "INSERT INTO winner VALUES('" + a + "', '" + name + "', '" + saveform + "', '" + aver + "');";

        try {
            Statement stat = conn.createStatement();
            stat.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
