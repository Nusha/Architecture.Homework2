package airport;

public class Cancelled implements FlightState {
    @Override
    public void updateFlightStatus() {
        System.out.println("Отменен");
    }
}
