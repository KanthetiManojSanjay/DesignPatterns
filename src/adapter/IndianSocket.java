package adapter;

/**
 * @author kansanja on 18/12/21.
 */
public class IndianSocket implements IndianSocketInterface {
    @Override
    public void provideElectricity() {
        System.out.println("Plugged in & running from Indian power source");
    }
}
