package com.example.mustak.recyclewithsearch;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.RecyMyImageTextHandeler> {
    ArrayList<MakePacketItem> arrayList =new ArrayList<>();
    Context context;

    public RecycleViewAdapter(ArrayList<MakePacketItem> arrayList,Context context) {
        this.arrayList = arrayList;
        this.context=context;
    }

    @NonNull
    @Override
    public RecyMyImageTextHandeler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.recycleviewbinder,parent,false);


        return new RecyMyImageTextHandeler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyMyImageTextHandeler holder, final int position) {
        final int i=position;

        holder.recycleimageView.setImageResource(arrayList.get(position).getInamge_id());
        holder.recycletextView.setText(arrayList.get(position).getName());

      //  final Intent intent=new Intent();
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent1 =new Intent(context,ProductDetails.class);

                intent1.putExtra("value",i);
                context.startActivity(intent1);
            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    public static class RecyMyImageTextHandeler extends RecyclerView.ViewHolder
    {
        TextView recycletextView;
        ImageView recycleimageView;

        public RecyMyImageTextHandeler(View itemView) {
            super(itemView);
            recycleimageView=itemView.findViewById(R.id.recycle_image1);

            recycletextView=itemView.findViewById(R.id.recycle_text1);
        }
    }


    public void searchFielter(ArrayList<MakePacketItem> newlist)
    {
        arrayList=new ArrayList<>();
        arrayList.addAll(newlist);
        notifyDataSetChanged();

    }

}
