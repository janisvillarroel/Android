package ejemplo.com.loginfinal;

import android.Manifest;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements LoginView   {

    private static final String TAG = MainActivity.class.getSimpleName();

    private TextView textEmail;
    private TextView textPass;
    private CheckBox checkBox;
    private ILoginPresenter iLoginPresenter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.iLoginPresenter = new LoginPresenter(getApplicationContext(),this);
        textEmail = (TextView) findViewById(R.id.editEmail);
        textPass = (TextView) findViewById(R.id.editPassword);
        checkBox = (CheckBox) findViewById(R.id.checkBox);
    }

   public void enviarDatos(View view) {
       this.iLoginPresenter.validarCampos(this.textEmail.getText().toString(),this.textPass.getText().toString());
   }

    @Override
    public void setErrorEmail(String msg) {
        textEmail.setError(msg);
    }

    @Override
    public void setErrorPass(String msg) {
        textPass.setError(msg);
    }

    @Override
    public void setErrorConexion() {
        checkBox.setError("Error conexion");
    }
}