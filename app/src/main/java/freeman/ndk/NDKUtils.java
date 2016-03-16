package freeman.ndk;

/**
 * Created by freeman on 2016/3/15.
 */
public class NDKUtils {
    public native static String getCLanguageString();

    public native int getCLanguageInt(int a);

    static {
        System.loadLibrary("NDKSO");
    }
}
