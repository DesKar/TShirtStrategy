
import org.junit.Assert;
import org.junit.Test;
import tshirtstrategy.CheckOut;
import tshirtstrategy.models.Color;
import tshirtstrategy.models.Fabric;
import tshirtstrategy.models.Size;
import tshirtstrategy.models.TShirt;
import tshirtstrategy.strategy.BankPaymentMethodImpl;
import tshirtstrategy.strategy.CardPaymentMethodImpl;
import tshirtstrategy.strategy.CashPaymentMethodImpl;
import tshirtstrategy.strategy.IPaymentMethod;

public class CheckOutTest {

    TShirt tShirt = new TShirt("TShirt-A", Color.ORANGE, Size.XL, Fabric.LINEN);
    IPaymentMethod cashPaymentMethod = new CashPaymentMethodImpl();
    IPaymentMethod cardPaymentMethod = new CardPaymentMethodImpl();
    IPaymentMethod bankPaymentMethod = new BankPaymentMethodImpl();

    public CheckOutTest() {

    }

    @Test
    public void computeNetPriceTest() {
        CheckOut checkout = new CheckOut(cashPaymentMethod);
        float netPrice = checkout.computeNetPrice(tShirt);
        Assert.assertEquals(18.65, netPrice, 0.001);
    }

    @Test
    public void ExecutePaymentTestCardPayementTest() {
        CheckOut checkout = new CheckOut(cardPaymentMethod);
        float totalPrice = checkout.executePayment(tShirt);
        Assert.assertEquals(20.515, totalPrice, 0.001);
    }

    @Test
    public void ExecutePaymentTestCashPayementTest() {
        CheckOut checkout = new CheckOut(cashPaymentMethod);
        float totalPrice = checkout.executePayment(tShirt);
        Assert.assertEquals(18.65, totalPrice, 0.001);
    }

    @Test
    public void ExecutePaymentTestBankPayementTest() {
        CheckOut checkout = new CheckOut(bankPaymentMethod);
        float totalPrice = checkout.executePayment(tShirt);
        Assert.assertEquals(19.5825, totalPrice, 0.001);
    }
}
