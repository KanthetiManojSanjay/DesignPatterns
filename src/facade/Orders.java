package facade;

import java.util.Random;

/**
 * @author kansanja on 18/12/21.
 */
public class Orders {
    public int getAccountNumber(int cust_id) {
        System.out.println("getting account number for " + cust_id);
        return 100;
    }

    public void reduceAccountBalance(int act_id, double item_value) {
        System.out.println("reducing account value for account number " + act_id + " by " + item_value);
    }

    public int insertOrder(int cust_id, int item_id) {
        int orderNo = new Random().nextInt(1000);
        System.out.println("placed order " + orderNo + " for customer id " + cust_id + " for item " + item_id);
        return orderNo;
    }
}
