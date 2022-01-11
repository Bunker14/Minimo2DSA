package com.example.minim2dsa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.minim2dsa.API.Repos;
import com.example.minim2dsa.API.User;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder> {

    private List<Repos> repos;
    private LayoutInflater mInflater;
    private Context context;

    public ListAdapter(List<Repos> reposList, Context context) {
        this.repos = reposList;
        this.mInflater = LayoutInflater.from((Context) context);
        this.context = (Context) context;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = mInflater.inflate(R.layout.activity_users_list, null);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.bindData(repos.get(position));
    }

    @Override
    public int getItemCount() {
        return repos.size();
    }

    public void setItems(List<Repos> items){
        repos=items;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        //ImageView image;
        TextView userepos;

        MyViewHolder(View itemView){
            super(itemView);
            //image=itemView.findViewById(R.id.iconImagenView);
            userepos=itemView.findViewById(R.id.NameTextView);
        }

        void bindData(final Repos repos){
            userepos.setText(repos.getName());
            //Picasso.get().load(user.getAvatar_url()).into(image);
        }

    }
}
