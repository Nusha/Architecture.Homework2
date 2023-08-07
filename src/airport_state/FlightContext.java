package airport_state;

public class FlightContext {
    private FlightState flightState;

    public FlightContext() {
        // by default, a flight is on time
        flightState = new Landed();
    }

    public void setState(FlightState state) {
        this.flightState = state;
    }

    public FlightState getState() {
        return this.flightState;
    }

    public void updateStatus() {
        this.flightState.updateFlightStatus();
    }
}
