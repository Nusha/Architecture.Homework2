package trafficlight_strategy;

public class TrafficLight {
    private LightStrategy lightStrategy;

    public void setLightStrategy(LightStrategy lightStrategy) {
        this.lightStrategy = lightStrategy;
    }

    public void performAction() {
        lightStrategy.action();
    }
}
