# Builder Pattern

The builder pattern can be used to simplify the initialization of object that take a large number of parameters in its 
constructor. Having more than a few parameters in a class's constructor has several disadvantages such as difficulty 
keeping track of the parameters required, remembering the order in which they should be passed in to the constructor, 
and having overly verbose code when creating an instance. Having too many parameters in a constructor is known as the 
"telescoping constructor" anti-pattern, and should be avoided when possible. 

```
public class TerribleClass {
    private int thing1;
    private int thing2;
    private int thing3;
    private int thing4;
    private int thing5;
    private int thing6;
    private int thing7;
    private int thing8;
    private int thing8;
    private int thing10;

    public TerribleClass(int thing1, int thing2, int thing3, int thing4, int thing5,
                         int thing6, int thing7, int thing8, int thing9, int thing10) {
        this.thing1 = thing1;
        this.thing2 = thing2;
        this.thing3 = thing3;
        this.thing4 = thing4;
        this.thing5 = thing5;
        this.thing6 = thing6;
        this.thing7 = thing7;
        this.thing8 = thing8;
        this.thing8 = thing8;
        this.thing10 = thing10;        
    }
    
    // ...
}
```

Another alternative to having several constructor parameters is the "Java Bean" pattern, which sets an object's instance
variables through setter methods instead of through the constructor. One problem with this approach is that the object 
will be in an inconsistent state after it is initialized and before all setter method calls have been completed. 

This example uses a `CustomerAccount` class with 9 different instance variables.

## Running the app

To run this code locally, you can build and run a jar file with Maven:

```
$ mvn clean install -DskipTests
$ java -jar target/builder-pattern-1.0-SNAPSHOT.jar
```

## Running Tests

JUnit tests have been written for this project

```
$ mvn clean test
```