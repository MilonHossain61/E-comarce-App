package com.example.mustak.recyclewithsearch;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.mustak.recyclewithsearch.MainActivity.chart_total;


public class ProductDetails extends AppCompatActivity {

    TextView productDetails,productFulldetails;
    ImageView imageview;
    FloatingActionButton chart,done;
    //int chart_total=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        productDetails=findViewById(R.id.productdetails);
        productFulldetails=findViewById(R.id.price);
        chart=findViewById(R.id.cart);
        done=findViewById(R.id.payment);
        imageview=findViewById(R.id.image);
        Intent intent=getIntent();
        final int i=intent.getIntExtra("value",00);

        imageview.setImageResource(MainActivity.imagearray[i]);
        productDetails.setText(MainActivity.arrayList.get(i).getName());
        productFulldetails.setText("Details   "+MainActivity.arrayList.get(i).getProductfulldetails());


        chart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               chart_total=chart_total+MainActivity.arrayList.get(i).getProduct_price();
                Toast.makeText(ProductDetails.this,"Added into chart",Toast.LENGTH_LONG).show();
                chart.setEnabled(false);



            }
        });

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("You should pay"+ chart_total);

            }
        });



    }
}
