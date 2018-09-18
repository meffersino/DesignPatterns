package singleton;

/**
 * One option to combat the issue of reflections breaking the singleton is to use enums
 * Java ensures any enum is only instantiated once in a java program
 * Enums are also globally accessible
 * Doesnt allow lazy initialisation though since its not flexible
 */
public enum EnumInit {

    INSTANCE;

    public static void doSomething() {
        //do something
    }
}
