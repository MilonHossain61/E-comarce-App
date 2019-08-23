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
        Product M3band = new Product("Band M3","https://static-01.daraz.com.bd/p/47d726227604c332022cf74bd6103302.jpg",
                "Original Quality Band M3 Waterproof Smart Fitness Tracker -Black",300.50);
        Product EarPhone = new Product("Ear Phone","https://static-01.daraz.com.bd/p/8cb305648a9902737fd62b22ce375e5e.jpg",
                "original RM-510 remax in-ear touch-sensitive music telephone headset HD microphone for iphone, xiaomi and most smartphones",265.50);
        Product USB = new Product("USB","https://static-01.daraz.com.bd/p/933a959399b24a5aacb3905a49eb816d.jpg",
                "4 Port USB 2.0 Hub High Speed",65.50);
        Product walet = new Product("Walet","https://static-01.daraz.com.bd/original/f79c97cfc15a157fa6b0b114d0d7d0a9.jpg_200x200q80-product.jpg_.webp",
                "Full Leather",800.00);
        Product Speaker = new Product("Mini Speaker","https://static-01.daraz.com.bd/p/33de8169d4ab6a926992329d28bf84b6.jpg_200x200q80-product.jpg_.webp",
                "Original YX- X61 Bluetooth Mini Speaker -Black",440.50);
        Product GlassProctector = new Product("Glass Protector","https://static-01.daraz.com.bd/p/34ae679aacd36135a05388f085d08303.jpg_200x200q80-product.jpg_.webp",
                "Samsung Galaxy A20 - Original 9D Tempered Glass HD Screen Protector - Transparen",250.00);
        Product Shoe = new Product("Sneaker Shoe","https://static-01.daraz.com.bd/p/d925a947a488ee6ed3ee1e7285f662f2.jpg_200x200q80-product.jpg_.webp",
                "New Men’s Fashionable Fabrics Sneaker Shoes for Men",2100.00);
        Product Belt = new Product("Belt","https://static-01.daraz.com.bd/original/f352c4f5cbc783a40f9c4ee7d4bbee14.jpg_200x200q80-product.jpg_.webp",
                "Black Leather Formal Belt For Men",500.50);

        homeproductList.add(watch);
        homeproductList.add(M3band);
        homeproductList.add(EarPhone);
        homeproductList.add(USB);
        homeproductList.add(walet);
        homeproductList.add(Speaker);
        homeproductList.add(GlassProctector);
        homeproductList.add(Shoe);
        homeproductList.add(Belt);

    }
}
