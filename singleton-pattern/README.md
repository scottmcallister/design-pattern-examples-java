# Singleton Pattern

The singleton pattern is used to ensures that there will always be one, and only one instance of a certain class in
the entire application. This can be useful when your application needs a single object that interacts with multiple
other objects in your application simultaneously.

In this example we're using a deck of playing cards as our singleton class. If we were to use this class in some sort of
a card game, there would only ever be one copy of the deck and one copy of each card in the game.

Instead of providing a public constructor for our class, we're setting the class constructor to be private and exposing
a `getInstance` method. This method will create an instance the first time it's called in the application and each
subsequent time it's called it will return that instance. The code that creates an initial instance is wrapped in a
synchronized block to make sure only one instance will be created if we were to run this method simultaneously across
multiple threads.

<p align="center">
    <img width="300" src="/singleton-pattern/images/SingletonClass.png">
</p>

## Running the app

To run this code locally, you can build and run a jar file with Maven:

```
$ mvn clean install -DskipTests
$ java -jar target/singleton-pattern-1.0-SNAPSHOT.jar
```

## Running Tests

JUnit tests have been written for each public method of our Singleton class.

```
$ mvn clean test
```
