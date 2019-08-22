package com.example.milonhossain.onlineshopping;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.milonhossain.onlineshopping.Model.Product;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Product> homeproductList = new ArrayList<>();
    ArrayList<Product> profileProductList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void readyProfileData(){

    }
    public void readyHomeProductData(){
        Product watch = new Product("Rolex",
                "rolex.com/content/dam/rolex-58/homepage/roller-collection/baselworld/roller-static/homepage_new_yacht-master_42_0001_1050x825.jpg",
                "bla bla bla bal abla ",12.00);
        Product watchq = new Product("Rolex",
                "rolex.com/content/dam/rolex-58/homepage/roller-collection/baselworld/roller-static/homepage_new_yacht-master_42_0001_1050x825.jpg",
                "bla bla bla bal abla ",12.00);

        homeproductList.add(watch);
        homeproductList.add(watchq);


    }
}
