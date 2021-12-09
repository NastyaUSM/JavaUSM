package cad.lab7.nomer8_10;

public enum TrafficLight {
    RED(40), GREEN(60), YELLOW(10);

    private final int duration;

    TrafficLight(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return this.duration;
    }

}
