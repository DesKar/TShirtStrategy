package tshirtstrategy.strategy;

public class CashPaymentMethodImpl implements IPaymentMethod {

    @Override
    public float pay(float netPrice) {
        return netPrice;
    }

}
