package eu.sig.training.ch04;

import java.util.HashMap;
import java.util.Map;

// tag::CheckingAccount[]
public class CheckingAccount implements Account {
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

    public Integer iterateCounterAccount(String counterAccount) {
        int sum = 0;
        for (int i = 0; i < counterAccount.length(); i++) {
            char character = counterAccount.charAt(i);
            int characterValue = Character.getNumericValue(character);
            sum = sum + (9 - i) * characterValue;
        }
        return sum;
    }

    public void addInterest() {
        Money interest = balance.multiply(INTEREST_PERCENTAGE);
        if (interest.greaterThan(0)) {
            balance.add(interest);
        } else {
            balance.substract(interest);
        }
    }
}
// end::CheckingAccount[]
