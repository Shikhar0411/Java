package DesignPatterns.Strategy;

public class LowerCase implements PrintStrategy {
    @Override
    public String formatString(String input) {
        return input.toLowerCase();
    }
}
