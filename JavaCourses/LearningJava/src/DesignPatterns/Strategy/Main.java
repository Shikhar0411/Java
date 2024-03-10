package DesignPatterns.Strategy;

public class Main {
    public static void main(String[] args) {
        LowerCase str1 = new LowerCase();
        UpperCase str2 = new UpperCase();
        RandomCaseStrategy str3 = new RandomCaseStrategy();

        String input = "LOREM ipsum DOLOR sit amert";

        Executor executor = new Executor(str1);
        executor.printString(input);
        executor = new Executor(str2);
        executor.printString(input);
        executor = new Executor(str3);
        executor.printString(input);
    }
}
