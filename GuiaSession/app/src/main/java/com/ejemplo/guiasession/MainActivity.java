package com.ejemplo.guiasession;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    private SessionManager session;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goPage(View view) {
        session = new SessionManager(getApplicationContext());
        EditText edit = (EditText) findViewById(R.id.editText);
        session.saveUser(edit.getText().toString());
        System.out.println(session.getUserName());
        Intent i= new Intent(this,ServiceActivity.class);
        startActivity(i);
    }
}
