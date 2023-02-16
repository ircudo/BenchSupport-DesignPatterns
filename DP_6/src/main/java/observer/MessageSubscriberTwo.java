package observer;

import message.*;

public class MessageSubscriberTwo implements Observer {
    @Override
    public void update(Message m) {
        System.out.println("Two:: " + m.getMessageContent());
    }
}
