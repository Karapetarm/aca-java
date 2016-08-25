package gcard.cadr;

import gcard.terminal.Terminal;

public interface ICardAction {
    void topUp(int amount);
    void tap(Terminal terminal);
}
