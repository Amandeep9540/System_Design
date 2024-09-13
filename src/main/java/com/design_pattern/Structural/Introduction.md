# Structural Design Patterns

## Introduction

**Structural design patterns** focus on how classes and objects are composed to form larger structures while keeping these structures flexible and efficient.
They help ensure that system components are organized in a way that promotes reusability and maintainability by defining relationships between objects and classes.

These patterns are particularly useful when you want to simplify the design of complex systems, ensure proper object composition, and reduce the coupling between system components.

---

## Types of Structural Design Patterns and Their Use Cases

### 1. **Adapter Pattern**

#### Where to Use:
Use this pattern when you want to allow two incompatible interfaces to work together. The adapter acts as a bridge between the interfaces, making sure they can communicate without changing their existing code.

#### Example Use Case:
- Adapting third-party libraries or services to work with your existing codebase.

---

### 2. **Bridge Pattern**

#### Where to Use:
Use this pattern when you want to decouple an abstraction from its implementation so that the two can vary independently. It's ideal when you need to switch between different implementations of an abstraction without altering the client code.

#### Example Use Case:
- Creating a payment system where the payment method and payment processor can change independently.

---

### 3. **Composite Pattern**

#### Where to Use:
Use this pattern when you want to treat individual objects and compositions of objects uniformly. It is helpful in scenarios where you have hierarchical structures, and you want to be able to treat both leaf nodes and composite nodes in the same way.

#### Example Use Case:
- Representing part-whole hierarchies, such as file systems (files and directories).

---

### 4. **Decorator Pattern**

#### Where to Use:
Use this pattern when you need to add responsibilities or behavior to individual objects dynamically, without affecting other objects from the same class. It's useful when class behavior needs to be extended without modifying the class itself.

#### Example Use Case:
- Adding functionalities such as scrolling, borders, or shadows to UI elements dynamically.

---

### 5. **Facade Pattern**

#### Where to Use:
Use this pattern when you want to provide a simplified interface to a complex subsystem. The facade hides the complexities of the subsystem and provides a straightforward interface that clients can use easily.

#### Example Use Case:
- Providing a unified API for complex underlying systems, such as database operations or third-party services.

---

### 6. **Flyweight Pattern**

#### Where to Use:
Use this pattern when you need to minimize memory usage by sharing as much data as possible between similar objects. It's useful when working with large numbers of similar objects that consume a lot of memory.

#### Example Use Case:
- Rendering large numbers of graphical elements (e.g., trees in a forest in a game) by sharing common properties (e.g., texture, color).

---

### 7. **Proxy Pattern**

#### Where to Use:
Use this pattern when you want to provide a placeholder or surrogate for another object to control access to it. A proxy can be useful for adding functionality such as lazy initialization, access control, logging, or remote access to the actual object.

#### Example Use Case:
- Implementing lazy initialization where an object is only created when it’s needed.
- Controlling access to sensitive or expensive resources, such as file systems or remote servers.
- Acting as a local representative for a remote object in distributed systems (Remote Proxy).

---
