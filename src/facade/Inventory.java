package facade;

/**
 * @author kansanja on 18/12/21.
 */
public class Inventory {
    public boolean checkInventory(int itemId) {
        System.out.println("Checking inventory for item " + itemId);
        return true;
    }

    public void reduceInventory(int itemId) {
        System.out.println("Reduced inventory for item " + itemId + " by 1");
    }

    public double getItemvalue(int itemId) {
        System.out.println("returning value for item " + itemId);
        return 10.00;
    }
}

