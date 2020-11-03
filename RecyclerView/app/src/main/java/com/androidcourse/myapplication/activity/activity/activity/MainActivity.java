package com.androidcourse.myapplication.activity.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.androidcourse.myapplication.R;
import com.androidcourse.myapplication.activity.activity.adapter.Adapter;
import com.androidcourse.myapplication.activity.activity.model.Film;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Film> filmList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        filmCreator();

        Adapter adapter = new Adapter(filmList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(), LinearLayout.VERTICAL));
    }


    public void filmCreator(){
        Film film = new Film("Tarzan", "animation", "2001");
        filmList.add(film);

        film = new Film("Leon King", "animation", "1990");
        filmList.add(film);

        film = new Film("Toy Story", "animation", "1995");
        filmList.add(film);

        film = new Film("Kong Fu Panda", "animation", "2001");
        filmList.add(film);

        film = new Film("Kong Fu Panda 2", "animation", "2003");
        filmList.add(film);

        film = new Film("Tarzan", "animation", "2001");
        filmList.add(film);

        film = new Film("Leon King", "animation", "1990");
        filmList.add(film);

        film = new Film("Toy Story", "animation", "1995");
        filmList.add(film);

        film = new Film("Kong Fu Panda", "animation", "2001");
        filmList.add(film);

        film = new Film("Kong Fu Panda 2", "animation", "2003");
        filmList.add(film);


    }


}