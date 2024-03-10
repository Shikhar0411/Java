package DesignPatterns.Command;

public class Main {
    public static void main(String[] args) {
        CommandProcessor processor = new CommandProcessor();
        processor.addCommand(new OrderAddCommand(1,34.55));
        processor.addCommand(new OrderAddCommand(2,454));
        processor.addCommand(new OrderExecuteCommand(1));
        processor.addCommand(new OrderExecuteCommand(2));
        processor.executeCommand();
    }
}
