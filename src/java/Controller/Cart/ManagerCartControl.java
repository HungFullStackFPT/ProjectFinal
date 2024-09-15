/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Cart;

import DAO.DAO;
// import entity.Cart;
import Entity.Category;
import Entity.Order;
import Entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ManagerCartControl", urlPatterns = {"/managerCart"})
public class ManagerCartControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        ArrayList<Order> cart = new ArrayList<>();
        if (session.getAttribute("cart") != null) {
            cart = (ArrayList) session.getAttribute("cart");
        }
        double totalMoney = 0;
        for (Order o : cart) {

            totalMoney = totalMoney + (o.getProduct().getPrice() * o.getQuantity());

        }
        
        double VAT = totalMoney * 0.1;
        double totalMoneyVAT = totalMoney + totalMoney * 0.1;
        request.setAttribute("totalMoney", totalMoney);
        request.setAttribute("shippingFee", "Free");
        request.setAttribute("VAT", VAT);
        request.setAttribute("totalMoneyVAT", totalMoneyVAT);
        request.setAttribute("listCart", cart);
        System.out.println(cart.toString());
        request.getRequestDispatcher("Cart.jsp").forward(request, response);
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
