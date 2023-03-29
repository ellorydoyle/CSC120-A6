import java.util.Hashtable;
/* This is a stub for the Library class */
public class Library extends Building {

  private Hashtable <String, Boolean> collection;
  public boolean containsTitle;

    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      Hashtable <String, Boolean> collection = new Hashtable<>();
      System.out.println("You have built a library: 📖");
    }

    public void addTitle (String title){
      if (this.collection.contains(title)){
        throw new RuntimeException(title + " is already a part of " + this.name + "'s catalogue.");
      }
      this.collection.put(title,true);
      System.out.println(title + " has been added to " + this.name + "'s catalogue. Give it a read!");
    }
  
    public String removeTitle (String title){
      if (!this.collection.contains(title)){
        throw new RuntimeException ("This title is not a part of " + this.name + "'s cataloge.");
      }
      this.collection.remove(title);
      System.out.println(title + " has been removed from " + this.name + "'s catalogue. Hope you got to read it!");
      return title;
    }

    public void checkOut (String title){
      if (!this.collection.contains(title)){
        throw new RuntimeException (title + " is not a part of " + this.name + "'s cataloge.");
      }
      this.collection.replace(title, false);
    }

    public void returnBook (String title){
      if (!this.collection.contains(title)){
        throw new RuntimeException (title + " is not a part of " + this.name + "'s cataloge.");
      }
      this.collection.replace(title, true);
    }

    public boolean containsTitle (String title){
      if (this.collection.contains(title)){
        System.out.println(title + " is a part of " + this.name + "'s cataloge.");
        return true;
      }
      else{
        System.out.println(title + " is not a part of " + this.name + "'s cataloge.");
        return false;
      }
    }

    public boolean isAvailable (String title){
      if (!this.collection.contains(title)){
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

    public void printCollection(){
      /////
      this.collection.entrySet().forEach( entry -> {
        System.out.println(entry.getKey() + ": ");
        if (entry.getValue() == true){
          System.out.println("available");
        }
        if(entry.getValue() == false){
          System.out.println("unavailable");
        }
      });
    }

    public String toString() {
      String description = super.toString();
      return description;
    }
    public static void main(String[] args) {
      Library williamMcKinley = new Library("William McKinley Public Library", "Lima, OH", 3);
      System.out.println(williamMcKinley);
      williamMcKinley.addTitle("Super Bass");
      williamMcKinley.containsTitle("Super Bass");
      williamMcKinley.containsTitle("Not So Super Bass");
      williamMcKinley.removeTitle("Super Bass");
      williamMcKinley.removeTitle("Not So Super Bass");
    }
  }