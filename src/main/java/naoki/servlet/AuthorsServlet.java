package naoki.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import naoki.business.Author;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/authors")
public class AuthorsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = "/allauthors.jsp";

        List<Author> authors = new ArrayList<>();
        for (int i = 1; i <= 11; i++) {
            authors.add(new Author(i, "Paulo Coelho ", "/assets/images/authors/author.jpg",
                    "Paulo Coelho, tên đầy đủ là Paulo Coelho de Souza, sinh ngày 24 tháng 8 năm 1947"));
        }

        req.setAttribute("authors", authors);

        req.getRequestDispatcher(url).forward(req, resp);
    }
}
