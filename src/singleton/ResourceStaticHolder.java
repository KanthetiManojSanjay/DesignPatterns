package singleton;

/**
 * @author kansanja on 18/12/21.
 */
public class ResourceStaticHolder {
    private static class Holder {
        static final ResourceStaticHolder instance = new ResourceStaticHolder();
    }

    public static ResourceStaticHolder getInstance() {
        return Holder.instance;
    }

    private ResourceStaticHolder() {

    }
}
