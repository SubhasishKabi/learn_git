package pratice.codes;

class Payment {
    void payAmount() {
        System.out.println("Payment method selected.");
    }
}

class CreditCardPayment extends Payment {
    @Override
    void payAmount() {
        System.out.println("Payment made using Credit Card.");
    }
}

class UPIPayment extends Payment {
    @Override
    void payAmount() {
        System.out.println("Payment made using UPI.");
    }
}

class CashPayment extends Payment {
    @Override
    void payAmount() {
        System.out.println("Payment made using Cash.");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCardPayment();
        p.payAmount();

        p = new UPIPayment();
        p.payAmount();

        p = new CashPayment();
        p.payAmount();
    }
}
