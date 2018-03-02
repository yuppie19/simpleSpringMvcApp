package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by rustem on 26.01.18.
 */
public class FuckerServlet extends HttpServlet{

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();
        HttpSession session = req.getSession();
        if(session.isNew()) {
            session.setAttribute("msg", "YOU ARE OFFICIALLY FUCKED");
            session.setAttribute("name", "new fucking name");
            writer.append("YOU ARE OFFICIALLY FUCKED!");
        } else {
            String name = (String) session.getAttribute("name");
            System.out.println("NAME " + name);
            writer.append("YOU ALREADY HAVE BEEN FUCKED! " + name);
        }
    }
}
