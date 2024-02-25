package DesignPatterns.AbstractFactory;

public interface DataSourceAbstractFactory {
    Service createService();
    Response createResponse();
}
