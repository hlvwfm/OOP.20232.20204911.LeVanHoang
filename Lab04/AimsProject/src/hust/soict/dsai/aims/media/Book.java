package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    private List<String> authors = new ArrayList<String>();
    public Book(int id, String title, String category, float cost, List<String> authors) {
        super();
        setId(id);
        setTitle(title);
        setCategory(category);
        setCost(cost);
        this.authors = authors;
    }
    public void addAuthor(String authorName) {
        // make sure the author is not already in the ArrayList before adding
        if (!authors.contains(authorName)) {
            authors.add(authorName);
            System.out.println("Author added: " + authorName);
        } else {
            System.out.println("Author already exists: " + authorName);
        }
    }
    public void removeAuthor(String authorName) {
        // make sure the author is present in the ArrayList before removing
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Author removed: " + authorName);
        } else {
            System.out.println("Author not found: " + authorName);
        }
    }
}
