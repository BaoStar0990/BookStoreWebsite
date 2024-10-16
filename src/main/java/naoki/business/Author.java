package naoki.business;

import java.io.Serializable;

public class Author implements Serializable {
    private int id;
    private String name;
    private String imageURL;
    private String description;

    public Author() {
        id = 0;
        name = "";
        imageURL = "";
        description = "";
    }

    public Author(int id, String name, String imageURL, String description) {
        this.id = id;
        this.name = name;
        this.imageURL = imageURL;
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getImageURL() {return imageURL;
    }

    public String getDescription(){ return description; }

    public void setDescription(String description){ this.description = description; }
}
