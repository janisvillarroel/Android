package com.ejemplo.guiasession;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ServiceActivity extends Activity {
    private SessionManager session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
        TextView text= (TextView) findViewById(R.id.textView);
        session = new SessionManager(getApplicationContext());
        text.setText(session.getUserName());
    }
}
