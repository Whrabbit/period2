/*
 * Avans Hogeschool
 * Academie voor Engineering & ICT
 * Opleiding Informatica
 * Frans Spijkerman
 */
package bookstore;

/**
 *
 * @author Frans Spijkerman
 */
public class Item {
    
    // All attribute ar private, even hidden for subclasses
    // relevant values are accessible thru getters and print
    private final String title;
    private double price;
    private int stock; 

    public Item(String title, double price, int stock) {
        this.title = title;
        this.price = price;
        this.stock = stock;
    }
    public double getValue() {
        return stock * price;
    }
    public boolean sell(int amount){
        if (amount > stock){
            return false;
        }else{
            stock -= amount;
            return true;
        }
    }

    
    public String getTitle() {
        return title;
    }
    
    public void print() {
        double value = price * stock;
        System.out.print(String.format("%-25s  %6d  %8.2f  %8.2f", getTitle(), stock, price, value));
    }
    
    // Keep printHeader() close to print(), in case format changes
    public static void printHeader() {
        System.out.print(String.format("%-25s  %6s  %8s  %8s", "TITEL", "AANTAL", "PRIJS", "WAARDE"));
    }

    
}
