package gaspump_command;

public class GasolineCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Заправка бензином");
    }
}
