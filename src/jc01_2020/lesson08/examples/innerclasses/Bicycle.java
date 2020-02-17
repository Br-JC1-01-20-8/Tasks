package jc01_2020.lesson08.examples.innerclasses;

public class Bicycle {

    private String model;
    private int weight;

    public Bicycle(String model, int weight) {
        this.model = model;
        this.weight = weight;
    }

    public void start() {
        System.out.println("Поехали!");
    }

    public class Wheel {

        public void right() {
            System.out.println("Руль вправо!");
        }

        public void left() {

            System.out.println("Руль влево!");
        }
    }

    public class Seat {

        public void up() {

            System.out.println("сиденье поднято выше!");
        }

        public void down() {

            System.out.println("сиденье опущено ниже!");
        }
    }
}
