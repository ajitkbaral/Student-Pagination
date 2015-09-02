/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pagodalabs.studentpagination.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Dell
 */
public class DBConnection {
    
    private Connection connection=null;
    private PreparedStatement stmt;
    
    public DBConnection(String driver, String localhost, String database,String username, String password) throws ClassNotFoundException, SQLException{
         Class.forName(driver);
         connection = DriverManager.getConnection(localhost+"/"+database, username, password);
    }
    
    public PreparedStatement initStatement(String sql) throws SQLException{
        stmt = connection.prepareCall(sql);
        return stmt;
    }
    
    public int executeUpdate() throws SQLException{
        int result=0;
        if(stmt!=null){
            stmt.executeUpdate();
            result =1;
        }
        return result;
    } 
    
    public ResultSet executeQuery() throws SQLException{
        ResultSet rs = null;
        if(stmt!=null){
            rs = stmt.executeQuery();
        }
        return rs;
    }
    
}
