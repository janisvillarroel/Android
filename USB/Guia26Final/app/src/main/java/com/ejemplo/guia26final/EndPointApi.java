package com.ejemplo.guia26final;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface EndPointApi {
    //?jscmd=data&format=json&bibkeys=ISBN:
    @GET(ConstantsRestApi.URL_BRAND)
    Call<ProductResponse> getList(@Query("brand") String brand, @Query("product_type") String product_type);

}