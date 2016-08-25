package gcard.user;


import gcard.system.DataBase;

import java.util.UUID;

public class User {

    private String userName;
    private UUID id;
    private UUID cardID;

    public User(String userName){
        this.userName=userName;
        id=UUID.randomUUID();
        cardID=UUID.randomUUID();

    }

    public void registerUser(User user) {
        DataBase.registerUser.add(user);
    }
    public String getUserName() {
        return userName;
    }

    public UUID getId() {
        return id;
    }

    public UUID getCardID() {
        return cardID;
    }
    public String toString(){
        return userName;
    }
}
