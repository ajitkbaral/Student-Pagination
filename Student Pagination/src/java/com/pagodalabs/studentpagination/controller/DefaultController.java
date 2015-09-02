/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pagodalabs.studentpagination.controller;

import com.pagodalabs.studentpagination.dao.StudentDAO;
import com.pagodalabs.studentpagination.dao.impl.StudentDAOImpl;
import com.pagodalabs.studentpagination.entity.Student;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dell
 */
@WebServlet(name = "DefaultController", urlPatterns = {"/"})
public class DefaultController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //request.getRequestDispatcher("default.jsp").forward(request, response);
        try {
            int page = 1;
            int recordsPerPage = 5;
            if(request.getParameter("page") != null)
                page = Integer.parseInt(request.getParameter("page"));
            StudentDAO dao = new StudentDAOImpl("com.mysql.jdbc.Driver", "jdbc:mysql://localhost", "sms", "root", "");
            List<Student> list = dao.showAllStudent((page-1)*recordsPerPage,
                    recordsPerPage);
            int noOfRecords = dao.getNoOfRecords();
            int noOfPages = (int) Math.ceil(noOfRecords * 1.0 / recordsPerPage);
            request.setAttribute("studentList", list);
            request.setAttribute("noOfPages", noOfPages);
            request.setAttribute("currentPage", page);
            request.getRequestDispatcher("default.jsp").forward(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DefaultController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DefaultController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }


}
