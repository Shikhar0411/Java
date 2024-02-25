package DesignPatterns.AbstractFactory;

public class DatabaseService implements Service{
    @Override
    public String runService() {
        return "Database Service is Running";
    }

}
