package ejemplo.com.guia4_2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = (TextView) findViewById(R.id.textView2);
        text.setText("Boton seleccionado: Ninguno");
    }
    public void changeText(View view) {
        TextView text = (TextView) findViewById(R.id.textView2);
        Button btn=(Button) findViewById(view.getId());
        text.setText("Boton seleccionado: "+btn.getText());
        if (view.getId() == R.id.button) {
            Intent i = new Intent(this, ServicesActivity.class);
            startActivity(i);
        }
    }
}
