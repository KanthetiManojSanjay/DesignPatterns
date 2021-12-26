package factory;

/**
 * @author kansanja on 18/12/21.
 */
public class OperatingSystemFactory {
    public OS getInstance(String name) {
        if (name.equals("Open")) {
            return new Android();
        } else if (name.equals("Closed")) {
            return new IOS();
        } else {
            return new Windows();
        }
    }
}
