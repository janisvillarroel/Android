package com.ejemplo.guia4;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

    private View layoutPrincipal;
    private Button btnWhite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.layoutPrincipal = (LinearLayout) findViewById(R.id.layoutPrincipal);
        this.btnWhite = (Button) findViewById(R.id.btnWhite);

        this.btnWhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutPrincipal.setBackgroundColor(Color.WHITE);
            }
        });
    }

    public void changeBlue(View view) {
        this.layoutPrincipal.setBackgroundColor(Color.RED);
    }

}
