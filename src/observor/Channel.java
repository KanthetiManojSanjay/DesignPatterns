package observor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kansanja on 18/12/21.
 */
public class Channel implements Subject {
    private List<Subscriber> subscriberList = new ArrayList<>();
    String title;

    @Override
    public void subscribe(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void unSubscribe(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscriberList) {
            subscriber.update();
        }
    }

    @Override
    public void upload(String title) {
        this.title = title;
        notifySubscribers();
    }
}
