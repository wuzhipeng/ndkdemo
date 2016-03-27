package freeman.ndk;

import android.widget.TextView;

/**
 * Created by freeman on 2016/3/15.
 */
public class NDKUtils {
    private TextView textView;

    public NDKUtils(TextView tv) {
        textView = tv;
    }

    public native static String getCLanguageString();

    public native int getCLanguageInt(int a);

    public native void callCCode();

    public native void callCCodeString(String string);

    /**
     * 给C回调的方法，带参数String
     * @param string
     */
    public void cLanguageCallBack(String string) {
       if(textView != null)
            textView.setText(string);
    }

    /**
     * 不带参数，给C回调的方法
     */
    public void javaMethod() {
        System.out.println("打印");
    }



    static {
        System.loadLibrary("NDKSO");
    }
}
