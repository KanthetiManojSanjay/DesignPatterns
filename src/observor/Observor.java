package observor;

/**
 * @author kansanja on 18/12/21.
 */
public interface Observor {
    void update();

    void subscribeChannel(Channel ch);
}
