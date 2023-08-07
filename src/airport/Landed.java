package airport;

public class Landed implements FlightState {
    @Override
    public void updateFlightStatus() {
        System.out.println("Приземлился");
    }
}
