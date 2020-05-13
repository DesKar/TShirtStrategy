package tshirtstrategy;

import java.util.Scanner;
import tshirtstrategy.models.Color;
import tshirtstrategy.models.Fabric;
import tshirtstrategy.models.Size;
import tshirtstrategy.models.TShirt;
import tshirtstrategy.strategy.BankPaymentMethodImpl;
import tshirtstrategy.strategy.CardPaymentMethodImpl;
import tshirtstrategy.strategy.CashPaymentMethodImpl;
import tshirtstrategy.strategy.IPaymentMethod;

public class MainClass {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        TShirt tShirt = new TShirt("TShirt-A", Color.ORANGE, Size.XL, Fabric.LINEN);
        IPaymentMethod paymentMethod = choosePaymentMethod();
        CheckOut checkout = new CheckOut(paymentMethod);
        float price = checkout.executePayment(tShirt);
        System.out.println("price: " + price);
    }

    public static IPaymentMethod choosePaymentMethod() {
        String option;
        System.out.println("Please choose payment method. Choose between: 'card', 'bank' or 'cash' ");
        option = input.nextLine();
        switch (option) {
            case "cash":
                return new CashPaymentMethodImpl();
            case "card":
                return new CardPaymentMethodImpl();
            case "bank":
                return new BankPaymentMethodImpl();
            default:
               return null;
        }
    }

}
