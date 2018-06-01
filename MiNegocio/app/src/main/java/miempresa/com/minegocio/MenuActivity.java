package miempresa.com.minegocio;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MenuActivity extends Activity {

    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void changeText(View view) {
        this.text=(TextView) findViewById(R.id.textView2);
        if (view.getId()== R.id.button2)
            this.text.setText(R.string.menu1);
        if (view.getId()== R.id.button3)
            this.text.setText(R.string.menu2);
        if (view.getId()== R.id.button4)
            this.text.setText(R.string.menu3);
        if (view.getId()== R.id.button5 )
            this.text.setText(R.string.menu4);
        if (view.getId()== R.id.button6 )
            this.text.setText(R.string.menu5);
    }
}
