package com.example.pariwisatainfoapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import android.widget.Filter;
import android.widget.Filterable;


class Holder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView location, desc;

    public Holder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageview);
        location = itemView.findViewById(R.id.location);
        desc = itemView.findViewById(R.id.desc);
    }
}

public class Adapter extends RecyclerView.Adapter<Holder> implements Filterable {
    private Context context;
    private ArrayList<ItemList> listItem;
    private ArrayList<ItemList> listItemFull;

    public Adapter(ArrayList<ItemList> listItem, Context context) {
        this.listItem = listItem;
        this.listItemFull = new ArrayList<>(listItem); // Simpan salinan asli data
        this.context = context;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_list, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        ItemList item = listItem.get(position);
        holder.imageView.setImageResource(item.getImageview());
        holder.location.setText(item.getLocation());
        holder.desc.setText(item.getDesc());

        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(context, Detail.class);
            intent.putExtra("image", item.getImageview());
            intent.putExtra("title", item.getLocation());
            intent.putExtra("subtitle", item.getDesc());
            intent.putExtra("desc", item.getDetail());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return listItem.size();
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                ArrayList<ItemList> filteredList = new ArrayList<>();

                if (constraint == null || constraint.length() == 0) {
                    filteredList.addAll(listItemFull); // Tampilkan semua data jika tidak ada filter
                } else {
                    String filterPattern = constraint.toString().toLowerCase().trim();

                    for (ItemList item : listItemFull) {
                        // Filter berdasarkan nama lokasi atau deskripsi
                        if (item.getLocation().toLowerCase().contains(filterPattern) ||
                                item.getDesc().toLowerCase().contains(filterPattern)) {
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
                listItem.clear();
                listItem.addAll((ArrayList<ItemList>) results.values);
                notifyDataSetChanged(); // Perbarui tampilan
            }
        };
    }
}
