package factory;

/**
 * @author kansanja on 18/12/21.
 */
public class FactoryMain {
    public static void main(String[] args) {

        // Using Factory Client code willn't be modified
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS os2 = osf.getInstance("Open");
        os2.spec();
    }
}
