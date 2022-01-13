package fr.kata.bank.transaction;


public class Transaction {

    private String operation;
    private String date;
    private double amount;
    private double newBalance;

    public Transaction(String operation, String date, int amount, double newBalance) {
        this.operation = operation;
        this.date = date;
        this.amount = amount;
        this.newBalance = newBalance;
    }

    public String getOperation(){
        return operation;
    }
    public double getNewBalance(){
        return newBalance;
    }
    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "operation=" + operation +
                ", date='" + date + "'" +
                ", amount =" + amount +
                ", balance=" +  newBalance + '\'' +
                '}';
    }


}
