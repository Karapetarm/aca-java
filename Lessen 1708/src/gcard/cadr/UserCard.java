package gcard.cadr;

import gcard.system.DataBase;
import gcard.terminal.Terminal;
import gcard.user.User;

import java.util.ArrayList;
import java.util.UUID;

public class UserCard implements Payable,ICardAction {

    public static User DefaultUSER;

    static {
        DefaultUSER=new User("Default");
    }

    private static int nextNumber=0;
    private int cardNumber;
    private int balance;
    private UUID id;
    private User user;
    private boolean isStolen=false;

    public UserCard(User user,int startBalance){
        this.user=user;
        cardNumber=nextNumber;
        nextNumber++;
        id=UUID.randomUUID();
        balance=startBalance;
        DataBase.cards.add(this);
        DataBase.transactionList.add(this.cardNumber,new ArrayList<String>());
    }

    @Override
    public void doPayment(int amount) {
        balance -=amount;
        System.out.println("Paid amount " + amount);
        System.out.println("New balance " + balance);
    }

    @Override
    public void topUp(int amount) {
        balance +=amount;
        System.out.println("TopUp amount " + amount);
        System.out.println("New balance " + balance);
    }

    @Override
    public void tap(Terminal terminal) {

    }

    public UUID getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public boolean setIsStolen(boolean stolen) {
        isStolen = stolen;
        return isStolen;
    }

    public boolean getIsStolen() {
        return isStolen;
    }

    public User getUser() {
        return user;
    }

    public String toString(){
        return "user: "+user+", Balance: "+balance+", Card Number: "+cardNumber+", Card ID: "+ id;
    }
}
