package com.example.justin.pinkroccade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private EditText etUsername;
    private EditText etPassword;
    private Button btnLogIn;
    private ArrayList<Gebruiker> gebruikers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final Button btnLogIn = (Button) findViewById(R.id.btnLogIn);
        DataProcessor res = new DataProcessor();

        res.addGebruiker(new Gebruiker("test", "wachtwoord"));
        res.addRapportage(new Rapportage("H. Kolkman1", "De Brink 25", new Date()));
        res.addRapportage(new Rapportage("H. Kolkman2", "De Brink 26", new Date()));
        res.addRapportage(new Rapportage("H. Kolkman3", "De Brink 27", new Date()));
        res.addRapportage(new Rapportage("H. Kolkman4", "De Brink 28", new Date()));
        res.addRapportage(new Rapportage("H. Kolkman5", "De Brink 29", new Date()));
        res.addRapportage(new Rapportage("H. Kolkman6", "De Brink 30", new Date()));

        gebruikers = res.getGebruikerslist();

        if (btnLogIn != null) {
            btnLogIn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    System.out.println("hallo");
                    for (Gebruiker gebruiker : gebruikers) {
                        if (etUsername.getText().toString().equalsIgnoreCase(gebruiker.getUsername())) {
                            if (etPassword.getText().toString().equalsIgnoreCase(gebruiker.getPassword())) {
                                Intent myIntent = new Intent(MainActivity.this, ListActivity.class);
                                MainActivity.this.startActivity(myIntent);
                            }
                        } else Toast.makeText(MainActivity.this, "Incorrecte inloggegevens", Toast.LENGTH_SHORT).show();
                    }

                }
            });
        }


    }


}
