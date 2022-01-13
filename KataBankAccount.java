package fr.kata.bank;

import fr.kata.bank.account.Account;
import fr.kata.bank.statementPrinting.StatementPrinting;
import fr.kata.bank.transaction.Transaction;

import java.util.ArrayList;
import java.util.List;

public class KataBankAccount {
    public static void main(String[] args) {
        List<Transaction> transactionList = new ArrayList<>();

        StatementPrinting printStatement = new StatementPrinting();

        Account account = new Account(0, transactionList, printStatement);

        account.deposit(1000);
        account.withdraw(300);
        account.withdraw(50);
        account.deposit(500);

        account.printStatement(transactionList);

    }
}
