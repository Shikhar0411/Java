package DesignPatterns.AbstractFactory;

public class DatabaseResponse implements Response{

    @Override
    public String getResponse() {
        return "Database Response running";
    }
}
