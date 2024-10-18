package naoki.books;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import naoki.business.*;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;

@WebServlet("/books")
public class BooksServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/index.jsp";

        // Sample Data for books
        List<Author> bookItemAuthors = new ArrayList<>();

        for (int i=1;i<=2;i++){
            bookItemAuthors.add(new
                Author(1, "Paulo Coelho", "/assets/images/authors/author.jpg",
                "Paulo Coelho, tên đầy đủ là Paulo Coelho de Souza, sinh ngày 24 tháng 8 năm 1947")
            );
        }

        List<Publisher> publishers = new ArrayList<>();

        for (int i=1;i<=1;i++){
            publishers.add(new Publisher(1, "NXB Trẻ"));
        }

        List<Category> bookItemCategories = new ArrayList<>();
        bookItemCategories.add(new Category(1, "Tiểu thuyết", "Tiểu thuyết"));
        bookItemCategories.add(new Category(2, "Tâm lý", "Tâm lý"));
        List<Book> bestsellerBooks = new ArrayList<>();

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

        for (int i=1;i<=6;i++){
            bestsellerBooks.add(
               new Book(
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
                    bookItemAuthors,                // authors
                    publishers,             // publishers
                    bookItemCategories,             // categories
                    reviews,                // reviews
                    2019,                   // publisherYear
                    "Tiếng Việt",           // language
                    20 //discountPercent
                )
            );
        }

        // Sample Data for categories
        List<Category> categories = new ArrayList<>();
        categories.add(new Category(1, "Tâm lý - Kỹ năng sống", "tam-ly-ky-nang-song"));
        categories.add(new Category(2, "Văn học hiện đại", "van-hoc-hien-dai"));
        categories.add(new Category(3, "Văn học kinh điển", "van-hoc-kinh-dien"));
        categories.add(new Category(4, "Văn học thiếu nhi", "van-hoc-thieu-nhi"));
        categories.add(new Category(5, "Lãng mạn", "lang-man"));
        categories.add(new Category(6, "Kỳ ảo", "ky-ao"));
        categories.add(new Category(7, "Trinh thám - Kinh dị", "trinh-tham-kinh-di"));
        categories.add(new Category(8, "Khoa học Viễn tưởng", "khoa-hoc-vien-tuong"));
        categories.add(new Category(9, "Phiêu lưu ly kỳ", "phieu-luu-ly-ky"));
        categories.add(new Category(10, "Tản văn", "tan-van"));
        categories.add(new Category(11, "Truyện tranh (graphic novel)", "truyen-tranh"));
        categories.add(new Category(12, "Sách tranh (Picture book)", "sach-tranh"));
        categories.add(new Category(13, "Thơ - kịch", "tho-kich"));
        categories.add(new Category(14, "Light novel", "light-novel"));
        categories.add(new Category(15, "Sách tô màu", "sach-to-mau"));
        categories.add(new Category(16, "Phi hư cấu", "phi-hu-cau"));
        categories.add(new Category(17, "Triết học", "triet-hoc"));
        categories.add(new Category(18, "Sử học", "su-hoc"));
        categories.add(new Category(19, "Khoa học", "khoa-hoc"));
        categories.add(new Category(20, "Kinh doanh", "kinh-doanh"));
        categories.add(new Category(21, "Kinh tế chính trị", "kinh-te-chinh-tri"));
        categories.add(new Category(22, "Kỹ năng", "ky-nang"));
        categories.add(new Category(23, "Nghệ thuật", "nghe-thuat"));
        categories.add(new Category(24, "Nuôi dạy con", "nuoi-day-con"));
        categories.add(new Category(25, "Tiểu luận - phê bình", "tieu-luan-phe-binh"));
        categories.add(new Category(26, "Tâm lý ứng dụng", "tam-ly-ung-dung"));
        categories.add(new Category(27, "Tâm lý học", "tam-ly-hoc"));
        categories.add(new Category(28, "Hồi ký", "hoi-ky"));
        categories.add(new Category(29, "Y học - Sức khỏe", "y-hoc-suc-khoe"));
        categories.add(new Category(30, "Tâm linh - Tôn giáo", "tam-linh-ton-giao"));
        categories.add(new Category(31, "Kiến thức phổ thông", "kien-thuc-pho-thong"));
        categories.add(new Category(32, "Phong cách sống", "phong-cach-song"));
        categories.add(new Category(33, "Thiếu nhi", "thieu-nhi"));
        categories.add(new Category(34, "0-5 tuổi", "0-5-tuoi"));
        categories.add(new Category(35, "6-8 tuổi", "6-8-tuoi"));
        categories.add(new Category(36, "9-12 tuổi", "9-12-tuoi"));
        categories.add(new Category(37, "13-15 tuổi", "13-15-tuoi"));
        categories.add(new Category(38, "Phân loại khác", "phan-loai-khac"));
        categories.add(new Category(39, "Sách bán chạy", "sach-ban-chay"));
        categories.add(new Category(40, "Sách mới xuất bản", "sach-moi-xuat-ban"));
        categories.add(new Category(41, "Sách sắp xuất bản", "sach-sap-xuat-ban"));
        categories.add(new Category(42, "Sách được giải thưởng", "sach-giai-thuong"));
        categories.add(new Category(43, "Sách pop-up, lift-the-flaps", "sach-pop-up"));
        categories.add(new Category(44, "Nghiên cứu Việt Nam", "nghien-cuu-viet-nam"));
        categories.add(new Category(45, "Việt Nam danh tác", "viet-nam-danh-tac"));
        categories.add(new Category(46, "Tác giả Việt Nam", "tac-gia-viet-nam"));
        categories.add(new Category(47, "Bản đặc biệt", "ban-dac-biet"));
        categories.add(new Category(48, "Phụ kiện - Quà tặng", "phu-kien-qua-tang"));

        // Sample Data for authors section
        List<Author> authors = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            authors.add(new Author(i, "Paulo Coelho ", "/assets/images/authors/author.jpg",
                    "Paulo Coelho, tên đầy đủ là Paulo Coelho de Souza, sinh ngày 24 tháng 8 năm 1947"));
        }

        request.setAttribute("bestsellerBooks", bestsellerBooks);
        request.setAttribute("categories", categories);
        request.setAttribute("authors", authors);

        getServletContext().getRequestDispatcher(url).forward(request, response);
    }
}