/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Jonathan Quevedo.)
 * @version (9-16-19)
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    private int pages;
    public String refNumber;
    int borrowed; 

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

    // accessor methods
    public String getAuthor(){
        return author;
}

 public String getTitle(){
     return title;
   }
     
 public int getPages(){
        return pages;
    }
 public String getRefNumber(){
      return RefNumber;
 }
 public void setRefNumber(String ref){
      if (ref.length() >= 3){   
      refNumber = ref;
 }
      else{
           System.out.println("Reference # must be 3 characters");
      }
 public void borrow(){
      borrowed = borrowed + 1;
 }
   

// print author
public void printAuthor(){
    System.out.println("Author :" +author);
}

// print title
public void printTitle(){
    System.out.println("Title :" +title);
}
public void printDetails(){
    System.out.println("Title: " + title + ", Author: " + author
                                    + ", Pages: " + pages);
    if(refNumber.length()> 0){
     System.out.println("Reference number: " + refNumber);    
         
}
else{
     System.out.println("ZZZ");
    }
     System.out.println("\"" + title + "\" has been borrowed " + borrowed + times")
}
    
}


    
    


    
