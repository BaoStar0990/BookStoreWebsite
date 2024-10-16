package naoki.business;

import java.io.Serializable;

public class Publisher implements Serializable {
    private int id;
    private String name;

//    @OneToMany(mappedBy = "publisher",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//    private Set<Book> books = new HashSet<Book>();

    public Publisher(){

    }
    public Publisher(int id, String name) {
        this.id = id;
        this.name = name;

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
