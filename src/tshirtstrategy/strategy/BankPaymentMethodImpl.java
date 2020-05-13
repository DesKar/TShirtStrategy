package tshirtstrategy.strategy;

public class BankPaymentMethodImpl implements IPaymentMethod {

    private final float percentageCharge = 5;

    @Override
    public float pay(float netPrice) {
        return netPrice * (percentageCharge / 100 + 1);
    }

}
