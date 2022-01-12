package academy.devdojo.maratonajava.javacore.ZZFthread.test;

import academy.devdojo.maratonajava.javacore.ZZFthread.dominio.Account;

public class ThreadAccountTest01 implements Runnable {
    private Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Hestia");
        Thread t2 = new Thread(threadAccountTest01, "Bell Cranel");
        t1.start();
        t2.start();

    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("Não dá");
            }
        }
    }

    private synchronized void withdrawal(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(getThreadName() + " está indo sacar dinheiro");
            account.withdrawal(amount);
            System.out.println(getThreadName() + " completou o saque, valor atual da conta " + account.getBalance());

        } else {
            System.out.println("Sem dinheiro na conta para " + getThreadName() + " efetuar o saque " + account.getBalance());


        }
    }

    private String getThreadName() {
        return Thread.currentThread().getName();
    }


}
