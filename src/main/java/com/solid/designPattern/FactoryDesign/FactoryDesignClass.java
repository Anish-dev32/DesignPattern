package com.solid.designPattern.FactoryDesign;

import com.solid.designPattern.FactoryDesign.Class.ClassInterface;

public class FactoryDesignClass {
    /*
    * The Factory Design Pattern is a creational design pattern that provides an
    * interface for creating objects in a superclass but allows subclasses to alter
    * the type of objects that will be created. It helps encapsulate object creation
    * logic, making the system more maintainable and scalable.*/

    /*Use Cases of Factory Pattern
      1. Hiding Object Creation Logic: If object creation involves complex logic, a factory method can encapsulate it.
      2. Decoupling Code from Concrete Implementations: Instead of directly instantiating classes using new, clients use
         a factory, allowing flexibility in switching implementations.
      3. Managing a Family of Related Classes: When a superclass defines a common
         interface and multiple subclasses implement it, a factory can dynamically
         return the appropriate instance.
      4. Reducing Code Duplication: If the same instantiation logic is used in multiple
         places, it can be centralized in a factory.
      5. Ensuring Loose Coupling: It helps avoid tight coupling between client code
         and concrete classes.*/

    public static void main(String[] args) {
        ClassInterface obj = Factory.getInstance("One");
        obj.method();

        ClassInterface obj3 = Factory.getInstance("twe");
        obj3.method();
    }

}
