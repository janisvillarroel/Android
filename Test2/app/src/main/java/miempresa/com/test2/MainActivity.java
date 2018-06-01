package miempresa.com.test2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private View layoutPrincipal;
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//La R es de recursos enlazas todo lo de res
        this.layoutPrincipal = (LinearLayout) findViewById(R.id.layoutPrincipal);
        this.text=(TextView) findViewById(R.id.textEvento);
    }

    public void changeRed(View view){
        this.layoutPrincipal.setBackgroundColor(Color.RED);
    }
}
