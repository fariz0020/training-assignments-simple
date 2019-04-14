package eu.sig.training.ch04;

import java.util.HashMap;
import java.util.Map;

// tag::CheckingAccount[]
public class CheckingAccount extends Account {
    private static final float INTEREST_PERCENTAGE = 0.01f;
    private Money balance = new Money();
    private int transferLimit = 100;
    private Map<String, Account> checkingAccounts;

    public Transfer makeTransfer(String counterAccount, Money amount)
        throws BusinessException {
        if (amount.greaterThan(this.transferLimit)) {
            throw new BusinessException("Limit exceeded!");
        }
        int sum = iterateCounterAccount(counterAccount);
        if (sum % 11 == 0) {
            checkingAccounts = new HashMap<>();
            checkingAccounts.put("acct1", this);
            checkingAccounts.put("acct2",Accounts.findAcctByNumber(counterAccount)) ;
            Transfer result = new Transfer(checkingAccounts, amount);
            return result;
        } else {
            throw new BusinessException("Invalid account number!");
        }
    }
}
// end::CheckingAccount[]
