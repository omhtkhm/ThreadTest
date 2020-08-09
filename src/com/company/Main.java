package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount acount = new BankAccount();
        BankAccount acount2 = new BankAccount();

        SingleThreadEx2 ct = new SingleThreadEx2(acount);

        SingleThreadEx2 ct2= new SingleThreadEx2(acount2);

        Thread t = new Thread(ct,"첫번째");
        Thread t2 = new Thread(ct2,"두번째");

        t.start();


        t2.start();
    }
}
