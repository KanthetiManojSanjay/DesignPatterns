package prototype;

/**
 * @author kansanja on 18/12/21.
 */
public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {

        // 2nd object is created by cloning from 1st object - Prototype DP(part of Creational DP)
        BookShop bs1 = new BookShop();
        bs1.setShopName("Novelty");
        bs1.loadBooks();


        // Shallow cloning
//        BookShop bs2 = (BookShop) bs1.clone();

        // Deep cloning
        BookShop bs2 = bs1.clone();
        bs1.getBooks().remove(2);

        System.out.println(bs1);
        System.out.println(bs2);
    }
}
