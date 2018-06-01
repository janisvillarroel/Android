package com.ejemplo.guia13;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    public static final int SIZE_BUCLE_CONEXION = 2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean isConexion(Context ctx) {
        // getString(R.string.mensaje)
        boolean bConectado = false;
        ConnectivityManager connec = (ConnectivityManager) ctx
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        // No sólo wifi, también GPRS
        NetworkInfo[] redes = connec.getAllNetworkInfo();
        // este bucle debería no ser tan ñapa
        for (int i = 0; i < SIZE_BUCLE_CONEXION; i++) {
            // ¿Tenemos conexión? ponemos a true
            if (redes[i].getState() == NetworkInfo.State.CONNECTED) {
                bConectado = true;
            }
        }
        return bConectado;
    }

    public void showConexion(View view) {
        if (this.isConexion(view.getContext())) {
            Toast.makeText(view.getContext(), "Con conexion a internet", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(view.getContext(), "No se tiene conexion a internet", Toast.LENGTH_LONG).show();
        }
    }
}

