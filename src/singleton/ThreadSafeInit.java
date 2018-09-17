package singleton;

/**
 * Simple thread safe implementation
 * BUT reduced performance since only one thread can execute method at a time
 * Double locking (2nd method) allows single thead access to creation of instance
 * but multithread access to reading instance
 */
public class ThreadSafeInit {

    private static ThreadSafeInit instance;

    private ThreadSafeInit(){}

    public static synchronized ThreadSafeInit getInstance() {
        if(instance == null) {
            instance = new ThreadSafeInit();
        }

        return instance;
    }
    /**
     * Double
     * @return
     */
    public static ThreadSafeInit getInstanceWithDoubleLock() {
        if(instance == null) {
            synchronized (ThreadSafeInit.class) {
                if(instance == null) {
                    instance = new ThreadSafeInit();
                }
            }
        }
        return instance;
    }

}
