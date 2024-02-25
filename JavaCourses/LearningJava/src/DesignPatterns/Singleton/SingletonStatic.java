package DesignPatterns.Singleton;

public class SingletonStatic {
    private static SingletonStatic singletonStaticInstace;

    static {
        singletonStaticInstace = new SingletonStatic();
    }
    private SingletonStatic() {}

    public static SingletonStatic getInstance() {
        return singletonStaticInstace;
    }
}
