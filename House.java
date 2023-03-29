import java.util.ArrayList;
/* This is a stub for the House class */
public class House extends Building {

  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  }

  public int nResidents(){
    return this.residents.size();
  }

  public void moveIn(String name){
    if (this.residents.contains(name)){
      throw new RuntimeException(name + " is already a resident of " + this.name + ".");
    }
    this.residents.add(name);
    System.out.println(name + " has just moved into " + this.name + "! Go say hello :-)");
  }

  public String moveOut(String name){
    if (!this.residents.contains(name)){
      throw new RuntimeException(name + " is not a resident of " + this.name + ".");
    }
    this.residents.remove(name);
    System.out.println(name + " has just moved out of " + this.name + ". I hope you said your goodbyes!");
    return name;
  }

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

  public static void main(String[] args) {
    House morrow = new House("Morrow", "The Quad", 4, false);
    System.out.println(morrow);
    morrow.moveIn("Jordan");
    System.out.println(morrow);
    House king = new House("King", "The Quad", 3, true);
    System.out.println(king);
    morrow.isResident("Jordan");
    king.isResident("Jordan");
  }

}