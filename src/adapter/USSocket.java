package adapter;

/**
 * @author kansanja on 18/12/21.
 */
public class USSocket implements USSocketInterface {
    @Override
    public void powerUp() {
        System.out.println("Plugged in & running from US Power Source");
    }
}
