package Ex5.Domain;

import Ex5.Event;
import Ex5.EventManager;

public class Product {
    private EventManager events = new EventManager();

    private String title;
    private Integer price;
    private Integer discount;

    public Product(String title, Integer price) {
        this.title = title;
        this.price = price;
        this.discount = 0;
    }

    public String getTitle() {
        return title;
    }

    public Integer getPrice() {
        return price;
    }

    public EventManager getEvents() {
        return events;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
        events.notifySubscribers(Event.DISCOUNT, this.title);
    }
}
