package gcard.system;


import gcard.cadr.UserCard;

public interface DispatcherInterface {
    void issueNewCard(String userName,int startBalance);
    void registerCard(UserCard userCard);
}
