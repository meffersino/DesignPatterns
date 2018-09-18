package singleton;

import java.io.*;

/**
 * This program destorys the singleton pattern. To overcome this, we must implement the readResolve method
 *  See SerialisedInit.java
 *
 */
public class SerialisedTest {

    public static void main(String[] args) throws FileNotFoundException, IOException,ClassNotFoundException{
        SerialisedInit instanceOne = SerialisedInit.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        out.writeObject(instanceOne);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
        SerialisedInit instanceTwo = (SerialisedInit) in.readObject();
        in.close();

        System.out.println("Instance one hash code: " + instanceOne.hashCode());
        System.out.println("Instance two hash code: " + instanceTwo.hashCode());

    }

}
