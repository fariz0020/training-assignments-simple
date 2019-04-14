package eu.sig.training.ch04;

import java.util.HashMap;
import java.util.Map;

public class SavingsAccount extends Account {
    private static final float INTEREST_PERCENTAGE = 0.04f;
    private Money balance = new Money();
    private CheckingAccount registeredCounterAccount;
    private Map<String, Account> checkingAccounts;

    public Transfer makeTransfer(String counterAccount, Money amount) throws BusinessException {
        int sum = iterateCounterAccount(counterAccount);
        if (sum % 11 == 0) {
            checkingAccounts = new HashMap<>();
            checkingAccounts.put("acct1", this);
            checkingAccounts.put("acct2", Accounts.findAcctByNumber(counterAccount));
            Transfer result = new Transfer(checkingAccounts, amount);
            if (result.getCounterAccount().equals(this.registeredCounterAccount)) {
                return result;
            } else {
                throw new BusinessException("Counter-account not registered!");
            }
        } else {
            throw new BusinessException("Invalid account number!!");
        }
    }
}