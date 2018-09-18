package singleton;

import java.lang.reflect.Constructor;

/**
 * Can be used to destroy Eager,StaticBlock,Lazy,ThreadSafe, and BillPugh singleton implementations
 * As seen, the hash codes of the two 'instances' are different so not the same object
 *
 */
public class ReflectionTest {

    public static void main(String[] args) {
        EagerInit instanceOne = EagerInit.getEagerInit();
        EagerInit instanceTwo = null;

        try{
            Constructor[] constructors = EagerInit.class.getDeclaredConstructors();
            for(Constructor constructor : constructors) {
                constructor.setAccessible(true);
                instanceTwo = (EagerInit) constructor.newInstance();
                break;
            }

            System.out.println("Instance one: " + instanceOne.hashCode());
            System.out.println("Instance two: " + instanceTwo.hashCode());
        } catch (Exception e ) {
            e.printStackTrace();
        }
    }

}
