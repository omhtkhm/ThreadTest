package com.company;

public class SingleThreadEx2 implements Runnable{
    BankAccount account;

    public SingleThreadEx2(BankAccount account){
        this.account = account;
    }

    @Override
    public void run() {

        // TODO Auto-generated method stub
        for(int i=0; i< 10; i++) {

            account.trnafer(); // 이부분만 동시에 못들어옴
            account.get();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
            }
        }
    }

}