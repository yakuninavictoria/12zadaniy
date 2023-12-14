package Ex5.Domain;

import Ex5.Event;
import Ex5.Subscriber;

public class Customer implements Subscriber {
    private String nickname;

    public Customer(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public void update(Event event, String text) {
        if (event == Event.DISCOUNT) {
            System.out.println("Пользователь под ником \"" + nickname + "\" был оповещен о скидке на товар \"" + text + "\"");
        }
    }

}
