package naoki.business;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.List;

public class Book implements Serializable {
    private int id;
    private String title;
    private String description;
    private String ISBN;
    private double costPrice;
    private double sellingPrice;
    private int stock;
    private String imageURL;
    private List<Author> authors;
    private List<Publisher> publishers;
    private List<Category> categories;
    private List<Review> reviews;
    private int publishYear;
    private String language;
    private int discountPercent;

    // No-argument constructor (JavaBean requirement)
    public Book() {}

    // Parameterized constructor
    public Book(int id, String title, String description, String ISBN, double costPrice, double sellingPrice,
                int stock, String imageURL, List<Author> authors, List<Publisher> publishers, List<Category> categories,
                List<Review> reviews, int publishYear, String language, int discountPercent) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.ISBN = ISBN;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
        this.stock = stock;
        this.imageURL = imageURL;
        this.authors = authors;
        this.publishers = publishers;
        this.categories = categories;
        this.reviews = reviews;
        this.publishYear = publishYear;
        this.language = language;
        this.discountPercent = discountPercent;
    }

    // Getters and Setters (JavaBean requirement)

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getFormattedSellingPrice() {
        DecimalFormat vietnameseFormat = new DecimalFormat("#,###");
        return vietnameseFormat.format(sellingPrice);
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public List<Publisher> getPublishers() {
        return publishers;
    }

    public void setPublishers(List<Publisher> publishers) {
        this.publishers = publishers;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(int discountPercent) {
        this.discountPercent = discountPercent;
    }

}
