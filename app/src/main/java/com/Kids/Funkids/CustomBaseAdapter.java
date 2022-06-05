package com.Kids.Funkids;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomBaseAdapter extends BaseAdapter {

    Context context;
     String animalList[];
     int animalImages[];
     LayoutInflater inflater;

     public CustomBaseAdapter(Context ctx,String animalList[],int animalImages[]){
         this.context=ctx;
         this.animalList=animalList;
         this.animalImages=animalImages;
         inflater=LayoutInflater.from(ctx);

     }
    @Override
    public int getCount() {
        return animalList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
         view=inflater.inflate(R.layout.activity_custom_list_view,null);
        TextView txtView=view.findViewById(R.id.ItemName);
        ImageView imgView=view.findViewById(R.id.ImageIcon);

        txtView.setText(animalList[position]);
        imgView.setImageResource(animalImages[position]);
        return view;
    }
}
