package adapter;

/**
 * @author kansanja on 18/12/21.
 */
public class Tester {
    public static void main(String[] args) {

        USSocketInterface usSocketInterface = new USSocket();
        USPowerPlug usPowerPlug = new USPowerPlug(usSocketInterface);
        usPowerPlug.plugInAndRun();


        IndianSocketInterface indSocketInterface = new IndianSocket();
        usPowerPlug = new USPowerPlug(new IndianPowerAdapater(indSocketInterface));
        usPowerPlug.plugInAndRun();
    }
}
