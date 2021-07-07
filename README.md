# Functional Java
Functional Programming in Java Course


## Table of contents

* [General info](#general-info) 
* [Technologies](#technologies) 
* [Setup](#setup)
* [Concepts](#concepts)

## General info

On this course I learned what is Functional Programming and how we can apply it in Java. Also, we reviewed what are functions and the different types that exist, such as: pure functions, higher order functions and lambda functions.

I learned of some utils from the Function package in Java, that we can use with lambdas. =Lambdas are very useful and can be applied in many different ways, we did some excercises to plactice this, also applying default methods, chaining, using Optional and Streams.

## Technologies

On this course I used the following development technologies:
 <!-- - Visual Studio Code -->
 - Git
 - Github
 - IntelliJ IDEA 2021 1.2
 - OpenJDK 11

## Setup

The setup for this project was made on a Windows 10 OS.

### IntelliJ IDEA

1. Go to [https://www.jetbrains.com/idea/download/](https://www.jetbrains.com/idea/download/)
2. Download the Community version (Free, built on open source)

### OpenJDK
For this course we used 2 versions of OpenJDK.

1. Go to [https://adoptopenjdk.net/](https://adoptopenjdk.net/)
2. Download the following versions:
    - OpenJDK 8
    - OpenJDK 11


## Concepts

### Functional Programming:
* **Functional Programming:** programming style that focuses on what we need to solve, not on how to solve it.
* **Function:** data type that operates on X and genetares Y. It is a series of parameterized steps that may or may not generate a result.
    * **Pure function:** deterministic, their results never change when given the same parameters
    * **Impure function:** no-deterministic, results depend on the state of the system.
    * **Higher order functions:** functions that can receibe another function(s) as a parameter and return another function.
    * **Lambda functions:** function that doesn't have a name and are used for simple operations that are only neessary in one section of the code.
* **Inmutability:** an immutable object is one that can't be altered once it's defined.
* **java.util.function: Function:** functions that can be used as types and apply operations with them.
* **java.util.function: Predicate:** functional interface that defines a condition that a specific object has to fulfill.
* **java.util.function: Consumer:** lambda expression that accepts only one value and doen't have a return value.
* **java.util.function: Supplier:** an expression that doesn't have any parameters but returns a value.
* **java.util.function: UnaryOperator:** only one data type is specified, it's inferred that the result type will be the same as the specified one.
* **java.util.function: BinaryOperator:** only one data type is specified, it's inferred that it will have two parameters and one result of thee same type as the specified one.
* **java.util.function: BiFunction:** Two parameters, we must specify the data types and the return type, they may be different. 

* **SAM:** Single Abstract Method. Interface that has only one undefined 
* **Functional interface:** interface that contains only one abstract method.
* **Reference operator:** The double colon ( :: ) operator, is used to call a method by referring to it with the help of its class directly. They behave exactly as the lambda expressions, the only difference is that this uses direct reference to the method by name instead of providing a delegate to the method.
* **Chaining:** making consecutive calls to different methods with different results.
* **class Optional:** allows to operate on a data when this is present or not.
* **Streams:** a pipeline of functions that can be evaluated, used to process collections of data.

