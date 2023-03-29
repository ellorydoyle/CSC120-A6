/** 
 *  Class representing a Cafe
 *  The Cafe class is built upon the Building class
 */
public class Cafe extends Building{
    /** How many ounces of coffee does the cafe currently have? */
    private int nCoffeeOunces;
    /** How many packets of sugar does the cafe currently have? */
    private int nSugarPackets;
    /** How many packets of cream does the cafe currently have? */
    private int nCreams;
    /** How many cups does the cafe currently have? */
    private int nCups;

    /** 
     *  Create a Cafe with specified name, address, and floors
     *  @param name The name of the building
     *  @param address Where the building is located
     *  @param nFloors How many floors the building has
     */
    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.nCoffeeOunces = 100;
        this.nSugarPackets = 50;
        this.nCreams = 50;
        this.nCups = 200;
        System.out.println("You have built a cafe: ☕");
    }
    
    /** 
     *  Sell a coffee and decrease the stock
     *  @param size The number of oz in the coffee
     *  @param nSugarPackets The number of sugar packets in the coffee
     *  @param nCreams The number of creams in the coffee
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if (size > this.nCoffeeOunces){
            System.out.println(this.name + " is low on at least one item. Let the restocking commence!");
            restock(nCoffeeOunces, nSugarPackets, nCreams, nCups);
        }
        if (nSugarPackets > this.nSugarPackets){
            System.out.println(this.name + " is low on at least one item. Let the restocking commence!");
            restock(nCoffeeOunces, nSugarPackets, nCreams, nCups);
        }
        if (nCreams > this.nCreams){
            System.out.println(this.name + " is low on at least one item. Let the restocking commence!");
            restock(nCoffeeOunces, nSugarPackets, nCreams, nCups);
        }
        if (nCups == 0){
            System.out.println(this.name + " is low on at least one item. Let the restocking commence!");
            restock(nCoffeeOunces, nSugarPackets, nCreams, nCups);
        }
        this.nCoffeeOunces = this.nCoffeeOunces - size;
        this.nSugarPackets = this.nSugarPackets - nSugarPackets;
        this.nCreams = this.nCreams - nCreams;
        this.nCups = this.nCups-1;
        System.out.print("Here is your coffee! In it contains " + size + " oz of coffee, ");
        if (nSugarPackets == 1){
            System.out.print(nSugarPackets + " packet of sugar, and ");
        }
        else{
            System.out.print(nSugarPackets + " packets of sugar, and ");
        }
        if (nCreams == 1){
            System.out.println(nCreams + " container of cream.");
        }
        else{
            System.out.println(nCreams + " containers of cream.");
        }
    }

    /** 
     *  Restock all of the cafe materials
     *  @param nCoffeeOunces The number of oz in the store
     *  @param nSugarPackets The number of sugar packets in the store
     *  @param nCreams The number of creams in the store
     *  @param nCups The number of cups in the store
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces = 100;
        this.nSugarPackets = 50;
        this.nCreams = 50;
        this.nCups = 200;
    }
}
