package airport_state;

public class Depatured implements FlightState {
    @Override
    public void updateFlightStatus() {
        System.out.println("Вылетел");
    }
}
