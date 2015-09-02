/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pagodalabs.studentpagination.dao.impl;

import com.pagodalabs.studentpagination.dao.StudentDAO;
import com.pagodalabs.studentpagination.entity.Student;
import com.pagodalabs.studentpagination.util.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class StudentDAOImpl implements StudentDAO{
    
    private int noOfRecords;
    private DBConnection connection;

    public StudentDAOImpl(String driver, String localhost, String database,String username, String password) throws ClassNotFoundException, SQLException {
        connection = new DBConnection(driver, localhost, database, username, password);
    }

    @Override
    public List<Student> showAllStudent(int offSet, int noOfRecords) throws SQLException {
        String sql = "SELECT SQL_CALC_FOUND_ROWS * FROM student limit "+offSet+","+noOfRecords;
        List<Student> studentList = new ArrayList<Student>();
        connection.initStatement(sql);
        ResultSet rs = connection.executeQuery();
        while(rs.next()){
        studentList.add(new Student(rs.getInt("id"), rs.getString("first_name"),
                rs.getString("last_name"), rs.getString("email"), rs.getString("phone")));
        }
        
        sql = "SELECT FOUND_ROWS()";
        connection.initStatement(sql);
        rs = connection.executeQuery();
        while(rs.next()){
        this.noOfRecords = rs.getInt(1);
        }
        return studentList;
    }

    public int getNoOfRecords() {
        return noOfRecords;
    }
    
    
}
