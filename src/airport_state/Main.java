package airport_state;

public class Main {
    public static void main(String[] args) {
        FlightContext context = new FlightContext();


        context.updateStatus();


        Delayed delayedState = new Delayed();
        context.setState(delayedState);
        context.updateStatus();


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
