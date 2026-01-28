package Lesson4_LiskovSubstitutionPrinciples.ProblematicCode;

public class VisaCard extends CreditCard {
    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay impl of VISA");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online transfer impl of VISA");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and Pay impl of VISA");
    }

    @Override
    public void mandatePayments() {
        System.out.println("Mandate payments impl of VISA");
    }

    @Override
    public void upiPayment() {
        System.out.println("Upi payment impl of VISA");
    }

    @Override
    public void intlPayment() {
        System.out.println("Intl payment impl of VISA");
    }
}
