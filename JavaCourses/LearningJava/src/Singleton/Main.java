package Singleton;

public class Main {
    public static void main(String[] args) {
        // Singleton Eager Implementation
        SingletonEager eager1 = SingletonEager.getInstance();
        SingletonEager eager2 = SingletonEager.getInstance();
        System.out.println(eager1);
        System.out.println(eager2);

        // Singleton Static
        SingletonStatic singletonStatic1 = SingletonStatic.getInstance();
        SingletonStatic singletonStatic2 = SingletonStatic.getInstance();
        System.out.println(singletonStatic1);
        System.out.println(singletonStatic2);

        // Singleton Lazy implementation
        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
        System.out.println(singletonLazy1);
        System.out.println(singletonLazy2);

        // Singleton Thread Safe
        TestThread runnable = new TestThread();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();

        // Bill Pugh - legacy code


    }
}
