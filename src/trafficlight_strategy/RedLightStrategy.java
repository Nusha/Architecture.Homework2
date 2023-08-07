package trafficlight_strategy;

public class RedLightStrategy implements LightStrategy{
    @Override
    public void action() {
        System.out.println("Красный свет. Стоп");
    }
}
