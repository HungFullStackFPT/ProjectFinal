/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author LEGION
 */
@WebServlet(name = "DenyAccess", urlPatterns = {"/deny"})
public class DenyAccessControl extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response )throws ServletException, IOException{
        request.getRequestDispatcher("DenyAccess.jsp").forward(request, response);
    }
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response )throws ServletException, IOException{
        
    }
}