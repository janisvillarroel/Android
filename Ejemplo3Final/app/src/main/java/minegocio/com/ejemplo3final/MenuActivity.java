package minegocio.com.ejemplo3final;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MenuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void changeText(View view) {
        TextView text = (TextView) findViewById(R.id.textView2);
        if(view.getId()==R.id.button)
            text.setText(R.string.btn1);
        if(view.getId()==R.id.button2)
            text.setText(R.string.btn2);
        if(view.getId()==R.id.button3)
            text.setText(R.string.btn3);
        if(view.getId()==R.id.button4)
            text.setText(R.string.btn4);
        if(view.getId()==R.id.button5)
            text.setText(R.string.btn5);
    }
}
