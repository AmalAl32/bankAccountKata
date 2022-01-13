package fr.kata.bank.statementPrinting;

import fr.kata.bank.transaction.Transaction;

import java.util.List;

public class StatementPrinting {

    public static final String HEADER = "||   OPERATION  ||     DATE     ||    AMOUNT   ||   BALANCE  ||";

    public StatementPrinting(){}

    public void printStatement(List<Transaction> transactionList){
        System.out.println(HEADER);
        transactionList.stream()
                .forEach(transaction->{
                            StringBuffer str = new StringBuffer();
                            str = str.append("||   ").append(String.format("%-10s", transaction.getOperation())).
                                      append(" ||  ").append(String.format("%-11s", transaction.getDate())).
                                      append(" ||  ").append(String.format("%-10s", transaction.getAmount())).
                                      append(" ||  ").append(String.format("%-10s", transaction.getNewBalance())).append("|| ");
                            System.out.println(str.toString());
                });
    }

}
