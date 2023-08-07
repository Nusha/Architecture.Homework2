package trafficlight_strategy;

public class GreenLightStrategy implements LightStrategy {
    @Override
    public void action() {
        System.out.println("Можно ехать, зеленый свет!");
    }
}
