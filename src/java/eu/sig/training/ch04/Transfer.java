package eu.sig.training.ch04;

import java.util.Map;

public class Transfer {
    CheckingAccount counterAccount;

    @SuppressWarnings("unused")
    public Transfer(Map<String, Account> accountMap, Money m) {}

    public CheckingAccount getCounterAccount() {
        return this.counterAccount;
    }
}
