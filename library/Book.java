package library;
public class Book {
	
    private String title;
    private String author;
    private String ISBN;
    private boolean isIssued;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isIssued = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean issued) {
        isIssued = issued;
    }

    @Override
    public String toString() {
        return "\nBook \ntitle=" + title + ",\n author=" + author + ",\n ISBN=" + ISBN + ",\n isIssued=" + isIssued + "\n";
    }
}
