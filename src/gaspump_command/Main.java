package gaspump_command;

public class Main {
    public static void main(String[] args) {
        GasPump gasPump = new GasPump();

        // Конструкторы
        Command diesel = new DieselCommand();
        Command gasoline = new GasolineCommand();
        Command completeTransaction = new CompleteTransactionCommand();

        // Добавление команд в колонку
        gasPump.takeCommand(diesel);
        gasPump.takeCommand(gasoline);
        gasPump.takeCommand(completeTransaction);

        // Выполнить команды
        gasPump.executeCommands();
    }
}
