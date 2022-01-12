package academy.devdojo.maratonajava.javacore.ZZFthread.service;

import academy.devdojo.maratonajava.javacore.ZZFthread.dominio.Members;

public class EmailDeliveryService implements Runnable {

    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " starting to delivery emails...");
        while (members.isOpen() || members.pendingEmails() > 0) {
            try {
                String email = members.retrieeveEmail();
                if (email== null) continue;
                System.out.println(threadName + " enviando email para " + email);
                Thread.sleep(2000);
                System.out.println(threadName + " enviou email com sucesso para " + email);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Todos os emails foram enivados com sucesso!");

    }
}
