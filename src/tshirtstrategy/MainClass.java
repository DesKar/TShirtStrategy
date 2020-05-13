package tshirtstrategy;

import tshirtstrategy.models.Color;
import tshirtstrategy.models.Fabric;
import tshirtstrategy.models.Size;
import tshirtstrategy.models.TShirt;
import tshirtstrategy.strategy.CardPaymentMethodImpl;
import tshirtstrategy.strategy.IPaymentMethod;

public class MainClass {

    public static void main(String[] args) {
        TShirt tShirt = new TShirt("TShirt-A", Color.ORANGE, Size.XL, Fabric.LINEN);
        IPaymentMethod paymentMethod  = new CardPaymentMethodImpl();
        CheckOut checkout = new CheckOut(paymentMethod);
        float price = checkout.executePayment(tShirt);   
        System.out.println("price: " + price);
    }
    
}
