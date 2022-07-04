package com.example.bajuonline;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder> {

   private ArrayList<ItemModel> dataitem;


   public class ViewHolder extends RecyclerView.ViewHolder {

       TextView TextHead;
       TextView TextSubhead;
       ImageView imageicon;


       public ViewHolder(@NonNull View itemView) {
           super(itemView);

           TextHead = itemView.findViewById(R.id.tv_texttitle);
           TextSubhead = itemView.findViewById(R.id.tv_textsubtitle);
           imageicon = itemView.findViewById(R.id.iv_imagelist);
       }
   }

   AdapterRecyclerView(ArrayList<ItemModel> dataItem){
       this.dataitem = dataItem;
   }
    @NonNull
    @Override
    public AdapterRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecyclerView.ViewHolder holder, int position) {

       TextView TextHead = holder.TextHead;
       TextView TextSubhead = holder.TextSubhead;
       ImageView imageicon = holder.imageicon;

       TextHead.setText(dataitem.get(position).getName());
       TextSubhead.setText(dataitem.get(position).getTyppe());
       imageicon.setImageResource(dataitem.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return dataitem.size();
    }

}
