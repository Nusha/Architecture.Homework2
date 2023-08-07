package gaspump_command;

import java.util.ArrayList;
import java.util.List;

public class GasPump {

    private final List<Command> commands;

    public GasPump() {
        this.commands = new ArrayList<>();
    }

    public void takeCommand(Command command) {
        commands.add(command);
    }

    public void executeCommands() {
        for (Command command: commands) {
            command.execute();
        }
        commands.clear();
    }
}
