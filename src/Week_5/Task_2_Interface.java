package Week_5;
interface Payment
{
    void pay();
    void showPaymentDetails();
}
class UPIPayment implements Payment
{
    @Override
    public void pay() {
        System.out.println("UPI payment successful...!");
    }

    @Override
    public void showPaymentDetails() {
        System.out.println("showing payment details of UPI");
    }
}
class CardPayment implements Payment
{
    @Override
    public void pay() {
        System.out.println("Card payment successful...!");
    }

    @Override
    public void showPaymentDetails() {
        System.out.println("Showing payment details of Card payment");
    }
}

public class Task_2_Interface {
    public static void main(String[] args) {
        UPIPayment upi = new UPIPayment();
        upi.pay();
        upi.showPaymentDetails();

        CardPayment cp = new CardPayment();
        cp.pay();
        cp.showPaymentDetails();
    }
}
