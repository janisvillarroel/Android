package com.ejemplo.guia26final;

public class ProductResponse {
    private String brand;
    private String name;
    private int id;
    private String price;
    private String productType;

    public ProductResponse(String brand, String name, int id,String price,String productType) {
        this.setBrand(brand);
        this.setName(name);
        this.setId(id);
        this.setPrice(price);
        this.setProductType(productType);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
}
