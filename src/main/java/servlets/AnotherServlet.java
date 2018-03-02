package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by rustem on 15.02.18.
 */
public class AnotherServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if(session.isNew()) {
            session.setAttribute("user", "fucked");
            System.out.println("SESSION CREATED");
        } else {
            Object user = session.getAttribute("user");
            System.out.println("SESSION FOUND " + user);
            resp.getWriter().append("HELLO " + user.toString());
        }

//        Cookie c = new Cookie("name", "new user");
//        c.setMaxAge(30*60);
//        resp.addCookie(c);
    }
}
