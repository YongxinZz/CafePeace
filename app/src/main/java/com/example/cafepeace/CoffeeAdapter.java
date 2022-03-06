package com.example.cafepeace;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CoffeeAdapter extends RecyclerView.Adapter<CoffeeAdapter.ViewHolder> {
    private List<Coffee> coffeeList;


    public CoffeeAdapter(List<Coffee> coffeeList){
        this.coffeeList = coffeeList;
    }

    @Override
    public CoffeeAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.coffee_row, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Coffee coffee = coffeeList.get(position);

        holder.name.setText(coffee.getName());
        holder.description.setText(coffee.getDescription());
        holder.price.setText(coffee.getPrice());
        holder.image.setImageResource(coffee.getImage());
    }

    @Override
    public int getItemCount() {
        return coffeeList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView name;
        public final TextView description;
        public final TextView price;
        public final ImageView image;

        public ViewHolder(final View itemView){
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.coffee_name);
            description = (TextView) itemView.findViewById(R.id.coffee_description);
            price = (TextView) itemView.findViewById(R.id.coffee_price);
            image = (ImageView) itemView.findViewById(R.id.coffee_image);
        }
    }
}
