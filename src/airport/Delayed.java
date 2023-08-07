package airport;

public class Delayed implements FlightState {
    @Override
    public void updateFlightStatus() {
        System.out.println("Задерживается");
    }
}
