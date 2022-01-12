package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;
import java.util.concurrent.*;

public class LinkedTransfererQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("Roberto"));
        System.out.println(tq.offer("Roberto"));
        System.out.println(tq.offer("Roberto", 10, TimeUnit.SECONDS));
        tq.put("DevDojo");
        if (tq.hasWaitingConsumer()) {
            tq.transfer("DevDojo");
        }
        System.out.println(tq.tryTransfer("Academy"));
        System.out.println(tq.tryTransfer("Academy", 5,TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.remainingCapacity());

    }
}
