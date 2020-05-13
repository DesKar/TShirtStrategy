package tshirtstrategy;

import tshirtstrategy.models.TShirt;
import tshirtstrategy.strategy.IPaymentMethod;

public class CheckOut {

    private IPaymentMethod paymentStrategy;

    public CheckOut(IPaymentMethod paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public float executePayment(TShirt tShirt) {
        float netPrice = tShirt.getBasePrice()
                + tShirt.getColor().getPrice()
                + tShirt.getSize().getPrice()
                + tShirt.getFabric().getPrice();

        return paymentStrategy.pay(netPrice);
    }
}
