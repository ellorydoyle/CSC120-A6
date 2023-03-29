/* This is a stub for the Cafe class */
public class Cafe extends Building{
    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups;

    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.nCoffeeOunces = 100;
        this.nSugarPackets = 50;
        this.nCreams = 50;
        this.nCups = 200;
        System.out.println("You have built a cafe: ☕");
    }
    
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

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces = 100;
        this.nSugarPackets = 50;
        this.nCreams = 50;
        this.nCups = 200;
    }
    public static void main(String[] args) {
        Cafe madwimmin = new Cafe("Madwimmin Cafe", "Minneapolis, MN", 1);
        System.out.println(madwimmin);
        madwimmin.sellCoffee(95, 20, 5);
        madwimmin.sellCoffee(30, 1, 50);
    }
    
}
