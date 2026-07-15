// Superclass
class Book {
    protected String title;
    protected int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}

// Subclass
class Author extends Book {
    private String name;
    private String bio;

    public Author(String title, int publicationYear,
                  String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // Method to display book and author details
    public void displayInfo() {
        System.out.println("Book Title      : " + title);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Author Name     : " + name);
        System.out.println("Author Bio      : " + bio);
    }
}

// Main class
public class LibraryManagement {
    public static void main(String[] args) {

        Author a1 = new Author(
                "Java Programming",
                2024,
                "Rahul Sharma",
                "Software Developer and Java Trainer");

        a1.displayInfo();
    }
}