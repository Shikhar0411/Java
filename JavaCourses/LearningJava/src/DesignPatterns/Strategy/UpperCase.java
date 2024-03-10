package DesignPatterns.Strategy;

public class UpperCase implements PrintStrategy {

    @Override
    public String formatString(String input) {
        return input.toUpperCase();
    }
}
