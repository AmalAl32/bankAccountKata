package fr.kata.bank.account;

        import fr.kata.bank.statementPrinting.StatementPrinting;
        import fr.kata.bank.transaction.Transaction;

        import java.text.SimpleDateFormat;
        import java.util.Date;
        import java.util.List;

public class Account {

    public enum Operation {Deposit, withdrawal}

    private final List<Transaction> transactionList ;
    private double  balance;
    private StatementPrinting printStatement;

    public Account(double balance, List<Transaction> transactionList, StatementPrinting printStatement ){
        this.balance = balance;
        this.transactionList = transactionList;
        this.printStatement = printStatement;
    }

    public void deposit(int amount) {
        double newBalance = balance+amount;
        Transaction deposit = new Transaction(Operation.Deposit.toString() , dateAsString(), amount, newBalance);
        setBalance(newBalance);
        transactionList.add(deposit);
    }

    public void withdraw(int amount) {
        double newBalance = balance-amount;
        Transaction deposit = new Transaction(Operation.withdrawal.toString(), dateAsString(), -amount, newBalance);
        setBalance(newBalance);
        transactionList.add(deposit);
    }
    public void printStatement(List<Transaction> transactionList){
        printStatement.printStatement(transactionList);
    }

       private void setBalance(double balance) {
        this.balance = balance;
    }

    /***/
    private String dateAsString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return simpleDateFormat.format(new Date());
    }

}
