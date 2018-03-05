package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by rustem on 15.02.18.
 */
public class AnotherServlet extends HttpServlet {

    private static final String salt = "yeahhBitch122";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object user = req.getSession().getAttribute("user");
        System.out.println("SESSION FOUND " + user);
        resp.getWriter().append("HELLO " + user.toString());
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        HttpSession session = req.getSession();
        session.setAttribute("user", username);
        session.setAttribute("password", password + salt);


        if(username == "admin" && password == "qwerty") {
            session.setAttribute("role", "admin");
            super.getServletContext().setAttribute("admin", username);
            super.getServletContext().setAttribute("password", password);
        } else {

        }

    }
}
