/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interntest2504;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class SQLServer_Connection {
    public static Connection getConnection() {
        try {
//        !!    CẤU HÌNH KẾT NỐI ĐẾN DB MSSQL
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://;databaseName=UserDB";
            String username = "sa";
            String password = "123456";
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("KET NOI THANH CONG");
            return con;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
    }
   
}
