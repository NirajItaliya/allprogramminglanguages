package com.example.makecoding.makecoding.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.makecoding.R;

import java.util.ArrayList;
import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> implements Filterable {
    private ArrayList<HomeDataModel> studentDataList;
    private List<HomeDataModel> recyclerDataListall;

    public HomeAdapter(ArrayList<HomeDataModel> studentDataList) {
        this.studentDataList = studentDataList;
        recyclerDataListall = new ArrayList<>(studentDataList);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.home_list_row, viewGroup, false);
        return new MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        HomeDataModel data = (HomeDataModel) studentDataList.get(position);
        holder.name.setText(data.getName());

    }

    @Override
    public int getItemCount() {
        return studentDataList.size();
    }

    @Override
    public Filter getFilter() {
        return exampleFilter;
    }
    private Filter exampleFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<HomeDataModel> filteredList = new ArrayList<>();
            if (constraint == null || constraint.length() == 0) {
                filteredList.addAll(recyclerDataListall);
            } else {
                String filterPattern = constraint.toString().toLowerCase().trim();
                for (HomeDataModel item : recyclerDataListall) {
                    if (item.getName().toLowerCase().contains(filterPattern)) {
                        filteredList.add(item);
                    }
                }
            }
            FilterResults results = new FilterResults();
            results.values = filteredList;
            return results;
        }
        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            studentDataList.clear();
            studentDataList.addAll((List) results.values);
            notifyDataSetChanged();
        }
    };
    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        ImageView age;

        public MyViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
        }
    }
}
