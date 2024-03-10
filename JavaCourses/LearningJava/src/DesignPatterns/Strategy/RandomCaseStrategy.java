package DesignPatterns.Strategy;

import java.util.Random;

public class RandomCaseStrategy implements PrintStrategy {


    @Override
    public String formatString(String input) {
        StringBuilder output = new StringBuilder();
        Random random = new Random();
        for (Character ch : input.toCharArray()){
            if (random.nextBoolean()){
                output.append(ch.toString().toUpperCase());
            } else {
                output.append(ch.toString().toLowerCase());
            }
        }
        return output.toString();
    }
}
