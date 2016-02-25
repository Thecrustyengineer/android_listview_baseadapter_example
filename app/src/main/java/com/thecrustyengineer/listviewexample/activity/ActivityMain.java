package com.thecrustyengineer.listviewexample.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.thecrustyengineer.listviewexample.Object.Letter;
import com.thecrustyengineer.listviewexample.R;
import com.thecrustyengineer.listviewexample.adapter.BaseAdapterAlphabet;

import java.util.ArrayList;
import java.util.List;

public class ActivityMain extends AppCompatActivity {

    private ListView listView;

    private List<Letter> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = new ArrayList<>();
        list.add(new Letter("A", "Apple"));
        list.add(new Letter("B", "Ball"));
        list.add(new Letter("C", "Cat"));
        list.add(new Letter("D", "Dog"));
        list.add(new Letter("E", "Eye"));
        list.add(new Letter("F", "Fish"));
        list.add(new Letter("G", "Goat"));
        list.add(new Letter("H", "House"));
        list.add(new Letter("I", "Igloo"));

        listView = (ListView)findViewById(R.id.activity_main_listView_alphabet);
        listView.setAdapter(new BaseAdapterAlphabet(list, this));
    }

    @Override
    protected void onResume(){
        super.onResume();
    }

    @Override
    protected void onPause(){
        super.onPause();
    }
}
