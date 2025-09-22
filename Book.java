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
    //Field for the amount of pages of the book
    private int pages;
    //Field for the library reference number of the book
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
    }

    /**
     * This method returns the author of the book as a String.
     * 
     * This method satisfies Problem 2.83
     */
    public String getAuthor() {
        return author;
    }
    
    /**
     * This method returns the title of the book as a String.
     * 
     * This method satisfies Problem 2.83
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * This method prints the value from the author field to the terminal
     * window.
     * 
     * This method satisfies Problem 2.84
     */
    public void printAuthor() {
        System.out.println("Book Author: " + author);
    }
    
    /**
     * This method prints the value from the title field to the terminal
     * window.
     * 
     * This method satisfies Problem 2.84
     */
    public void printTitle() {
        System.out.println("Book Title: " + title);
    }
    
    /**
     * This method returns the number of pages of the book as an int.
     * 
     * This method satisfies Problem 2.85
     */
    public int getPages() {
        return pages;
    }
    
    /**
     * This method prints all of the book's details from the author, title,
     * and pages fields.
     * 
     * It also prints a line for the refNumber field whose content depends on
     * whether or not a value has been set for it.
     * 
     * This method satisfies Problem 2.87 and Problem 2.89
     */
    public void printDetails() {
        System.out.println("Book Title: " + title
                        + "\nBook Author: " + author
                        + "\nBook Page Amount: " + pages + " pages");
        
        /**
         * Conditional statement to decide how to print the library reference
         * number print depending on whether or not a value has been set to 
         * the refNumber field.
         */
        if (refNumber.length() > 0) {
            System.out.println("Library Reference Number: " + refNumber);
        } else {
            System.out.println("ZZZ");
        }
    }
    
    /**
     * This methods set a new String value for the refNumber field
     * 
     * This method performs a check to make sure that the new value for the
     * refNumber field has at least 3 characters or more.
     * 
     * This method satisfies Problem 2.88 and Problem 2.90
     */
    public void setRefNumber(String ref) {
        if (ref.length() > 2) {
            refNumber = ref;
        } else {
            System.out.println("[ERROR] The library reference number"
            + " must be at least three characters or more.");
        }
    }
    
    /**
     * This method returns the reference number of the book as a String.
     */
    public String getRefNumber() {
        return refNumber;
    }
}
