# Assignment – Observer Pattern

## Assignment Guidelines and Submission Instructions

## UML Class Diagram:

Use the UML class diagram below to help modify the provided code
![UML Class Diagram](https://github.com/Daniel-Andarge/Software-Design-and-Architecture-Specialization--University-of-Alberta/blob/main/Course-2-Design-Patterns/Module-2-Behavioural-Design-Patterns/Assignments/Assignmet-2-Observer%20Pattern/UML_class_diagram_observer_pattern.png)

## Overview

Youtube allows users to follow their favorite Youtube stars so that they will be notified when the channel is live. This is commonly done using the observer pattern. Complete the provided code and use the following UML class diagram as a guide:

## Code:

```java
// Observer Design Pattern Example in Java

// Subject.java
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String status);
}

// Channel.java
import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    private List<Observer> observers;

    public Channel() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String status) {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }
}

// Observer.java
public interface Observer {
    void update(String status);
}

// Follower.java
public class Follower implements Observer {
    private String followerName;

    public Follower(String followerName) {
        this.followerName = followerName;
    }

    @Override
    public void update(String status) {
        System.out.println(followerName + " received an update: " + status);
    }
}
```

This repository includes a Java example demonstrating the Observer design pattern. The code consists of three main components:

- **Subject.java**: An interface defining methods for registering, removing, and notifying observers.
- **Channel.java**: A class implementing the `Subject` interface, managing a list of observers, and providing methods for registration, removal, and notification.
- **Observer.java**: An interface declaring the `update` method that concrete observers must implement.
- **Follower.java**: A class representing a concrete observer, demonstrating how it receives updates from the subject.
