package freeman.ndk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv = null;
    TextView tv1 = null;
    Button btn = null;
    EditText editText = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.text);
        tv1 = (TextView) findViewById(R.id.text1);
        btn = (Button) findViewById(R.id.btn);
        editText = (EditText) findViewById(R.id.edit_text);

        final NDKUtils utils = new NDKUtils(tv1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String string = editText.getText().toString();
                if(!TextUtils.isEmpty(string))  {
                    // 调用C方法，让它回调Java方法
                    utils.callCCodeString(string);
                }

            }
        });

        String content = NDKUtils.getCLanguageString() + "\n" + utils.getCLanguageInt(5);
        tv.setText(content);

    }
}
