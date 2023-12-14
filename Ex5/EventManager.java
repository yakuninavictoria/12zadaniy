package Ex5;

import java.util.ArrayList;
import java.util.HashMap;

public class EventManager {
    private HashMap<Subscriber, ArrayList<Event>> subscribers = new HashMap<>();

    public void subscribe(Event event, Subscriber subscriber) {
        if (!subscribers.containsKey(subscriber)) {                 //проверка на наличие подписчика
            subscribers.put(subscriber, new ArrayList<>());
        }
        if (!subscribers.get(subscriber).contains(event)) {         //проверка на наличие собыитя у подписчика
            subscribers.get(subscriber).add(event);
        }
    }

    public void unsubscribe(Event event, Subscriber subscriber) {
        if (subscribers.containsKey(subscriber)) {                 //проверка на наличие подписчика
            if (subscribers.get(subscriber).contains(event)) {     //проверка на наличие собыитя у подписчика
                subscribers.get(subscriber).remove(event);
            }
        }
    }

    public void notifySubscribers(Event event, String text) {
        for (Subscriber subscriber : subscribers.keySet()) {
            if (subscribers.get(subscriber).contains(event)) {
                subscriber.update(event, text);
            }
        }
    }

}
