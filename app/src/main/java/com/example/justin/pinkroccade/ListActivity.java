package com.example.justin.pinkroccade;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Justin on 18-5-2016.
 */

public class ListActivity extends AppCompatActivity {


    ArrayList<Rapportage> rapportages;
    DataProcessor res = new DataProcessor();

    Button btnUitloggen;
    Button btnRapportageInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        rapportages = res.getRapportagelist();

        btnRapportageInfo = (Button) findViewById(R.id.btnRapportage);
        btnUitloggen = (Button) findViewById(R.id.btnUitloggen);

        // Initializing adapter so it knows what layout to show for each rapportage.
        LoopLijstAdapter adapter = new LoopLijstAdapter(
                this, R.layout.rapportage, rapportages);
        ListView lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(adapter);

        // Making the button clickable and when clicked will send the user to the next activity.
        btnRapportageInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent btnRapportageIntent = new Intent(ListActivity.this, RapportageInfoActivity.class );
                 ListActivity.this.startActivity(btnRapportageIntent);
            }
        });

        // When the button is clicked, the activity simply finishes since there is no actual user data.
        btnUitloggen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }


}
