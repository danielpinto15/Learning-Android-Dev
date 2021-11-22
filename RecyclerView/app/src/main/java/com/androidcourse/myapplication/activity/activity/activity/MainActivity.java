package com.androidcourse.myapplication.activity.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.androidcourse.myapplication.R;
import com.androidcourse.myapplication.activity.activity.adapter.Adapter;
import com.androidcourse.myapplication.activity.activity.model.Film;
import com.androidcourse.myapplication.activity.activity.model.RecyclerItemClickListener;

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

        recyclerView.addOnItemTouchListener(
            new RecyclerItemClickListener(
                    getApplicationContext(),
                    recyclerView,
                    new RecyclerItemClickListener.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        }

                        @Override
                        public void onItemClick(View view, int position) {
                            Film movie = filmList.get(position);
                            Toast.makeText(
                                    getApplicationContext(),
                                    "Item Clicked: " + movie.getTitle(),
                                    Toast.LENGTH_SHORT
                            ).show();
                        }

                        @Override
                        public void onLongItemClick(View view, int position) {
                            Film movie = filmList.get(position);
                            Toast.makeText(
                                    getApplicationContext(),
                                    "Long Click: " + movie.getTitle(),
                                    Toast.LENGTH_SHORT
                            ).show();
                        }
                    }
            )
        );
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