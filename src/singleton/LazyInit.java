package singleton;

/**
 * Creates the instance in the global access method
 * Fine for single threaded environments
 *  -Not thread safe initialisation
 */
public class LazyInit {

    private static LazyInit instance;

    private LazyInit(){}

    public static LazyInit getInstance() {
        if(instance == null) {
            instance = new LazyInit();
        }
        return instance;
    }

}
