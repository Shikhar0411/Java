package DesignPatterns.AbstractFactory;

public class NetworkResponse implements Response{

    @Override
    public String getResponse() {
        return "Network Response Running";
    }
}
