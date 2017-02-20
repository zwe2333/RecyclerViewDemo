package com.example.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Asus on 2017/2/20.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    List<Pokemon> mPokemons;
    public MyAdapter(List<Pokemon> pokemons){
        mPokemons=pokemons;
    }
    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView mImageView;
        TextView mTextView;
        public ViewHolder(View itemView) {
            super(itemView);
            mImageView= (ImageView) itemView.findViewById(R.id.head);
            mTextView= (TextView) itemView.findViewById(R.id.content);
        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Pokemon pokemon=mPokemons.get(position);
        holder.mImageView.setImageResource(pokemon.id);
        holder.mTextView.setText(pokemon.name);
    }

    @Override
    public int getItemCount() {
        return mPokemons.size();
    }
}
