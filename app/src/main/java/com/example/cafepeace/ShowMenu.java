package com.example.cafepeace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ShowMenu extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter coffeeAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Coffee> coffees;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_menu);

        this.coffees = new ArrayList<Coffee>();
        createCoffeeList();

        this.recyclerView = (RecyclerView) findViewById(R.id.coffee_recyclerview);
        this.recyclerView.setHasFixedSize(true);

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        this.recyclerView.addItemDecoration(itemDecoration);

        this.layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        this.recyclerView.setLayoutManager(layoutManager);

        this.coffeeAdapter = new CoffeeAdapter(coffees);
        this.recyclerView.setAdapter(coffeeAdapter);
    }

    private void createCoffeeList(){
        Coffee espresso_single = new Coffee("Espresso", "Single","20,-", R.drawable.espresso_coffee);
        coffees.add(espresso_single);

        Coffee espresso_double = new Coffee("Espresso", "Double","28,-", R.drawable.espresso_coffee);
        coffees.add(espresso_double);

        Coffee cappuccino = new Coffee("Cappuccino", "Double shots with steamed milk foam","48,-", R.drawable.cappuccino);
        coffees.add(cappuccino);

        Coffee cafeLatte = new Coffee("Cafe Latte", "Double shots with steamed milk","48,-", R.drawable.latte);
        coffees.add(cafeLatte);

        Coffee americano = new Coffee("Americano", "Single shot with water","36,-", R.drawable.americano);
        coffees.add(americano);
    }
}