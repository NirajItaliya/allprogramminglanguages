package com.example.makecoding.makecoding.GridView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.makecoding.R;

import java.util.ArrayList;

public class GriadAdapter2 extends RecyclerView.Adapter<GriadAdapter2.ViewHolder> {

    private ArrayList<Item2> mValues2;
    private Context mContext2;


    public GriadAdapter2(Context context2, ArrayList<Item2> values2) {
        mValues2 = values2;
        mContext2 = context2;

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private Item2 item;

        public ViewHolder(View v) {
            super(v);
            imageView = (ImageView) v.findViewById(R.id.image1);
        }

        public void setData(Item2 item) {
            this.item = item;
            imageView.setImageResource(item.getDrawable2());
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext2).inflate(R.layout.coding, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        viewHolder.setData(mValues2.get(position));
    }

    @Override
    public int getItemCount() {
        return mValues2.size();
    }
}