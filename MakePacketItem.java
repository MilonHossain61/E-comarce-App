package com.example.mustak.recyclewithsearch;

public class MakePacketItem  {

    private String name;
    private String productfulldetails;
    private int inamge_id;

    private int product_price;

    public MakePacketItem(String name, int inamge_id, int product_price, String fulldetail) {
        this.name = name;
        this.inamge_id = inamge_id;
        this.product_price=product_price;
        this.productfulldetails=fulldetail;
    }

    public String getProductfulldetails() {
        return productfulldetails;
    }

    public void setProductfulldetails(String productfulldetails) {
        this.productfulldetails = productfulldetails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getProduct_price() {
        return product_price;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    public int getInamge_id() {
        return inamge_id;
    }

    public void setInamge_id(int inamge_id) {
        this.inamge_id = inamge_id;
    }
}
