package ejemplo.com.loginfinal;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

import ejemplo.com.loginfinal.ILoginPresenter;

public  class LoginPresenter implements ILoginPresenter{
    private Context context;
    private LoginView loginView;
    public static final int SIZE_BUCLE_CONEXION = 2;

    public LoginPresenter(Context context, LoginView loginView){
        this.context= context;
        this.loginView=loginView;
    }

    public boolean isConexion(Context ctx) {
        boolean bConectado = false;
        ConnectivityManager connec = (ConnectivityManager) ctx
                .getSystemService(ctx.CONNECTIVITY_SERVICE);
        NetworkInfo[] redes = connec.getAllNetworkInfo();
        for (int i = 0; i < SIZE_BUCLE_CONEXION; i++) {
            if (redes[i].getState() == NetworkInfo.State.CONNECTED) {
                bConectado = true;
            }
        }
        System.out.printf("sdsdslkdsl -----"+bConectado);
        return bConectado;
    }

    @Override
    public void validarCampos(String email, String password) {
        int cont = 0;
        if (email.isEmpty()) {
            this.loginView.setErrorEmail(this.context.getString(R.string.erroMail));
        }else if (password.isEmpty()) {
            this.loginView.setErrorPass(this.context.getString(R.string.errorPass));
        }else if (!this.isConexion(this.context)) {
            this.loginView.setErrorConexion();
        }

       /* if (cont == 1) {
            Intent i = new Intent(this, NextActivity.class);
            startActivity(i);
        }*/
    }
}
