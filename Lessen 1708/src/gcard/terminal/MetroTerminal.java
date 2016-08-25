package gcard.terminal;

import gcard.cadr.UserCard;

import java.util.UUID;


public class MetroTerminal extends Terminal implements Tapable {

    public MetroTerminal(UUID id, String address) {
        super(id, address);
    }

    @Override
    public void cardTapped(UserCard card) {
        //how many time card was tapped?? wer to stor tiss information in array
    }

    @Override
    public void receivePayment(UUID cardId, int amount) {

    }
}

