package DesignPatterns.Singleton;

public class SingletonThreadSafe {

    private static SingletonThreadSafe singletonThreadSafe = null;

    public SingletonThreadSafe() {}

    public static synchronized SingletonThreadSafe getInstance(){
        if (singletonThreadSafe == null){
            singletonThreadSafe = new SingletonThreadSafe();
        }
        return singletonThreadSafe;
    }
}
