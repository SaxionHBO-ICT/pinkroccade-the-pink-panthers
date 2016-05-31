package com.example.justin.pinkroccade;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Justin on 18-5-2016.
 */

public class ListActivity extends AppCompatActivity {


    ArrayList<Rapportage> rapportages;
    DataProcessor res = new DataProcessor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        rapportages = res.getRapportagelist();

        LoopLijstAdapter adapter = new LoopLijstAdapter(
                this, R.layout.rapportage, rapportages);
        ListView lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(adapter);


    }


}
