public class StaticBlockInitialization {
    private static final StaticBlockInitialization instance;

    static {
        try {
            instance = new StaticBlockInitialization();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred during singleton instantiation");
        }
    }
    private StaticBlockInitialization() {}
    public static StaticBlockInitialization getInstance(){
        return instance;
    }
}
