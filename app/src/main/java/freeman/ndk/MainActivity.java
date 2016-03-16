package freeman.ndk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.text);

        NDKUtils utils = new NDKUtils();
        tv.setText(NDKUtils.getCLanguageString() + "\n" + utils.getCLanguageInt(5));
    }
}
