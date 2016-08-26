package gcard.system;

import gcard.terminal.Terminal;
import gcard.user.User;
import gcard.cadr.UserCard;

import java.util.ArrayList;
import java.util.UUID;


public class CardManagementSystem implements DispatcherInterface {

    @Override
    public void issueNewCard(String userName,int startBalance) {
        User newUser= new User(userName);
        UserCard newCard =new UserCard(newUser,startBalance);
        System.out.println("Created New card: "+newCard);
    }
//    public void issueNewCard(User user,int startBalance) {
//       UserCard newCard =new UserCard(user,startBalance);
//        DataBase.cards.add(newCard);
//        DataBase.transactionList.add(newCard.getCardNumber(),new ArrayList<String>());
//        newCard.topUp(startBalance);
//        System.out.println(newCard);
//    }
//    public void issueNewCard(User user){issueNewCard(user,0);}
    public void issueNewCard(String userName){
        issueNewCard(userName,0);
    }
    public void issueNewCard(int startBalance){
        issueNewCard("",startBalance);
    }
    public void issueNewCard(){
        issueNewCard("",0);
    }

    @Override
    public void registerCard(UserCard userCard) {
        DataBase.cards.add(userCard);
        DataBase.registerUser.add(userCard.getUser());
        DataBase.transactionList.add(userCard.getCardNumber(),new ArrayList<String>());
    }

    public static void processTransaction(UUID cardId, UUID terminalId, int amount) {
        for(Terminal terminal: DataBase.terminalList) {
            if (terminal.getId().equals(terminalId)){
                for (UserCard userCard :  DataBase.cards){
                    String transaction = terminal.toString() + " " + amount;
                    DataBase.transactionList.get(userCard.getCardNumber()).add(transaction);
                    System.out.println("Transaction Succeed");
                }
            }else{
                System.out.println("Invalid Transaction");
            }

        }
    }

    boolean isStolen(UUID cardId){
        for(UserCard userCard: DataBase.cards) {
            if (userCard.getId().equals(cardId))
                return userCard.getIsStolen();
        }
        System.out.println("Card NOT Found in Database");
        return false;
    }

    public static void printTransactions(int cardNumber) {
        System.out.println("Printing all transactions of card N :"+cardNumber);
        for(String transaction: DataBase.transactionList.get(cardNumber)){
            System.out.println(transaction);
        }


    }
}
