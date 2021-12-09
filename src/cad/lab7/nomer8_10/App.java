package cad.lab7.nomer8_10;

public class App {

    public static void main(String[] args) {

        for (TrafficLight trafficLight : TrafficLight.values()) {
            System.out.printf("%s - %d\n", trafficLight, trafficLight.getDuration());
        }
    }

}
