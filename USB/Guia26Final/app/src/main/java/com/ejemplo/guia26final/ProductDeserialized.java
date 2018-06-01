package com.ejemplo.guia26final;

import java.lang.reflect.Type;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import org.json.JSONObject;

import java.lang.reflect.Type;

public class ProductDeserialized implements JsonDeserializer<ProductResponse> {

    private String brand;
    private String productType;

    public ProductDeserialized(String brand,String productType) {
        this.brand = brand;
        this.productType= productType;
    }

    @Override
    public ProductResponse deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonArray().get(0).getAsJsonObject();
        System.out.println(new Gson().toJson(jsonObject));
        int id=jsonObject.get("id").getAsInt();
        String name=jsonObject.get("name").getAsString();
        String productType=jsonObject.get("product_type").getAsString();
        String price=jsonObject.get("price").getAsString();;
        ProductResponse resp = new ProductResponse(brand, name, id,price,productType);
        return resp;

    }
}