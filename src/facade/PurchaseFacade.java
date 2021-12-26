package facade;

/**
 * @author kansanja on 18/12/21.
 */

// Facade layer is to simplify for client consumption
public class PurchaseFacade {
    Inventory inventory = new Inventory();
    Orders orders = new Orders();

    public void placeOrder(int cust_id, int item_id) {
        // Check inventory for item
        if (inventory.checkInventory(item_id)) {

            // reduce item in inventory
            inventory.reduceInventory(item_id);

            // Get ItemValue for item from inventory
            double itemvalue = inventory.getItemvalue(item_id);

            // Get Accout number for customerId
            int accountNumber = orders.getAccountNumber(cust_id);

            // Reduce Account balance for account number for itemvalue
            orders.reduceAccountBalance(accountNumber, itemvalue);

            // Insert order for customerId for an item
            int orderNo = orders.insertOrder(cust_id, item_id);
            System.out.println("order placed successfully with orderNo: " + orderNo);
        }
    }
}
