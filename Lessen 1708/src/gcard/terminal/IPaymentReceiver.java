package gcard.terminal;

import java.util.UUID;

public interface IPaymentReceiver {

    void receivePayment(UUID cardId, int amount);
}
