package DesignPatterns.Bridge;

public class Main {

    public static void main(String[] args) {
        App app1 = new Facebook(new Ios());
        app1.runApp();
        App app2 = new Facebook(new Android());
        app2.runApp();
    }
}
