package singleton;

/**
 * Similar to Eager initialisation, but allows exception handling
 */
public class StaticBlockInit {

    private static StaticBlockInit instance;

    private StaticBlockInit() {}

    static{
        try{
            instance = new StaticBlockInit();
        } catch(Exception e) {
            throw new RuntimeException("Exception occured in creating StaticBlockInit instance");
        }
    }

    public static StaticBlockInit getInstance() {
        return instance;
    }

}
