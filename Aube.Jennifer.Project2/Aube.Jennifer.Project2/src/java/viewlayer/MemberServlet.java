/**
 * MemberServlet.java
 * Jennifer Aube, 040507317
 * CST8288-OPPII
 * Project 2
 * August 4, 2017
 * George Krieger
 * Description: The purpose of this servlet is to create a web page that will display the 
 * members table from the potluckrecipes database.
 *
 */
package viewlayer;

import businesslayer.MemberBusinessLogic;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import transferobject.Member;

/**
 *
 * @author Jennifer
 */
public class MemberServlet extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        ArrayList<Member> list = null;
        MemberBusinessLogic logic = new MemberBusinessLogic();
        
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewServlet at " + request.getContextPath() + "</h1>");
            out.println("<table border=\"1\">");
            out.println("<th>MemberID</th><th>IsAdmin</th><th>Alias</th><th>FirstName</th><th>LastName</th>"
                    + "<th>Email</th><th>Username</th><th>Password</th>");
            
            Class.forName("com.mysql.jdbc.Driver");
            list = logic.getAllMembers();
            
            for(int i = 0;i <= list.size(); i++){
                out.println("<tr>");
                out.print("<td>" + list.get(i).getMemberID() + "</td>");                
                out.print("<td>" + list.get(i).getIsAdmin() + "</td>");
                out.print("<td>" + list.get(i).getAlias() + "</td>");
                out.print("<td>" + list.get(i).getFirstName() + "</td>");
                out.print("<td>" + list.get(i).getLastName() + "</td>");
                out.print("<td>" + list.get(i).getEmail() + "</td>"); 
                out.print("<td>" + list.get(i).getUsername() + "</td>");
                out.print("<td>" + list.get(i).getPassword() + "</td>");
                out.println("</tr>");
            }
            out.println("</table");
            out.println("</body>");
            out.println("</html>");
        }
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
        try {
            processRequest(request, response);
        }  catch (ClassNotFoundException ex) {
            Logger.getLogger(MemberServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MemberServlet.class.getName()).log(Level.SEVERE, null, ex);
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(MemberServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MemberServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
