public class EagerInititalizedSingleton {
    
    private static final EagerInititalizedSingleton instance = new EagerInititalizedSingleton();
    
    private EagerInititalizedSingleton() {}
    
    public static EagerInititalizedSingleton getInstance() {
        return instance;
    }
}
