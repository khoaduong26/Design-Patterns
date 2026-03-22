public class Test {
    public static void main(String[] args) {
        // EagerInititalizedSingleton instance1 = EagerInititalizedSingleton.getInstance();
        // EagerInititalizedSingleton instance2 = EagerInititalizedSingleton.getInstance();
        
        // StaticBlockInitialization instance3 = StaticBlockInitialization.getInstance();
        // StaticBlockInitialization instance4 = StaticBlockInitialization.getInstance();

        //LazyInitializationSingleton instance5 = LazyInitializationSingleton.getInstance();
        //LazyInitializationSingleton instance6 = LazyInitializationSingleton.getInstance();

 

        new Thread(()->{
            TheadSafeInitialization instance7 = TheadSafeInitialization.getInstance();
            System.out.println(instance7.hashCode());
        }).start();
        new Thread(()->{
            TheadSafeInitialization instance8 = TheadSafeInitialization.getInstance();
            System.out.println(instance8.hashCode());
        }).start();
        // if (instance1 == instance2) {
        //     System.out.println("Same instance");
        // } else {
        //     System.out.println("Different instances");
        // }

        // if(instance3 == instance4) {
        //     System.out.println("Same instance");
        // } else {
        //     System.out.println("Different instances");
        // }
        // if(instance5 == instance6) {
        //     //System.out.println("Same instance");
        //     System.out.println(instance5.hashCode());
        //     System.out.println(instance6.hashCode());
        // } else {
        //     System.out.println("Different instances");
        // }
    }
}
