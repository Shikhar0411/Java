package Singleton;

public class SingletonLazy {
    private static SingletonLazy singletonLazy = null;
    private SingletonLazy() {}
    public static SingletonLazy getInstance(){
        if (singletonLazy == null){
            System.out.println("Creating the singletonLazy instance as it is null");
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }
}
