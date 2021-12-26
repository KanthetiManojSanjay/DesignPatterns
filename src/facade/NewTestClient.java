package facade;

/**
 * @author kansanja on 18/12/21.
 */
public class NewTestClient {
    public static void main(String[] args) {
        PurchaseFacade pf = new PurchaseFacade();
        pf.placeOrder(1, 2);
    }
}
