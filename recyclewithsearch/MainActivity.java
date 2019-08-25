package com.example.mustak.recyclewithsearch;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    android.support.v7.widget.Toolbar toolbar;
    RecyclerView recyclerView;
    RecycleViewAdapter recycleViewAdapter;
    RecyclerView.LayoutManager layoutManager;
    public static int chart_total=0;
    public static ArrayList<MakePacketItem> arrayList=new ArrayList<>();
//    ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(1000,2000,3000,4000,5000,6000));
    int price[]={300,1800,300,3000,1500,230000,100000,1800,180000,1100,20000,1000,680,5000,500};





    static int []imagearray={R.drawable.sunglass,R.drawable.bag,R.drawable.belt,R.drawable.bluetoothheadphone,R.drawable.dm8headphone,R.drawable.gixxerbike,R.drawable.iphonex,R.drawable.leatherbelt,R.drawable.macbookpro,R.drawable.neviforcewatch,R.drawable.sneakershoe,
            R.drawable.trimmer,R.drawable.tshirt,R.drawable.usbfan,R.drawable.wallet};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolbarid);
        setSupportActionBar(toolbar);
        String []personName=getResources().getStringArray(R.array.pensoname);
        String []fulldetails=getResources().getStringArray(R.array.fulldetails);
        recyclerView=findViewById(R.id.recycleview);
        layoutManager =new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        int count=0;
        for (String Name:personName) {
            arrayList.add(new MakePacketItem(Name,imagearray[count],price[count],fulldetails[count]));
            count++;

        }
        recycleViewAdapter=new RecycleViewAdapter(arrayList,MainActivity.this);
       // recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recycleViewAdapter);
        System.out.println("Total isrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr"+chart_total);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        MenuItem menuItem= menu.findItem(R.id.search);

        SearchView searchView= (SearchView) menuItem.getActionView();
         searchView.setOnQueryTextListener((SearchView.OnQueryTextListener) this);




        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {

            case R.id.share:
                Toast.makeText(this,"share clicked",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String shareBody="https://www.youtube.com";//link
                String sharesubject="Your subject is here";//bani gulo akhane thakbe
                intent.putExtra(Intent.EXTRA_TEXT,shareBody);
                intent.putExtra(Intent.EXTRA_SUBJECT,sharesubject);
                startActivity(Intent.createChooser(intent,"share using"));

                break;

            case R.id.like:
                Toast.makeText(this,"settings  clicked",Toast.LENGTH_SHORT).show();
                Uri uri=Uri.parse("https://www.youtube.com/");
                Intent intent1=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent1);


                break;

            case R.id.search:
                Toast.makeText(this,"search  clicked",Toast.LENGTH_SHORT).show();
                // SearchView searchView= (SearchView) item.getActionView();
                //searchView.setOnQueryTextListener((SearchView.OnQueryTextListener) MainActivity.this);
                //SearchView searchView= (SearchView) item.getActionView();
               // searchView.setOnQueryTextListener((SearchView.OnQueryTextListener) this);





                break;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onQueryTextSubmit(String s) {
        return false;
    }



    @Override
    public boolean onQueryTextChange(String newtext) {
        newtext=newtext.toLowerCase();
        ArrayList<MakePacketItem> newlist=new ArrayList<>();
        for (MakePacketItem makepacketitem:arrayList
             ) {
            String name=makepacketitem.getName().toLowerCase();
            if (name.contains(newtext))
            {
                newlist.add(makepacketitem);
            }

        }
        recycleViewAdapter.searchFielter(newlist);

        return true;
    }



}
