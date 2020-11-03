package com.androidcourse.myapplication.activity.activity.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.androidcourse.myapplication.R;
import com.androidcourse.myapplication.activity.activity.model.Film;

import org.w3c.dom.Text;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Film> filmList;

    public Adapter(List<Film> film) {
        this.filmList = film;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemList = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_list, parent, false);
        return new MyViewHolder(itemList);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Film film = filmList.get(position);
        holder.title.setText(film.getTitle());
        holder.year.setText(film.getYear());
        holder.gender.setText(film.getGender());
    }

    @Override
    public int getItemCount() {
        return filmList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView title;
        TextView year;
        TextView gender;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.textViewTitle);
            year = itemView.findViewById(R.id.textViewYear);
            gender = itemView.findViewById(R.id.textViewGender);
        }
    }

}
