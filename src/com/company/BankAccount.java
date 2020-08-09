package com.company;

public class BankAccount {
    boolean isEmpty = true; // 화장실 비어있는지

    public synchronized void use() throws InterruptedException {
        if( !isEmpty ) {

            wait();

        } else{
            isEmpty = false;
            똥싸는함수();

            isEmpty = true;
            notifyAll();  // 똥퍼() 사용하는 thread에게 알려줘서 똥을 푸게 하는 의미
        }
    }

}

123
