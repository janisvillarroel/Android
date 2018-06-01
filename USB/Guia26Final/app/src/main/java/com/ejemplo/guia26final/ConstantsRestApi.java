package com.ejemplo.guia26final;

public class ConstantsRestApi {
    //http://makeup-api.herokuapp.com/api/v1/products.json?brand=covergirl&product_type=lipstick
    public static final String VERSION = "/api/v1/";
    public static final String URL = "http://makeup-api.herokuapp.com";
    public static final String URL_BASE =  URL+VERSION;
   public static final String URL_BRAND = "products.json?brand=covergirl&product_type=lipstick";
//    public static final String URL_BOOK_1 = "books?jscmd=data&format=json&bibkeys=ISBN:";

    public static final String BOOK_TITLE = "title";
    public static final String BOOK_AUTHOR = "authors";
    public static final String BOOK_DATE = "publish_date";
    public static final String BOOK_PAGES = "number_of_pages";
}

