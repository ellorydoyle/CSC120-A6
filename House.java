import java.util.ArrayList;
/** 
 *  Class representing a House
 *  The House class is built upon the Building class
 */
public class House extends Building {

  /**  Who lives in the house? */
  private ArrayList<String> residents;
  /**  Does the house have a dining room? */
  private boolean hasDiningRoom;

  /** 
   *  Create a house with specified name, address, floors, and whether or not it has a dining room
   *  @param name The name of the building
   *  @param address Where the building is located
   *  @param nFloors How many floors the building has
   *  @param hasDiningRoom If the house has a dining room or not
   */
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  /** 
   *  Check if the house has a dining room 
   *  @return true or false on whether the house has a dining room
   */
  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  }

  /** 
   *  Check how many residents are in the house 
   *  @return the number of residents in the house
   */
  public int nResidents(){
    return this.residents.size();
  }

  /** 
   *  Add a student onto the list of residents 
   *  @param name The name of the student
   */
  public void moveIn(String name){
    if (this.residents.contains(name)){
      throw new RuntimeException(name + " is already a resident of " + this.name + ".");
    }
    this.residents.add(name);
    System.out.println(name + " has just moved into " + this.name + "! Go say hello :-)");
  }

  /** 
   *  Remove a student from the list of residents
   *  @param name The name of the student
   *  @return The name of the student
   */
  public String moveOut(String name){
    if (!this.residents.contains(name)){
      throw new RuntimeException(name + " is not a resident of " + this.name + ".");
    }
    this.residents.remove(name);
    System.out.println(name + " has just moved out of " + this.name + ". I hope you said your goodbyes!");
    return name;
  }

  /** 
   *  Check if a student is a resident of the house
   *  @param person The name of the student
   *  @return A boolean on whether the student is a resident
   */
  public boolean isResident(String person){
    if (!this.residents.contains(person)){
      System.out.println(person  + " is not a resident of " + this.name + ".");
      return false;
    }
    if (this.residents.contains(person)){
      System.out.println(person + " is a resident of " + this.name + ".");
      return true;
    }
    else{
      throw new RuntimeException("Something went wrong. Please check inputs.");
    }
  }

  /** 
   *  Converts all of the house information into a readable string
   *  @return The description of the house
   */
  public String toString() {
    String description = super.toString();
    if (this.nResidents() == 1){
      description += " There is currently " + this.nResidents() + " person living in this house.";
    }
    else {
      description += " There are currently " + this.nResidents() + " people living in this house.";
    }
    description += " This house ";
    if (this.hasDiningRoom) {
      description += "has";
    } else {
      description += "does not have";
    }
    description += " an active dining room.";
    return description;
  }
}