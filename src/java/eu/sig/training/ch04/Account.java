package eu.sig.training.ch04;

public interface Account {
    Transfer makeTransfer(String counterAccount, Money amount) throws BusinessException;
    Integer iterateCounterAccount(String counterAccount);
    void addInterest();
}
