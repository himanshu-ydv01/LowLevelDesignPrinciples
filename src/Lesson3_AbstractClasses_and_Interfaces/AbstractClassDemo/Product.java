package Lesson3_AbstractClasses_and_Interfaces.AbstractClassDemo;

public abstract class Product {

    // An abstract method
    public abstract double calculateDiscount();

    // concrete method
    public void termsAndCondition() {
        System.out.println("Some terms");
    }

}
