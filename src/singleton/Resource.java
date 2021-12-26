package singleton;

/**
 * @author kansanja on 18/12/21.
 */
public class Resource {
    private static volatile Resource instance;

    private Resource() {

    }

    public static Resource getInstance() {
        // first check
        if (instance == null) {
            synchronized (Resource.class) {
                //second check
                if (instance == null) {
                    return instance = new Resource();
                }
            }
        }
        return instance;
    }
}
