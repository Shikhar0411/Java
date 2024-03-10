package DesignPatterns.Command;

public class OrderExecuteCommand implements Command {

    int id;

    public OrderExecuteCommand(int id) {
        this.id = id;
    }

    @Override
    public void execute() {
        System.out.println("Executing the order with id : " + id);
    }
}
