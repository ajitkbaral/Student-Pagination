/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pagodalabs.studentpagination.dao;

import com.pagodalabs.studentpagination.entity.Student;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Dell
 */
public interface StudentDAO {
    
    public List<Student> showAllStudent(int offSet, int noOfRecords) throws SQLException;
    public int getNoOfRecords();
    
}
