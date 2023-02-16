package observer;

import message.*;

public class MessageSubscriberOne implements Observer {
    @Override
    public void update(Message m) {
        System.out.println("One:: " + m.getMessageContent());
    }
}
