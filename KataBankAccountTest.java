package fr.kata.bank;

import fr.kata.bank.account.Account;
import fr.kata.bank.statementPrinting.StatementPrinting;
import fr.kata.bank.transaction.Transaction;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KataBankAccountTest {
   @Test
    public void testAccount(){
        List<Transaction> transactionList = new ArrayList<>();
        StatementPrinting printStatement = new StatementPrinting();

        Transaction deposit_1 = new Transaction("Deposit", "01/04/2022", 1000, 1000);
        Transaction withdrawal = new Transaction("Withdrawal", "02/04/2022", -100, 900);
        Transaction deposit_2 = new Transaction("Deposit","10/04/2022", 500, 1400);

        transactionList.add(deposit_1);
        transactionList.add(withdrawal);
        transactionList.add(deposit_2);

        Account account = new Account(0,transactionList,printStatement);
        account.printStatement(transactionList);

    }



}