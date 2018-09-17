package singleton;

/**
 * Quick and easy
 * Should be avoided as creates instance even if never used
 * Only used if not many resources for singleton class
 * No option for exception handling
 */
public class EagerInit {

    private static final EagerInit INSTANCE = new EagerInit();
    private EagerInit() {

    }

    public static EagerInit getEagerInit() {
        return INSTANCE;
    }

}
