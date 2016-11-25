/*
 * Avans Hogeschool
 * Academie voor Engineering & ICT
 * Opleiding Informatica
 * Frans Spijkerman
 */
package bookstore;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Frans Spijkerman
 */
public class Bookstore {

    private final List<Item> items = new ArrayList<>();
    
    void addItem(Item item) {
        items.add(item);
    }
    
    void print() {
        
        System.out.print("  "); // extra room for item type
        Item.printHeader();
        System.out.println();
        
        double totalValue = 0;
        for(Item item : items) {
            item.print();
            totalValue += item.getValue();
        }
        System.out.println(String.format("%46s %8.2f", "TOTALE WAARDE:", totalValue));
    }
    void sell(String title, int amount){
        for (Item item : items){
            if(item.getTitle() == title){
                item.sell(amount);
            }
        }
    }
    public static void test() {
        System.out.println("\nTesting BookSstore\n");
        Bookstore store = new Bookstore();
        Item duck2 = new Magazine("Donald Duck", 3, 1.80, 6);
        
        store.addItem(new Magazine("Donald Duck", 3, 1.80, 6));
        store.addItem(new Magazine("Donald Duck", 4, 1.80, 12));
        store.addItem(new Magazine("Voetbal International", 33, 2.30, 3));
        store.addItem(new Book("Aan de slag met Java", 45, 17));
        
        duck2.sell(1);
        
        store.sell("Aan de slag met java", 15);
        
        store.print();
    }
}
