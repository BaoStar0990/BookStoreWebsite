package naoki.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import naoki.user.User;

import javax.swing.plaf.synth.SynthTextAreaUI;

@WebServlet("/signin")
public class SignInServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/signin.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Auth(req, resp);
    }

    public void Auth(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String url ="/index.jsp";
        String action = req.getParameter("action");
        if(action == null){
            url = "/signin.jsp";
        }
        else if(action.equals("signin")){
            HttpSession session = req.getSession();

            String account = req.getParameter("account");
            String password = req.getParameter("password");

            User user = new User(1, account ,password);
            System.out.println(user.getName());
            session.setAttribute("user", user);

            url = req.getContextPath() + "/books";
        }
        else if(action.equals("logout")){
            HttpSession session = req.getSession();
            session.removeAttribute("user");

            url = req.getContextPath() + "/books";
        }

        resp.sendRedirect(url);
    }
}
