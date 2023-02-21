package client;


import message.*;
import observer.*;
import subject.*;

public class Main {
    public static void main(String[] args) {
        testObserver();
    }

    private static void testObserver() {

        // create three observers (subscribers): s1, s2, s3
        MessageSubscriberOne s1 = new MessageSubscriberOne();
        MessageSubscriberTwo s2 = new MessageSubscriberTwo();
        MessageSubscriberThree s3 = new MessageSubscriberThree();

        // create a publisher
        MessagePublisher publisher = new MessagePublisher();

        // attach s1 and s2 to the publisher
        publisher.attach(s1);
        publisher.attach(s2);

        // notify the [current] subscribers - send them "First Message"
        publisher.notifyUpdate(new Message("First Message"));

        // detach s1 and attach s3
        publisher.detach(s1);
        publisher.attach(s3);

        // notify the [current] subscribers - send them "Second Message"
        publisher.notifyUpdate(new Message("Second Message"));

    }
}
