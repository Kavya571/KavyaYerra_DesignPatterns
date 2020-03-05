package com.epam.task7;

public class BankAccountFacade {
    private int accountNumber;
    private int securityCode;
    AccountNumCheck acctChecker;
    SecurityCodeCheck codeChecker;
    FundsCheck fundChecker;

    WelcometoBank bankWelcome;
    public BankAccountFacade(int newAcctNum, int newSecCode){
        accountNumber = newAcctNum;

        securityCode = newSecCode;
        bankWelcome = new WelcometoBank();
        acctChecker = new AccountNumCheck();

        codeChecker = new SecurityCodeCheck();
        fundChecker = new FundsCheck();
    }
    public int getAccountNumber() { return accountNumber; }

    public int getSecurityCode() { return securityCode; }

    public void withdrawCash(double cashToGet){
        if(acctChecker.accountActive(getAccountNumber()) && codeChecker.isCodeCorrect(getSecurityCode()) && fundChecker.haveEnoughMoney(cashToGet)) {
                     

                    System.out.println("Transaction Complete\n");
                } else {

                    System.out.println("Transaction Failed\n");

                }
         

    }  

    public void depositCash(double cashToDeposit){
         

        if(acctChecker.accountActive(getAccountNumber()) && codeChecker.isCodeCorrect(getSecurityCode())) {
                    fundChecker.makeDeposit(cashToDeposit);
                    System.out.println("Transaction Complete\n");
                } else {
                    System.out.println("Transaction Failed\n");

                }
    }
}
