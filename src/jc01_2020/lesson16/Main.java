package jc01_2020.lesson16;

/*
*
* Написать игру крестики нолики, где два игрока-потока играют друг с другом
* Ходят по очереди.
* Вывести в консоль результат партии и итоговое игровое поле
*
*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();

        Table table = new Table();

        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        service.execute(player1);
        service.execute(player2);

    }

}
