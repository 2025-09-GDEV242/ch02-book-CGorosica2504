/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Christian Gorosica)
 * @version (09.22.2025)
 */
class Book
{
    //Field for the author of the book
    private String author;
    //Field for the title of the book
    private String title;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }

    /**
     * This method returns the author of the book as a String.
     */
    public String getAuthor() {
        return author;
    }
    
    /**
     * This method returns the title of the book as a String.
     */
    public String getTitle() {
        return title;
    }
}
