package ejemplo.com.loginfinal;

import android.view.View;

public interface LoginView{

    public void setErrorEmail(String msg);
    public void setErrorPass(String msg);
    public void setErrorConexion();
    public void enviarDatos(View view);
}