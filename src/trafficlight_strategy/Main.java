package trafficlight_strategy;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        trafficLight.setLightStrategy(new RedLightStrategy());
        trafficLight.performAction();

        trafficLight.setLightStrategy(new YellowLightStrategy());
        trafficLight.performAction();

        trafficLight.setLightStrategy(new GreenLightStrategy());
        trafficLight.performAction();
    }
}
