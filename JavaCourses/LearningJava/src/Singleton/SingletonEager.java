package Singleton;

public class SingletonEager {
    private static SingletonEager singletonEagerInstance = new SingletonEager();
    private SingletonEager(){}

    public static SingletonEager getInstance(){
        return singletonEagerInstance;
    }
}
