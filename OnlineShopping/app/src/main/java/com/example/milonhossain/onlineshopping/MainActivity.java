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
        Product Mobile = new Product("iPhone7","https://images-na.ssl-images-amazon.com/images/I/31aH1WYy-IL._AC_US218_.jpg",
                "Apple iPhone 7, Verizon Unlocked, 32GB - Rose Gold - (Renewed)",36550.50);
        Product Mobile1= new Product("iPhone8","https://images-na.ssl-images-amazon.com/images/I/41SAPsD0vUL._AC_US218_.jpg",
                "Apple iPhone 8, Verizon Unlocked, 256GB - Gray - (Renewed)",46550.50);
        Product Mobile2 = new Product("Samsung 210","https://images-na.ssl-images-amazon.com/images/I/41lJ6yZtIbL._AC_US218_.jpg",
                "Samsung Galaxy S10+ Plus G975F GSM Unlocked Smartphone (Renewed) (Prism White, 128GB)",56800.00);
        Product Payel = new Product("Payel for Woman","https://static-01.daraz.com.bd/p/20661b7376e6aeed21514a994c208e43.jpg",
                "Golden Metal Anklet (Payel) for Women",1440.50);
        Product Shirt = new Product("T-Shirt","https://static-01.daraz.com.bd/p/160e300d9f341a0b6d48686b59cd1e4b.jpg",
                "Shadow White T-shirts",210.00);
        Product Camera = new Product("DSLR Camera","https://static-01.daraz.com.bd/original/277abb123b844229271e621011a68189.jpg",
                "5D Mark IV DSLR Camera with 24-105mm IS II USM Lens - 30.4MP - Black",210000.00);
        Product Suit = new Product("Men Suit","https://static-01.daraz.com.bd/original/b0464bb9cdd14b4beebc8ec9f597d794.jpg",
                "Royal Blue Polyester Complete Suite For Men",1500.50);

        homeproductList.add(watch);
        homeproductList.add(M3band);
        homeproductList.add(EarPhone);
        homeproductList.add(USB);
        homeproductList.add(walet);
        homeproductList.add(Speaker);
        homeproductList.add(GlassProctector);
        homeproductList.add(Shoe);
        homeproductList.add(Belt);
        homeproductList.add(Mobile);
        homeproductList.add(Mobile1);
        homeproductList.add(Mobile2);
        homeproductList.add(Payel);
        homeproductList.add(Shirt);
        homeproductList.add(Camera);
        homeproductList.add(Suit);


    }
}
