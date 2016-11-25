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
public class Book extends Item {

    public Book(String title, double price, int stock) {
        super(title, price, stock);
    }
    
    @Override
    public void print() {
        System.out.print("B ");
        super.print();
        System.out.println();
    }
}