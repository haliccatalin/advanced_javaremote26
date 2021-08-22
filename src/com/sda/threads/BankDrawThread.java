package com.sda.threads;

public class BankDrawThread extends Thread {

    private Bank bank;

    public BankDrawThread(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        this.bank.drawMoney();
    }
}
