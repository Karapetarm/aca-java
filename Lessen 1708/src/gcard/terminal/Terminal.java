package gcard.terminal;


import java.util.UUID;

public abstract class Terminal implements IPaymentReceiver {
   private static int nexTerminal=0;
    public UUID id;
    public int terminalNumber;
    private String address;

    public Terminal(UUID id, String address) {
        this.id = id;
        this.terminalNumber = nexTerminal;
        nexTerminal++;
        this.address = address;
    }

    public abstract void receivePayment(UUID cardId , int amount);
        //TODO implement receive part
        // Check for stolen card
        // decline the transaction if it's stolen
        // otherwise update the balance in the system and store the transaction

    public UUID getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public int getTerminalNumber() {
        return terminalNumber;
    }

    public Terminal setAddress(String address) {
        this.address = address;
        return this;
    }

    public String toString(){
        return "Terminal Number: "+terminalNumber+"  Address: "+address;
    }
}
