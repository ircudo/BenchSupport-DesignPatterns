package subject;

import message.*;
import observer.*;
import observer.Observer;

import java.util.*;

public class MessagePublisher implements Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyUpdate(Message m) {
        for (Observer o: observers) {
            o.update(m);
        }
    }
}
