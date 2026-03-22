public class TheadSafeInitialization {
    private static TheadSafeInitialization instance;

    private TheadSafeInitialization() {
    }

    public static synchronized TheadSafeInitialization getInstance() {
        if (instance == null) {
            instance = new TheadSafeInitialization();
        }
        return instance;
    }
}
