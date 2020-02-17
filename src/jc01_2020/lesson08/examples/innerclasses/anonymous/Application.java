package jc01_2020.lesson08.examples.innerclasses.anonymous;

public class Application {

    public static void main(String[] args) {
        MonitoringSystem firstSystem = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("first");
            }
        };
        MonitoringSystem secondSystem = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("second");
            }
        };
        MonitoringSystem thirdSystem = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("third");
            }
        };

        firstSystem.startMonitoring();
        secondSystem.startMonitoring();
        thirdSystem.startMonitoring();

    }

}
