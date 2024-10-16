package naoki.business;

import java.time.LocalDate;
import java.util.Date;

public class Review {
    private int id;
    private String description;
    private int rating;
    private LocalDate reviewDate;
//    @ManyToOne
//    @JoinColumn(name="customerID")
//    private Customer customer;
//    @ManyToOne
//    @JoinColumn(name="bookID")
//    private Book book;

    //constructor
    public Review() {

    }
//    public Review(int reviewID, String description, Customer customer, Book book) {
//        this.reviewID = reviewID;
//        this.description = description;
//        this.customer = customer;
//        this.book = book;
//    }

    public  Review(int id, String description, int rating, LocalDate reviewDate) {
        this.id = id;
        this.description = description;
        this.rating = rating;
        this.reviewDate = reviewDate;
    }

    //get & set
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public LocalDate getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(LocalDate reviewDate) {
        this.reviewDate = reviewDate;
    }
//    public Customer getCustomer() {
//        return customer;
//    }
//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }
//    public Book getBook() {
//        return book;
//    }
//    public void setBook(Book book) {
//        this.book = book;
//    }

}
