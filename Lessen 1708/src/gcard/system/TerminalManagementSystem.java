package gcard.system;


import gcard.terminal.StoreTerminal;

import java.util.UUID;

public class TerminalManagementSystem {


    public void issueNewTerminal(String terminalAddress,TerminalType terminalType){
        StoreTerminal storeTerminal1=new StoreTerminal(UUID.randomUUID(),terminalAddress);
    }
}
