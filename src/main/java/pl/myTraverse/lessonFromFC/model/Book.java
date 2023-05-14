package pl.myTraverse.lessonFromFC.model;

public class Book {
    private final String title;
    private final Author author;
    private final BookCategory bookCategory;


    public Book(String title, Author author, BookCategory bookCategory) {
        this.title = title;
        this.author = author;
        this.bookCategory = bookCategory;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", bookCategory=" + bookCategory +
                '}';
    }
}
