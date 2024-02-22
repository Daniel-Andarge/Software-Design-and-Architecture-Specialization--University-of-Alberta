# Adapter Pattern Assignment

## Problem Statement

In your workplace, there is an existing coffee machine that dispenses two different coffee flavors. The new management has decided to introduce a modern coffee machine with a touchscreen interface that should be able to connect and work seamlessly with the existing, older coffee machine. Your task is to extend and complete the provided code by implementing an adapter. This adapter will facilitate the integration of the new touchscreen interface with the old coffee machine.

## UML Class Diagram

![UML Class Diagram](image_link)

## Class Structure

### `CoffeeMachineInterface.java`

```java
public interface CoffeeMachineInterface {
    // Define necessary methods for the coffee machine interface
    // ...
}
```

### `OldCoffeeMachine.java`

```java
public class OldCoffeeMachine {
    // Implement the existing functionality of the old coffee machine
    // ...
}
```

### `CoffeeTouchscreenAdapter.java`

```java
public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
    // Implement the adapter to connect the new touchscreen interface with the old coffee machine
    // ...
}
```

## Usage Guidelines

1. Ensure that the `CoffeeMachineInterface` is appropriately extended or implemented in the relevant classes.
2. Implement the necessary methods in the `OldCoffeeMachine` class to maintain its existing functionality.
3. Complete the `CoffeeTouchscreenAdapter` class to enable communication between the new touchscreen interface and the old coffee machine.
4. Follow the provided UML class diagram for a structural guide.

Feel free to refer to the UML class diagram image for a visual representation of the class relationships and structure.

We appreciate your efforts in enhancing our coffee machine system to meet the evolving requirements of the office environment.
