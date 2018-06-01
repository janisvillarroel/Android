package com.ejemplo.guia16;

import android.app.Activity;
import android.os.Bundle;

import java.util.UUID;

import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends Activity {
    private Realm myRealm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.myRealm = Realm.getDefaultInstance();

        this.myRealm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                Usuario usuario = realm.createObject(Usuario.class, UUID.randomUUID().toString());
                usuario.setName("Roberto Carlos");
                usuario.setEdad("31");
            }
        });

        RealmResults<Usuario> list = this.myRealm.where(Usuario.class).findAll();
        for (Usuario u : list) {
            System.out.println(u.getId() + " Nombre" + u.getName());
        }

    }
}
