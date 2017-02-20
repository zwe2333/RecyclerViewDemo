package com.example.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private MyAdapter mMyAdapter;
    List<Pokemon> mPokemons=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        mRecyclerView= (RecyclerView) findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mMyAdapter=new MyAdapter(mPokemons);
        mRecyclerView.setAdapter(mMyAdapter);
    }

    private void initData() {
        Pokemon pokemon1=new Pokemon("pokemon",R.mipmap.pk1);
        mPokemons.add(pokemon1);
        Pokemon pokemon2=new Pokemon("pokemon",R.mipmap.pk2);
        mPokemons.add(pokemon2);
        Pokemon pokemon3=new Pokemon("pokemon",R.mipmap.pk3);
        mPokemons.add(pokemon3);
        Pokemon pokemon4=new Pokemon("pokemon",R.mipmap.pk4);
        mPokemons.add(pokemon4);
        Pokemon pokemon5=new Pokemon("pokemon",R.mipmap.pk5);
        mPokemons.add(pokemon5);
        Pokemon pokemon6=new Pokemon("pokemon",R.mipmap.pk6);
        mPokemons.add(pokemon6);
        Pokemon pokemon7=new Pokemon("pokemon",R.mipmap.pk7);
        mPokemons.add(pokemon7);
        Pokemon pokemon8=new Pokemon("pokemon",R.mipmap.pk8);
        mPokemons.add(pokemon8);
    }
}
