package gcard.system;

import gcard.cadr.UserCard;
import gcard.terminal.Terminal;
import gcard.user.User;


import java.util.ArrayList;
import java.util.List;


public class DataBase {

   public static List<UserCard> cards;
   public static List<User> registerUser;
   public static List<Terminal> terminalList;
   public static List<List<String>> transactionList;



    static{
        System.out.println("static block");
          List<UserCard> cards = new ArrayList<UserCard>() ;
          List<User> registerUser = new ArrayList<User>();
          List<Terminal> terminalList = new ArrayList<Terminal>();
          List<List<String>> transactionList = new ArrayList<List<String>>();
    }
}
