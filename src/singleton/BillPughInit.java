package singleton;

/**
 * Created to deal with memory issues in java 5
 * Helper class only loaded into memory when getInstance called
 * Widely used as doesn't need synchronisation
 */
public class BillPughInit {

    private BillPughInit(){}

    private static class BillPughInitHelper{
        private static final BillPughInit INSTANCE = new BillPughInit();
    }

    public static BillPughInit getInstance() {
        return BillPughInitHelper.INSTANCE;
    }


}
