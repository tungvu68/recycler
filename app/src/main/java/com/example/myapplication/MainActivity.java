package com.example.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("User1", R.drawable.image1));
        users.add(new User("User2", R.drawable.image2));
        users.add(new User("User3", R.drawable.image3));
        users.add(new User("User4", R.drawable.image3));
        users.add(new User("User5", R.drawable.image2));
        users.add(new User("User6", R.drawable.image1));
        users.add(new User("User7", R.drawable.image2));
        users.add(new User("User7", R.drawable.image2));
        users.add(new User("User7", R.drawable.image2));
        users.add(new User("User7", R.drawable.image2));
        users.add(new User("User7", R.drawable.image2));
        users.add(new User("User7", R.drawable.image2));
        users.add(new User("User7", R.drawable.image2));
        users.add(new User("User7", R.drawable.image2));
        users.add(new User("User7", R.drawable.image2));
        users.add(new User("User7", R.drawable.image2));
        users.add(new User("User7", R.drawable.image2));
        users.add(new User("User7", R.drawable.image2));
        users.add(new User("User7", R.drawable.image2));
        users.add(new User("User8", R.drawable.image3));
        users.add(new User("User9", R.drawable.image1));

        recyclerView = findViewById(R.id.recyclerView);
        MyAdapter myAdapter = new MyAdapter(users);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));

        //init recycler adapter reuse
//        ArrayList<Man> mans = new ArrayList<>();
//        mans.add(new Man("User1", R.drawable.image1));
//        mans.add(new Man("User1", R.drawable.image1));
//        mans.add(new Man("User1", R.drawable.image1));
//        mans.add(new Man("User1", R.drawable.image1));
//        mans.add(new Man("User1", R.drawable.image1));
//        mans.add(new Man("User1", R.drawable.image1));
//        mans.add(new Man("User1", R.drawable.image1));
//        mans.add(new Man("User1", R.drawable.image1));
//
//        ArrayList<Integer> pics = new ArrayList<>();
//        ArrayList<String> texts  = new ArrayList<>();
//
//
//
//        for(Man man: mans){
//            pics.add(man.getImageId());
//            texts.add(man.getName());
//        }
//
//        MyAdapterRecycler myAdapterRecycler = new MyAdapterRecycler(pics, texts);
//        recyclerView.setAdapter(myAdapterRecycler);
//        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
//
//


    }
}