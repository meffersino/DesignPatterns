package singleton;
/**
 *
 * In distributed systems, serialisation is used to store a state in file system and retrieve it later
 * Issue with below implementation is that every time its deserialised, it creates a new instance
 *  See SerialisedTest.java
 *
 */

import java.io.Serializable;

public class SerialisedInit implements Serializable{

    private static final long serialVersionUID = -7604766932017737115L;

    private SerialisedInit(){}

    private static class SingletonHelper{
        private static final SerialisedInit instance = new SerialisedInit();
    }

    public static SerialisedInit getInstance() {
        return SingletonHelper.instance;
    }


    //This method is added to remove the issue of deserialiastion destroying the singleton pattern
    protected Object readResolve() {
        return getInstance();
    }

}
