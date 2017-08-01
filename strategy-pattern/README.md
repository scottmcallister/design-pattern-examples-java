# Strategy Pattern

The strategy pattern (AKA the policy pattern) is used in situations where an algorithm can be changed at runtime.

Our implementation uses car models as an example where different types of engines can be swapped in and out. The classes
for different engine types all implement a common interface `EngineStrategy` and each class has a unique implementation
of a `describe` method.

This pattern follows the object oriented convention of the "open closed principle". That means any implementation of the
strategy pattern should be easily extensible without having to modify the strategy's code directly. By creating an
interface for the type of car engine, we can implement as many type of engines as we like without ever having to touch
the `EngineStrategy` class itself.

<p align="center">
    <img width="300" src="/strategy-pattern/images/StrategyClass.jpg">
</p>

## Running the app

To run this code locally, you can build and run a jar file with Maven:

```
$ mvn clean install -DskipTests
$ java -jar target/strategy-pattern-1.0-SNAPSHOT.jar
```

## Running Tests

JUnit tests have been written for each public method of our Singleton class.

```
$ mvn clean test
```