package airport_state;

public class Landed implements FlightState {
    @Override
    public void updateFlightStatus() {
        System.out.println("Приземлился");
    }
}
