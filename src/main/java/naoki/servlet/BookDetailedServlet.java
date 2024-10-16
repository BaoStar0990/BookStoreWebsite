package naoki.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import naoki.business.*;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@WebServlet("/bookdetails")
public class BookDetailedServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = "/bookdetails.jsp";

        List<Author> authors = new ArrayList<>();

        for (int i=1;i<=2;i++){
            authors.add(new
                    Author(1, "Paulo Coelho", "/assets/images/authors/author.jpg",
                    "Paulo Coelho, tên đầy đủ là Paulo Coelho de Souza, sinh ngày 24 tháng 8 năm 1947")
            );
        }

        List<Publisher> publishers = new ArrayList<>();

        for (int i=1;i<=2;i++){
            publishers.add(new Publisher(1, "NXB Trẻ"));
        }

        List<Category> categories = new ArrayList<>();
        categories.add(new Category(1, "Tiểu thuyết", "Tiểu thuyết"));
        categories.add(new Category(2, "Tâm lý", "Tâm lý"));

        List<Review> reviews = new ArrayList<>();
        for (int i=1;i<=6;i++){
            reviews.add(
                    new Review(
                            1,
                            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor. Cras elementum ultrices diam. Maecenas ligula massa, varius a, semper congue, euismod non, mi.",
                            new Random().nextInt(5) + 1,
                            LocalDateTime.now().toLocalDate()
                    )
            );
        }

        Book book = new Book(
                1,                      // id
                "Nhà giả kim",          // title
                "Tất cả những trải nghiệm trong chuyến phiêu du theo đuổi vận mệnh của mình đã giúp Santiago thấu hiểu được ý nghĩa sâu xa nhất của hạnh phúc, hòa hợp với vũ trụ và con người." +
                        " Tiểu thuyết Nhà giả kim của Paulo Coelho như một câu chuyện cổ tích giản dị, nhân ái, giàu chất thơ, thấm đẫm những minh triết huyền bí của phương Đông. Trong lần xuất bản đầu tiên tại Brazil vào năm 1988, sách chỉ bán được 900 bản. " +
                        "Nhưng, với số phận đặc biệt của cuốn sách dành cho toàn nhân loại, vượt ra ngoài biên giới quốc gia, Nhà giả kim đã làm rung động hàng triệu tâm hồn, trở thành một trong những cuốn sách bán chạy nhất mọi thời đại, và có thể làm thay đổi cuộc đời người đọc.", // description
                "9781421520544",        // ISBN
                70000,                  // costPrice
                100000,                 // sellingPrice
                100,                    // stock
                "/assets/images/books/nha_gia_kim.jpg", // imageURL
                authors,                // authors
                publishers,             // publishers
                categories,             // categories
                reviews,                // reviews
                2019,                   // publisherYear
                "Tiếng Việt",           // language
                20 //discountPercent
        );

        List<Book> RelatedBook = new ArrayList<>();

        for (int i=1;i<=6;i++){
            RelatedBook.add(book);
        }

        req.setAttribute("book", book);
        req.setAttribute("relatedBooks", RelatedBook);

        getServletContext().getRequestDispatcher(url).forward(req, resp);
    }
}
