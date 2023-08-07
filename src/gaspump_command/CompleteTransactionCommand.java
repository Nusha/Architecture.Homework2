package gaspump_command;

public class CompleteTransactionCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Совершение оплаты");
    }
}
