package freeman.ndk;

/**
 * Created by freeman on 2016/3/15.
 */
public class NDKUtils {
    public native static String getCLanguageString();

    static {
        System.loadLibrary("NDKSO");
    }
}
