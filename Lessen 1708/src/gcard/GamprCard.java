package gcard;

import gcard.cadr.UserCard;
import gcard.system.CardManagementSystem;
import gcard.system.DataBase;
import gcard.terminal.MetroTerminal;

import java.io.IOException;
import gcard.system.CardManagementSystem;

import java.util.Scanner;

public class GamprCard {
    public static void main(String ... args) throws IOException {

        // loadTerminalsAndCards()
        CardManagementSystem cardManagementSystem = new CardManagementSystem();
        for(int i=0;i<10;i++){
            cardManagementSystem.issueNewCard("user name:", i);
            //cardManagementSystem.issueNewCard(i);
        }

        // example usage
        //UserCard card = new UserCard();
       // MetroTerminal terminal = new MetroTerminal();
       // terminal.cardTapped(card);

       // CardManagementSystem.printTransactions();


            //String text = read from console; goggle - reading from command line
            // travel from station 1 to station 4

            //if (inputMsg.equals("printTransaction"))
            // printTransaction

            // exit

            // issue card

            // new user
        Scanner key= new Scanner(System.in);
        String insertedKey;
        do{
            System.out.println();
            System.out.println("insert keyword : \n "
                    +"Exit : To exit program; \n"
                    +"NewCard : To create new user card; \n"
                    +"StoreTerminal : To create new store terminal; \n"
                    +"MetroTerminal : To create new metro terminal; \n");
            insertedKey=key.nextLine().trim();
            Scanner sc= new Scanner(System.in);
            switch (insertedKey){
                case "NewCard":
                    System.out.print ("Card UserName => ");
                    String userName=sc.nextLine();
                    System.out.print ("Card startBalance => ");
                    int startBalance=sc.nextInt();
                    System.out.println();
                    cardManagementSystem.issueNewCard(userName,startBalance);
                    break;
                case "StoreTerminal":
                    break;
                case "MetroTerminal ":
                    break;
                case "e":
                    break;
                case "f":
                    break;
                default:
                    System.out.println("input keywords \n \"Exit\" :To exit program");
                    break;
            }
        }while ( insertedKey !="Exit");
    }
}
