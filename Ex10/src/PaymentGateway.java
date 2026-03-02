
public class PaymentGateway implements PaymentGatewayService {

    @Override
    public String charge(String studentId, double amount) {
        return "TXN-9001";
    }
}
