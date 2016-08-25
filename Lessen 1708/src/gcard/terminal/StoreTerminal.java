package gcard.terminal;
import gcard.*;
import gcard.cadr.UserCard;
import gcard.system.DataBase;

import java.util.UUID;


public class StoreTerminal extends Terminal {

    public StoreTerminal(UUID id, String address) {
        super(id, address);
        DataBase.terminalList.add(this);
    }

    @Override
    public void receivePayment(UUID cardId, int amount) {
        A:
        {
            for (UserCard userCard :  DataBase.cards) {
                if (userCard.getId().equals(cardId)) {
                    if (!userCard.getIsStolen()) {
                        if (userCard.getBalance() - amount >= 0) {
                            userCard.doPayment(amount);
                            System.out.println("Transaction Succeed ");
                            break A;
                        } else {
                            System.out.println("Insufficient balance ");
                            break A;
                        }
                    } else {
                        System.out.println("Card Is Blocked Or Stolen");
                        break A;
                    }
                }
            }
            System.out.println("Card NOT Found in Database");
        }
    }


}
