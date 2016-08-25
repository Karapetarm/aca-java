package gcard.system;


import gcard.cadr.UserCard;
import java.util.Date;


public interface DispatcherInterface {
    void issueNewCard(String userName,int startBalance);
    //void registerCard(UsreCard usreCard);
}
