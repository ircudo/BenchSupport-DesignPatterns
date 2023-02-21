# Design Patterns

Designing object-oriented software is hard, and designing _reusable_ object-oriented software is even harder. Why?
- You must: 
   - identify [clearly related] objects
   - factor them into classes at the right granularity
   - define class intefaces and inheritance hierarhies
   - establish key relationships among them.
- Your design must be specific to the problem at hand
   - but also general enough to adress future problems and requirements.
- You also want to avoid redesign, or at least minimize it.

Experienced object-oriented designers follow an important principle:
**_Not_ to solve every problem (rather reuse solutions that worked for them in the past)**

**A Design pattern is a recurring solution to a recurring problem**

Good patterns strike a balance between the size of the problem they solve and the specificity with which they address the problem. 

Design patterns originated outside of the computer industry, originally showing up in architecture. Architecture of buildings and architecture of software have more in common than one may think. 
Christopher Alexander (British-American architect and design theorist) said, " Each pattern desribes a problem which occurs over and over again in our environment, and then describes the core of the solution to that problem, in such a way that you can use this solution a million times over, without ever doing it the same way twice". 
* [Christopher Alexander 12 iconic projects](https://www.re-thinkingthefuture.com/design-studio-portfolios/a2284-christopher-alexander-12-iconic-projects/)

Consequently, you'll find recurring patterns of classes and communicating objects in many object-oriented systems. 
These patterns solve specific design problems and make object-oriented design more flexible, elegan, and ultimately reusable. 

**Let's look back at [Smalltack-80](https://en.wikipedia.org/wiki/Smalltalk)**. 
The Model/View/Controller (MVC) was used to build user interfaces in Smalltalk-80. 
MVC consists of three kinds of objects:
- Model - application object
- View - its screen representation
- Controller - the way the user interface reacts to user input.

Before MVC, user interface designs tended to lump these objects together. MVC decoples them to increase flexibility and reuse. 

The following disgram shows a model and three views (controller is left out for simplicity). 

![image](https://user-images.githubusercontent.com/49169084/218158625-08a9c3e4-0ffc-4ba7-b62c-5640545651fc.png)

This example reflects a design that decoples view from models. But the design is applicable to a more general problem: decoupling objects so that changes to one can affect any number of others without requiring the changed object to know details of the others. 

MVC also lets you change the way a view responds to user input without changing its visual representation. MVC encapsulates the response mechanism in a Controller object. There is a class hierarchy of controllers, making it easy to create a new controller as a variation on an existing one. 

### Problems solved by Design Patterns

* Finding Appropriate Objects
* Determining Object Granularity
* Specifying Object Interfaces
* Specifying Object Implementations

Because there are many design patterns, we need a way to organize them. Thye classification helps to learn patterns faster, and it can direct efforts to find new patterns as well.

![image](https://user-images.githubusercontent.com/49169084/219963101-43f6bf9e-57f0-453f-bbbe-bf172489cd79.png)

- Creational Patterns: Used to construct objects such that they can be decoupled from their implementing system.
- Structural Patterns: Used to form large object structures between many disparate objects.
- Behavioral Patterns: Used to manage algorithms, relationships, and responsibilities between objects.
- Object Scope: Deals with object relationships that can be changed at runtime.
- Class Scope: Deals with class relationships that can be changed at compile time.

There are other ways to organize patterns. Some patterns are often used together. Some patterns are alternatives. Some patterns result in similar designs even though the patterns have different intents. 

Yet another way to organize design patterns is according how they reference each other (relate to each other):

![image](https://user-images.githubusercontent.com/49169084/218184408-82abd037-271c-4de7-9138-9f6b8f926839.png)

**We are not going to cover every single Design Pattern ever created**

![image](https://user-images.githubusercontent.com/49169084/218342641-f2722767-2e49-4fab-aa95-a8af454ab5e9.png)


## Simpliest and most common patterns
* Abstract Factory
* Factory Method
* Adapter
* Composite
* Decorator
* Observer
* Strategy
* Template method

It is hard to find an object-oriented system that doesn't use at least a couple of these patterns, and large systems use nearly all of them. This subset will help you understand design patters in particular and good object-oriented design in general.

* _AbstractFactory code example -->_
- Intent:
  - Provide an interface for creating families of related or dependent objects without specifying their concrete classes. 
- When to use:
  - The system should be independent of how its products are created, composed, and represented
  - You want to provide a class library of products, and you want to reveal just their interfaces, not their implementations
  - You don’t want to change existing code when adding new products or families of products to the program.
- Real world example:
  We have an interface and multiple cocrete implementations of it, e.g.:
    - Food --> Salad
    - Food --> Meat
    - In this scenario, if a client program wants to access Salad/etc., they'll need to directly use their constructor, like
      `Food salad = new Salad(0.3, 250);`
      `Food meat = new Meat(0.8, 1200);`
      This brings type coupling into the application and makes client responsible for creating their concrete classes. Abstract factory pattern implementation provides us with a framework that allows us to create objects that follow a _general pattern_. So at runtime, the abstract factory is coupled with any desired concrete factory which can create objects of the desired type.
      
**AbstractFactory Class Design Pattern**

![image](https://user-images.githubusercontent.com/49169084/218339875-f21a22c1-4dfd-4e6e-942b-fff3723eb6f0.png)

**Abstract Factory Design Pattern Benefits**
* Provides approach to _code to interface_ rather than implementation.
* Can be easily extended to accommodate more products, for example we can add another sub-class 'Pie' and a factory 'PieFactory'
* It is robust and avoids conditional logic.

[Abstract Factory Design Pattern explained - video](https://www.youtube.com/watch?v=xbjAsdAK4xQ)

## [Some Programming Principles](https://java-design-patterns.com/principles/)

Before we continue looking into other design patterns, let's review a few important *Programming Principles*, listed below in no particular order:

### Do The Simpliest Thing That Could Possibly Work (First)
  - Why: "Excellent is the enemy of the Good"
  - How: Ask yourself: "What is the simpliest thing that could work?". 
  - [Once we get something on the screen, we can look at it. If it needs to be more, we can make it more.](http://c2.com/xp/DoTheSimplestThingThatCouldPossiblyWork.html)

### Separation of Concerns
  [Separate a computer program into distinct sections, such that each section addresses a separate concern.](https://en.wikipedia.org/wiki/Separation_of_concerns)
  For example the business logic of the application is a concern and the user interface is another concern. Changing the user interface should not require changes to business logic and vice versa.
  - Why:
    - Simplifies development and maintenance of software applications.
    - When concerns are well-separated, individual sections can be reused, as well as developed and updated independently.
  - How:
    - Break program functionality into separate modules that overlap as little as possible.

### Keeping it DRY (Don't Repeat Youself)
- [Every piece of knowledge must have a single, unambiguous, authoritative representation within a system.](https://en.wikipedia.org/wiki/Don't_repeat_yourself)
  - `piece of knowledge` == a precise functionality in the business domain of your application OR, an algorithm
      - *Code duplication* [doesn't necesserely violate the DRY principle.](https://thevaluable.dev/dry-principle-cost-benefit-example/)  
      
- Why: 
  - Duplication makes code harder to mantain
  - A modification of any single element of a system should not require a change in another, unrelated, element[s].
  - On the other hand, elements that are logically related do change predictably and uniformly
- How:
  - Put business rules, long expressions, if statements, math formulas, metadata, etc. in only one place.
  - Identify the single, definitive source of every piece of knowledge used in your system, and then use that source to generate applicable instances of that knowledge (code, documentation, tests, etc).
  - Use _Rule of three_: "two instances of similar code do not require refactoring, but when similar code is used three times, it should be extracted into a new procedure."
     
### Liskov Substitution Principle (LSP)
  - [Objects in a program should be replaceable with instances of their subtypes without altering the correctness of that program.](http://www.blackwasp.co.uk/lsp.aspx)

### Composition Over Inheritance
  - Why:
    - Less coupling between classes.
    - Using inheritance, subclasses easily make assumptions, and break LSP.
  - How:
    - Test for LSP (substitutability) to decide when to inherit.
      - Compose when there is a "has a" (or "uses a") relationship, inherit when "is a".
    
#### SOLID (Java OOP):
  - Single Responsibility Principle (a class should never have more than one reason to change)
  - Open/Closed Principle (classes should be open for extension, closed for modification)
  - Liskov Substitution Principle
  - Interface Segregation Principle (reduce fat interfaces into multiple smaller and more [client] specific interfaces) 
  - [Dependency Injection](https://www.digitalocean.com/community/tutorials/java-dependency-injection-design-pattern-example-tutorial) ([and Inversion of Control](https://www.theserverside.com/feature/Meaning-of-inversion-of-control-in-Spring-and-Java-IoC-explained)) (allow us to remove the hard-coded dependencies and make our application loosely coupled, extendable and maintainable)  

## **<--More Design Patterns-->**

**Factory Method**

- Intent:
Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

Factory Method pattern provides a way to delegate the instantiation logic to child classes.

* Real-world example: An app for a vehicle manufacturer. This client makes vehicles with a fuel-only engine. We'll follow SRP and OCP and use factory method design pattern.

The UML for this pattern:

![image](https://user-images.githubusercontent.com/49169084/218500913-c9540e60-c8d8-4ab9-bc33-d38c6c3942c1.png)

The factory method pattern loosens the coupling code by separating our Product's construction code from the code that uses this Product. Besides, it allows the introduction of new products without breaking existing code.

Use it when a class cannot anticipate the class of objects it must create. 

_FactoryMethod code example -->_

* Real-word usage examples:
  - All the Java wrapper classes like Integer, Double, etc. use this pattern to eveluate the values using valueOf() method.
  - Java [class NumberFormat](https://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html#getInstance--) uses this pattern to evaluate values using getInstance() method

**Adapter**

- Intent:
Convert the interface of a class into another interface the clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces. 

Real-world example of _adapter_: A traveler with a laptop. World countries have different electric sockets, volts, and frequencies. In the UK, it is type G socket with 230 volts and 50 Hz frequency. In the US, it is type A and type B with 120 volts and 60 Hz frequency. In India: type C/D/M, 230, 50. To use the laptop in different countries, the traveler would need an adapter. 

Let's take a drawing application as an example. 
To demonstrate a problem, let's first approach designing this application without _adapter_.
We may take the following steps:
- Create `Shape` interface
  ```
      void draw();
      void resize();
      String description();
      boolean isHide();
  ```    
- Implement concrete classes: 
  - Rectangle
  - Circle
- Create `Drawing` class 
  - it will contain `List<Shape> shapes...`
  - and does things like `shapes.stream().forEach(shape -> shape.draw())`
- Our program will work like this:
  ```
            Drawing drawing = new Drawing();
            drawing.addShape(new Rectangle());
            drawing.addShape(new Circle());
            System.out.println("Drawing...");
            drawing.draw();
            System.out.println("Resizing...");
            drawing.resize();
  ```
- So far, so good. As we continue, we come to know that there are some extra geometric shapes already developed either by some other teams or we have a thrird-party API, which provides shapes. Say, the API has code for:
  - GeometricShape interface
    ```
     double area();
     double perimeter();
     void drawShape();
     ```
   - Triange class implementation
   - Rhombus class implementation

So, we see that Triangle and Rhombous are implementing `GeometricShape` interface and that this interface is different from our `Shape` interface (_incompatible_).
Our `Drawing` client can work with `Shape` and not with `GeometricShape`. This makes `GeometricShape` incompatible with `Drawing` class. 
All these means that we have some ready-to-use code that is very similar to what we're expecting, but it is not according to our specifications. 

##### What should we do? 
1. Change/remove `Shape` interface and start using `GeometricShape`? Or convert `GeometricShape` to `Shape`? (Note that it is not always possible because of other functionality and code dependencies) 🙄
2. Continue with what we started with, ignore ready-to-use code?? 😣

We need an *adapter*, which would make the ready-to-use-code compatible with our own code. 

Before we start, let's review the classes/objects used in the adapter pattern:

- Target: domain-specific interface that the client uses. (`Shape` in our example)
- Adapter: adapts the interface from the adaptee to the target interface.
- Adaptee: defines an existing interface that needs adapting. (`GeometricShape` in our example)
- Client: works with objects conforming to the `Target` interface. (`Drawing` in our example)
 
There are **two** different approaches to implement the adapter pattern:
- Object Adapter Pattern
  - uses composition and can wrap classes as well as interfaces. It can be applied in most of the scenarios
- Class Adapter Pattern
  - uses inheritance and can wrap classes only. 

We also can create a [two ways adapter](https://www.digitalocean.com/community/tutorials/adapter-design-pattern-java)

**Composite**

- Intent: 
"Compose" objects into tree structures to represent part-whole hierarchies. 
Composite lets clients operate in generic manner on objects that may or may not represent a hierarchy of objects.

- Advantages:
   - It defines class hierarchies that contain primitive and complex objects.
   - It makes easier to add new kinds of components.
   - It provides flexibility of structure with manageable class or interface.

- When to use:
   - When you want to represent a full or partial hierarchy of objects.
   - When the responsibilities are needed to be added dynamically to the individual objects without affecting other objects. 
   - Where the responsibility of object may vary from time to time.

![image](https://user-images.githubusercontent.com/49169084/218807123-80f6d051-3dfc-4bf8-998d-277362428336.png)

1) Component
   -  is the base interface for all the objects in the composition. It should be either an interface or an abstract class with the common methods to manage the child composites.(`Human` interface in our example)
2) Composite
   - has leaf elements. It implements the base component methods and defines the child-related operations. (`GrandParent`, `Parent`)
3) Leaf
   - implements the default behavior of the base component. Has no objects "below" it.
4) Client
   - Access and manipulates objects in the composition through the component interface (`Main` class in our example)

_Composite Pattern code example -->_

**Decorator**

- Intent: 
Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

- Advantages:
   - Decorator patterns allow a user to add new functionality to an existing object without altering its structure. So, there is no change to the original class.
   - Decorator design patterns are most frequently used for applying single responsibility principles since we divide the functionality into classes with unique areas of concern.
   - Useful in providing runtime modification abilities (hence offers flexibility). 
   - Its easy to maintain and extend.
 
UML for our _Decorator code example -->_

![image](https://user-images.githubusercontent.com/49169084/219137148-1efc6973-8b01-4e81-b750-0bc0a37baa34.png)

* Real-word usage examples:
   - Java IO classes, like FileReader, BufferedReader, etc. Java util Collections#synchronized, etc.

* When to use:
   - When we need to add (or enhance) the behavior or state of objects
   - When we want to modify the fuctionality of a single object of the class (and leave others unchanged)

**Observer**

- Intent:
Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

Observer is a behavioral design pattern. It specifies communication between objects: observable and observers. *An observable is an object which notifies observers about the changes in its state*.

- Advantages:
The subject and observers make a loosely coupled system. They do not need to know each other explicitly. 
We can independently add or remove observers at any time.

- When to use:
   - When an abstraction has two aspects, one dependent on the other. Encapsulating these aspects in separate objects lets you vary and reuse them independently.
   - When a change to one object requires changing others, and you don't know how many objects need to be changed.
   - When an object should be able to notify other objects without making assumptions about who these objects are. In other words, you don't want these objects tightly coupled.

![image](https://user-images.githubusercontent.com/49169084/219150384-93fda2eb-2a8f-4e1c-8f85-e98a10fd5f15.png)

_Observer code example -->_

* Real-word usage examples:
   - java.util.Observer, java.util.EvenListener (when user clicks the mouse, function subscribed to the mouse click event is invoked, etc.). 
   - Social media, such as facebook or twitter. When a person updates status, all their followers get notification. A follower can follow or unfollow another person at any time. Once unfollowed, person won't get notifications. 

- Observer FQAs
   - Can different types of observers register to one subject?
      - The nature and functionality of observers can be different but they all must implement the one common Observer interface which the subject supports for registering and deregistering.

   - Can I add or remove observers at runtime?
      - We can add or remove the observers at any point of time.

**Strategy**

- Intent: 
Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from the clients that use it.

This pattern is based on Open/closed principle. We don’t need to modify the context [closed for modification], but can choose and add any implementation [open for extension].

In Strategy pattern, we first create an abstraction of algorithm. Then we create implementations of this abstraction and these are called strategies.

A client will always call the abstraction, and will pass a context object. This context object will decide which strategy to use.

![image](https://user-images.githubusercontent.com/49169084/219735096-4d91d889-2786-40b6-bdf3-2fa5a8309a94.png)

Real-world usage: 
In Collections.sort() – we don’t need to change the sort method to achieve different sorting results. We can just supply different comparators in runtime.

- Approach:
Identify the parts of your program that vary and separate them from what stays the same.

- Benefits:
   - It provides a substitute to subclassing.
   - It defines each behavior within its own class, eliminating the need for conditional statements.
   - It makes it easier to extend and incorporate new behavior without changing the application.
- Usage:
   - When the multiple classes differ only in their behaviors.
   - When you need different variations of an algorithm.

_Strategy Pattern Code Example -->_

**Template method**

- Intent:
Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

Template Method pattern outlines the general steps in the parent class and lets the concrete child implementations define the details.

![image](https://user-images.githubusercontent.com/49169084/219956997-f4e2e811-a5b0-4829-8dfe-c8f82b6a3de9.png)

- Real-world usages: for architectural plans, and throughout the engineering domain.Example: a basic house plan can have many variations such as adding an extensions or using a different heating system.
- In Java: Array class uses it for sorting, java.io.InputStream/OutputStream, java.io.Reader/Writer, java.util.AbstractList, java.util.AbstractSet, java.util.AbstractMap.

- When to use:
   - To implement the invariant parts of an algorithm once and leave it up to subclasses to implement the behavior that can vary.
   - When common behavior among subclasses should be factored and localized in a common class to avoid code duplication. First identify the differences in the existing code and then separate the differences into new operations. Finally, you replace the differing code with a template method that calls one of these new operations.
   - To control subclasses extensions. You can define a template method that calls "hook" operations at specific points, thereby permitting extensions only at those points.

_Template mathod code example -->_

### Additional Resources

- Java Design Patterns library: https://github.com/iluwatar/java-design-patterns
- Software Programming principles: https://java-design-patterns.com/principles/ (other tabs in this doc link to Design Pattern Catalog and '30 Seconds of Java, snippets)
- Design patterns applied to other languges (JS, Typescript..): https://www.youtube.com/watch?v=tv-_1er1mWI















