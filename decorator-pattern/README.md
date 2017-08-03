# Decorator Pattern

The decorator pattern (AKA the wrapper pattern) allows behavior to be added to an individual object without having to
update other objects of the same class. In this example we're creating a decorator class of sandwich toppings that we
can use to extend and modify the functionality of a sandwich object.

To implement this pattern, we'll create a `Sandwich` interface with two method signatures and a `PlainSandwich` class
that implements the interface. Then we can create an abstract `ToppingDecorator` class that has a `PlainSandwich`
instance variable and a constructor that takes a `PlainSandwich` object as a parameter.

From there we can create as many decorator classes as we like by inheriting from our `ToppingDecorator` class and
overriding it's methods to extend its functionality. In this example we have peanut butter and jam topping decorators
that increase the price and modify the ingredients of a sandwich.

<p align="center">
    <img width="450" src="/decorator-pattern/images/DecoratorPattern.png">
</p>

## Running the app

To run this code locally, you can build and run a jar file with Maven:

```
$ mvn clean install -DskipTests
$ java -jar target/decorator-pattern-1.0-SNAPSHOT.jar
```

## Running Tests

JUnit tests have been written for this project

```
$ mvn clean test
```

