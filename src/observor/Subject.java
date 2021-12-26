package observor;

/**
 * @author kansanja on 18/12/21.
 */
public interface Subject {
    void subscribe(Subscriber subscriber);

    void unSubscribe(Subscriber subscriber);

    void notifySubscribers();

    void upload(String title);
}
