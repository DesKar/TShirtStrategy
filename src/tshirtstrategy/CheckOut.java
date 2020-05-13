package tshirtstrategy;

import tshirtstrategy.models.TShirt;
import tshirtstrategy.strategy.IPaymentMethod;

public class CheckOut {

    private final IPaymentMethod paymentStrategy;

    public CheckOut(IPaymentMethod paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public float executePayment(TShirt tShirt) {
        float netPrice = computeNetPrice(tShirt);
        return paymentStrategy.pay(netPrice);
    }

    public float computeNetPrice(TShirt tShirt) {
        return tShirt.getBasePrice() 
                + tShirt.getColor().getPrice()
                + tShirt.getSize().getPrice()
                + tShirt.getFabric().getPrice();
    }
}
