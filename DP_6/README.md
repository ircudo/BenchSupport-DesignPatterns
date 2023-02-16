# Observer design pattern

The observer pattern has four participants.

- Subject – interface or abstract class defining the operations for attaching and de-attaching observers to the subject.
- ConcreteSubject – concrete Subject class. It maintains the state of the object and when a change in the state occurs it notifies the attached Observers.
- Observer – interface or abstract class defining the operations to be used to notify this object.
- ConcreteObserver – concrete Observer implementations.

## Steps

- Create state object (`Message`)
    - this must be immutable object so that no class can modify its content by mistake
- Create `Observer` interface
- Create concrete observers
- Create `Subject` interface
- Create concrete subject `MessagePublisher`
- Test communication between publisher and subscribers
