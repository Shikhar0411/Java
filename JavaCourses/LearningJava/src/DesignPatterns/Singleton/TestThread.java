package DesignPatterns.Singleton;

public class TestThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Check");
        SingletonThreadSafe singletonThreadSafe = SingletonThreadSafe.getInstance();
        System.out.println(singletonThreadSafe);
    }
}
