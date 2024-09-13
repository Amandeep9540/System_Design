# Creational Design Patterns

## Introduction

Creatoinal design pattern are helpful in creation of objects.

Creatoinal Design pattern deals with scenario where creation of object is took place. 

## When to Use Creational Design Patterns?

- When you need to control the object creation process.
- When the system should be flexible to create different types of objects based on specific conditions.
- When your project requires optimization of resource usage, such as reusing objects or avoiding heavy initialization.

Creational patterns are typically used in scenarios where:
- A single object needs to control the creation of many other objects (like in the Singleton pattern).
- There’s a need to create a family of related or dependent objects (as in Abstract Factory).

---

## Types of Creational Design Patterns

There are **five main creational design patterns**:

### 1. **Singleton**
The Singleton pattern ensures that a class has only one instance. This is useful when creation of object is heavy or exactly one object is needed to coordinate actions across a system (e.g., managing database connections, logging, etc.).

**Example Use Case**: Database connection manager, logger.

### 2. **Factory Method**
The Factory Method pattern is used where input is decide the which object is instanced. 
Its provide a centralized control in creation of object 

**Example Use Case**: When the exact type of object to create is determined at runtime (e.g., vehicle creation: Car or Bike).

### 3. **Abstract Factory**
The Abstract Factory pattern provides a factory instance based on input.
Use the Abstract Factory when your code needs to work with various families of related products, but you don’t want it to depend on the concrete classes of those products

**Example Use Case**: Creating vehicle based on EV,Petrol both engine is different and after that create engine according engine capacity.

### 4. **Builder**
The Builder pattern is used to construct a complex object step by step. Unlike other patterns that create objects in one go, the Builder allows more control over the construction process, which is useful when objects require numerous configurations or steps to instantiate.

**Example Use Case**: Constructing complex objects like Computer where many fields need to be set step by step.

### 5. **Prototype**
The Prototype pattern creates new objects by cloning an existing object, typically using a deep copy. This is especially useful when the object creation process is costly, and you want to reuse a pre-existing object as a template.

**Example Use Case**: Cloning objects like game characters or database records to save resources and time.
