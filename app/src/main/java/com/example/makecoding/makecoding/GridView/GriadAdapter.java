package com.example.makecoding.makecoding.GridView;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import com.example.makecoding.R;

import java.util.ArrayList;

public class GriadAdapter extends RecyclerView.Adapter<GriadAdapter.ViewHolder> {

    private ArrayList<Item> mValues;
    private Context mContext;


    public GriadAdapter(Context context, ArrayList<Item> values) {
        mValues = values;
        mContext = context;

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private Item item;

        public ViewHolder(View v) {
            super(v);
            imageView = (ImageView) v.findViewById(R.id.image);
        }

        public void setData(Item item) {
            this.item = item;
            imageView.setImageResource(item.getDrawable());
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.fragment_ce, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        viewHolder.setData(mValues.get(position));
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }
}