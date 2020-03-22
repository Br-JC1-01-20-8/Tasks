package jc01_2020.classwork.multithreading.task01;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        List<Cashbox> cashboxes = Arrays.asList(
                new Cashbox(1),
                new Cashbox(2),
                new Cashbox(3)
        );

        List<Buyer> buyers = Arrays.asList(
                new Buyer("Cookies", cashboxes),
                new Buyer("Milk", cashboxes),
                new Buyer("Bread", cashboxes),
                new Buyer("Butter", cashboxes),
                new Buyer("Sour cream", cashboxes),
                new Buyer("Spaghetti", cashboxes),
                new Buyer("Banana", cashboxes),
                new Buyer("Orange", cashboxes),
                new Buyer("Fish", cashboxes),
                new Buyer("Chocolate", cashboxes)
        );

//        List<Buyer> buyers = Arrays.asList(
//                new Buyer("Cookies", 1500, cashboxes),
//                new Buyer("Milk", 500, cashboxes),
//                new Buyer("Bread", 800, cashboxes),
//                new Buyer("Butter", 500, cashboxes),
//                new Buyer("Sour cream", 700, cashboxes),
//                new Buyer("Spaghetti", 500, cashboxes),
//                new Buyer("Banana", 1500, cashboxes),
//                new Buyer("Orange", 1500, cashboxes),
//                new Buyer("Fish", 2500, cashboxes),
//                new Buyer("Chocolate", 500, cashboxes)
//        );

        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        for (Buyer buyer : buyers) {
            service.execute(buyer);
        }

        service.shutdown();

    }

}
