package airport;

public class Main {
    public static void main(String[] args) {
        FlightContext context = new FlightContext();

        // By default, a flight is on time
        context.updateStatus();

        // Due to unforeseen circumstances, the flight is delayed
        Delayed delayedState = new Delayed();
        context.setState(delayedState);
        context.updateStatus();

        // Unfortunately, flight is cancelled
        Cancelled cancelledState = new Cancelled();
        context.setState(cancelledState);
        context.updateStatus();

        Depatured depaturedState = new Depatured();
        context.setState(depaturedState);
        context.updateStatus();

        Landed landedState = new Landed();
        context.setState(landedState);
        context.updateStatus();
    }
}
