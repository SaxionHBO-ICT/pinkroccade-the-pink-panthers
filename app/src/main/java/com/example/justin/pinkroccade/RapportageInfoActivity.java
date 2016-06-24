package com.example.justin.pinkroccade;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Justin on 15-6-2016.
 */
public class RapportageInfoActivity extends AppCompatActivity {

    private ProgressBar habBar;
    private ProgressBar prodBar;
    private TextView tvProdNr;
    private TextView tvHabNr;
    private RapportageInfo rapportageInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rapportageinfo);

        tvProdNr = (TextView) findViewById(R.id.tvProdNr);
        tvHabNr = (TextView) findViewById(R.id.tvHabNaam);

        habBar = (ProgressBar) findViewById(R.id.pbHandenAanBed);
        prodBar = (ProgressBar) findViewById(R.id.pbProductivity);
        habBar.setMax(10);
        prodBar.setMax(100);

        // Getting the info for the bars and the numbers to show in the rapportage info activity
        rapportageInfo = new RapportageInfo(4, 70);
        habBar.setProgress(rapportageInfo.getHandenAanBed());
        prodBar.setProgress(rapportageInfo.getProductiviteit());

        tvProdNr.setText(String.valueOf(rapportageInfo.getProductiviteit()));
        tvHabNr.setText(String.valueOf(rapportageInfo.getHandenAanBed()));
    }
}
