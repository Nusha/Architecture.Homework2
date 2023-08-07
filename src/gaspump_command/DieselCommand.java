package gaspump_command;

public class DieselCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Заправка дизелем");
    }
}
