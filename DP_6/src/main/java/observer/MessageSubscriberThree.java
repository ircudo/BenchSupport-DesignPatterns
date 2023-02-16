package observer;

import message.*;

public class MessageSubscriberThree implements Observer {
    @Override
    public void update(Message m) {
        System.out.println("Three:: " + m.getMessageContent());
    }
}
