package tshirtstrategy.strategy;

public class CardPaymentMethodImpl implements IPaymentMethod {

    private final float percentageCharge = 10;

    @Override
    public float pay(float netPrice) {
        return netPrice * (percentageCharge / 100 + 1);
    }

}
