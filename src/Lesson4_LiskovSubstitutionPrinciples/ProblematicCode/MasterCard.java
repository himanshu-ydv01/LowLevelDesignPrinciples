package Lesson4_LiskovSubstitutionPrinciples.ProblematicCode;

public class MasterCard extends CreditCard {
    @Override
    public void tapAndPay() {
        System.out.println("Tap and payment impl of MasterCard");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online transfer impl of MasterCard ");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and payment impl of MasterCard");
    }

    @Override
    public void mandatePayments() {
        System.out.println("Mandate payments impl of MasterCard");
    }

    @Override
    public void upiPayment() {
        System.out.println("Upi payment impl of MasterCard");
    }

    @Override
    public void intlPayment() {
        System.out.println("Intl payment impl of MasterCard");
    }
}
