package miempresa.com.bo.login;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = LoginActivity.class.getSimpleName();
    private SwipeRefreshLayout swipeRefreshLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView textEmail = (TextView) findViewById(R.id.editEmail);
        textEmail.setError("Es requerido");
        TextView textPass = (TextView) findViewById(R.id.editPassword);
        textPass.setError("Es requerido");
        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);
        checkBox.setError("Es requerido");
    }

    public void enviarDatos(View view) {

     /*   TextView textEmail = (TextView) findViewById(R.id.editEmail);
        TextView textPass = (TextView) findViewById(R.id.editPassword);
        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);
        int cont = 0;

        if (textEmail.getText() == null){
            Toast.makeText(getBaseContext(), "Ingrese el Email", Toast.LENGTH_LONG).show();
        }else if (textPass.getText() == null){
            Toast.makeText(getBaseContext(), "Ingrese el Password", Toast.LENGTH_LONG).show();
        }else if (checkBox.isActivated()){
            Toast.makeText(getBaseContext(), "Acepte el ingreso", Toast.LENGTH_LONG).show();
        }else {
            cont = 1;
        }


        if (cont == 1 ){

            swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
                @Override
                public void onRefresh() {
                    Log.i(TAG, "Ingreso a refresh");
                    swipeRefreshLayout.setRefreshing(false);
                }
            });


        }*/


    }
}
