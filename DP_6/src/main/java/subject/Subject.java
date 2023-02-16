package subject;

import message.*;
import observer.*;

public interface Subject {
    void attach(Observer o);
    void detach(Observer o);
    void notifyUpdate(Message m);
}
