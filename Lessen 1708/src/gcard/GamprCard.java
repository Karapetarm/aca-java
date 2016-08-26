package gcard;

import gcard.cadr.UserCard;
import gcard.system.*;
import gcard.terminal.MetroTerminal;

import java.io.IOException;
import gcard.system.CardManagementSystem;
import gcard.terminal.StoreTerminal;

import java.util.Scanner;
import java.util.UUID;

public class GamprCard {
    public static void main(String ... args) throws IOException {
        CardManagementSystem cardManagementSystem = new CardManagementSystem();
        TerminalManagementSystem terminalManagementSystem= new TerminalManagementSystem();
        // loadTerminalsAndCards()
        Scanner keyScanner= new Scanner(System.in);
        String keyIO;
        do{
            System.out.println();
            System.out.println("insert keyword : \n"
                    +"Exit => To exit program; \n"
                    +"NewCard => To create new user card; \n"
                    +"NewStoreTerminal => To create new store terminal; \n"
                    +"NewMetroTerminal => To create new metro terminal; \n"
                    +"PayInStore => To make payment in store; \n");

            keyIO=keyScanner.nextLine().trim();
            switch (keyIO){
                case "NewCard":
                    System.out.print ("Card UserName => ");
                    String userName=keyScanner.nextLine();
                    System.out.print ("Card startBalance => ");
                    int startBalance=keyScanner.nextInt();
                    System.out.println();
                    cardManagementSystem.issueNewCard(userName,startBalance);
                    break;
                case "NewStoreTerminal":
                    System.out.print ("Terminal Address => ");
                    String terminalAddress=keyScanner.nextLine();
                    TerminalType terminalType=TerminalType.STORE_TERMINAL;
                    terminalManagementSystem.issueNewTerminal(terminalAddress,terminalType );
                    break;
                case "NewMetroTerminal":
                    break;
                case "PayInStore":

                    break;
                case "Exit":
                    break;
                default:
                    System.out.println("Try Again");
                    break;
            }
            System.out.print ("press Enter to Continue");
            keyScanner.nextLine();
        }while (!keyIO.equals("Exit"));



//        for(int i=0;i<3;i++){
//            cardManagementSystem.issueNewCard("user name:", i*1000);
//        }
//        StoreTerminal storeTerminal1=new StoreTerminal(UUID.randomUUID(),"1 Bagramyan str.");

        // example usage
        //UserCard card = new UserCard();
       // METRO_TERMINAL terminal = new METRO_TERMINAL();
       // terminal.cardTapped(card);

       // CardManagementSystem.printTransactions();


            //String text = read from console; goggle - reading from command line
            // travel from station 1 to station 4

            //if (inputMsg.equals("printTransaction"))
            // printTransaction

            // exit

            // issue card

            // new user

    }
}
