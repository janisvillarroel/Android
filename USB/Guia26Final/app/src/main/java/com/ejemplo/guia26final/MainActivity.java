package com.ejemplo.guia26final;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.gson.Gson;
import com.mikhaellopez.circularimageview.CircularImageView;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String brand = "covergirl";
        String productType = "lipstick";
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        EndPointApi endPointApi = restApiAdapter.connexionApi(restApiAdapter.buildGsonDeserializedBook(brand,productType));
        Call<ProductResponse> ProductResponseCall = endPointApi.getList(brand, productType);
        ProductResponseCall.enqueue(new Callback<ProductResponse>() {
            @Override
            public void onResponse(Call<ProductResponse> call, Response<ProductResponse> response) {
                ProductResponse prod = response.body();
                System.out.println( new Gson().toJson(prod));
            }

            @Override
            public void onFailure(Call<ProductResponse> call, Throwable t) {
                System.out.println("Ocurrio un error" + t.getLocalizedMessage());
            }
        });
        CircularImageView circularImageView = (CircularImageView)findViewById(R.id.circ);
        Picasso.with(this).load("http://i.imgur.com/DvpvklR.png").into(circularImageView);
    }

    public void change(View view) {
        CircularImageView circularImageView = (CircularImageView)findViewById(R.id.circ);
// Set Border
        circularImageView.setBorderColor(getResources().getColor(R.color.colorPrimary));
        circularImageView.setBorderWidth(10);
// Add Shadow with default param
        circularImageView.addShadow();
// or with custom param
        circularImageView.setShadowRadius(15);
        circularImageView.setShadowColor(Color.RED);
    }
}
