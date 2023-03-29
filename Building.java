/** 
 *  Class representing a Building 
 *  The Building class serves as the basis for all buildings
 */
public class Building {

    /**  What is the building called? */
    protected String name = "<Name Unknown>";
    /**  Where is the building located? */
    protected String address = "<Address Unknown>";
    /**  How many floors does the building have? */
    protected int nFloors = 1;

  /** 
   *  Create a building with specified name, address, and floors 
   *  @param name The name of the building
   *  @param address Where the building is located
   *  @param nFloors How many floors the building has
   */
    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }

  /** 
   *  Retrieve the name of the building
   *  @return the name of the building
   */
    public String getName() {
        return this.name;
    }

  /** 
   *  Retrieve the address of the building
   *  @return the address of the building
   */
    public String getAddress() {
        return this.address;
    }

  /** 
   *  Retrieve the number of floors in the building
   *  @return the number of floors of the building
   */
    public int getFloors() {
        return this.nFloors;
    }

  /** 
   *  Converts all of the building information into a readable string
   *  @return the string of building information
   */
    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address + ".";
    }
}
