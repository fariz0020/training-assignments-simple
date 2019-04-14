package eu.sig.training.ch04;

public class Account {

    protected Integer iterateCounterAccount(String counterAccount) {
        int sum = 0;
        for (int i = 0; i < counterAccount.length(); i++) {
            char character = counterAccount.charAt(i);
            int characterValue = Character.getNumericValue(character);
            sum = sum + (9 - i) * characterValue;
        }
        return sum;
    }

    public void addInterest() {
    }
}
