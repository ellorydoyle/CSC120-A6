import java.util.Hashtable;
/** 
 *  Class representing a Library
 *  The Library class is built upon the Building class
 */
public class Library extends Building {

  /** What are all of the books in the library? */
  private Hashtable <String, Boolean> collection;

    /** 
     *  Create a library with specified name, address, and floors
     *  @param name The name of the building
     *  @param address Where the building is located
     *  @param nFloors How many floors the building has
     */  
    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
    }

    /** 
     *  Add a book to the hastable of books
     *  @param title The title of the book
     */  
    public void addTitle (String title){
      if (this.collection.containsKey(title)){
        throw new RuntimeException(title + " is already a part of " + this.name + "'s catalogue.");
      }
      this.collection.put(title,true);
      System.out.println(title + " has been added to " + this.name + "'s catalogue. Give it a read!");
    }

    /** 
     *  Remove a book from the hastable of books
     *  @param title The title of the book
     *  @return The title of the book
     */ 
    public String removeTitle (String title){
      if (!this.collection.containsKey(title)){
        throw new RuntimeException (title + " is not a part of " + this.name + "'s cataloge.");
      }
      this.collection.remove(title);
      System.out.println(title + " has been removed from " + this.name + "'s catalogue. Hope you got to read it!");
      return title;
    }

    /** 
     *  Change the availability of a book to unavailable
     *  @param title The title of the book
     */ 
    public void checkOut (String title){
      if (!this.collection.containsKey(title)){
        throw new RuntimeException (title + " is not a part of " + this.name + "'s cataloge.");
      }
      this.collection.replace(title, false);
    }
    /** 
     *  Change the availability of a book to available
     *  @param title The title of the book
     */ 
    public void returnBook (String title){
      if (!this.collection.containsKey(title)){
        throw new RuntimeException (title + " is not a part of " + this.name + "'s cataloge.");
      }
      this.collection.replace(title, true);
    }

    /** 
     *  Check if the library carries a certain book
     *  @param title The title of the book
     *  @return A boolean on whether or not the library carries the book
     */ 
    public boolean containsTitle (String title){
      if (this.collection.containsKey(title)){
        System.out.println(title + " is a part of " + this.name + "'s cataloge.");
        return true;
      }
      else{
        System.out.println(title + " is not a part of " + this.name + "'s cataloge.");
        return false;
      }
    }

    /** 
     *  Add a book to the list of hastable of books
     *  @param title The title of the book
     *  @return A boolean on whether or not the book is available
     */ 
    public boolean isAvailable (String title){
      if (!this.collection.containsKey(title)){
        throw new RuntimeException (title + " is not a part of " + this.name + "'s cataloge.");
      }
      if (this.collection.get(title) == false){
        System.out.println(title + " is not currently available.");
        return false;
      }
      else{
        System.out.println(title + " is currently available.");
        return true;
      }
    }

    /** 
     *  Print the collection of books at the library
     */ 
    public void printCollection(){
      /////
      this.collection.entrySet().forEach( entry -> {
        System.out.print(entry.getKey() + ": ");
        if (entry.getValue() == true){
          System.out.println("Available");
        }
        if(entry.getValue() == false){
          System.out.println("Unavailable");
        }
      });
    }

    /** 
     *  Converts all of the library information into a readable string
     *  @return the description of the library
     */ 
    public String toString() {
      String description = super.toString();
      return description;
    }
  }