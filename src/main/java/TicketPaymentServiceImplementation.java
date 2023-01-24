
import java.util.Map;
import java.util.HashMap;


public class TicketPaymentServiceImplementation implements TicketPaymentService {
    private final Map<Integer, Integer> accounts = new HashMap<>();
    

    public TicketPaymentServiceImplementation() {
        accounts.put(1,100); // initialize account 1 with a balance of 100
        accounts.put(2, 200); // initialize account 2 with a balance of 200
    }

    @Override
    public boolean makePayment(int accountId, int amount) {
        if (!accounts.containsKey(accountId)) {
            return false;
        }
        int balance = accounts.get(accountId);
        if (balance < amount) {
            return false;
        }
        accounts.put(accountId, balance - amount);
        return true;
    }
}