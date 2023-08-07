package airport;

public class Depatured implements FlightState {
    @Override
    public void updateFlightStatus() {
        System.out.println("Вылетел");
    }
}
