package bookstore;

/*
 * Avans Hogeschool
 * Academie voor Engineering & ICT
 * Opleiding Informatica
 * Frans Spijkerman
 */

/**
 *
 * @author Frans Spijkerman
 */
public class Magazine extends Item {

    private final int issue;
    
    public Magazine(String title, int issue, double price, int stock) {
        super(title, price, stock);
        this.issue = issue;
    }
    
    /**
     *
     * @return tile of magazine, including issue number;
     */
    @Override
    public String getTitle() {
        return super.getTitle() + " #" + issue;
    }
    
    @Override
    public void print() {
        System.out.print("T ");
        super.print();
        System.out.println();
    }
    
}
