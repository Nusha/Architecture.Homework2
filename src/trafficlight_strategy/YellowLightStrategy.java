package trafficlight_strategy;

public class YellowLightStrategy implements LightStrategy{
    @Override
    public void action() {
        System.out.println("Приготовьтесь, желтый свет");
    }
}
