package exercici1nivell2;

public class PaypalPay {


    public PaypalPay(Callback callback) {
        callback.paymentSuccessful("PayPal");
    }
}