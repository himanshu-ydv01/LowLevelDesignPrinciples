package Lesson3_AbstractClasses_and_Interfaces.AbstractClassDemo;

public class Macbook extends Product{
    @Override
    public double calculateDiscount() {
        return 0;
    }

    @Override
    public void termsAndCondition() {
        System.out.println("Terms of macbook");
    }
}