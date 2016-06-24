package com.example.justin.pinkroccade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
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

        Button btnLogIn = (Button) findViewById(R.id.btnLogIn);

        ImageView ivPinkLogo = (ImageView) findViewById(R.id.ivPinkLogo);
        ivPinkLogo.setImageResource(R.drawable.logo_healthcare);

        DataProcessor res = new DataProcessor();

        RapportageInfo rapportageInfo = new RapportageInfo(3, 70);

        // Adding dummmy data to the list to display later.
        res.addGebruiker(new Gebruiker("test", "wachtwoord"));
        res.addRapportage(new Rapportage("H. Kolkman", "De Brink 25", "08:20"));
        res.addRapportage(new Rapportage("W. Kanon", "Laarstraat 71", "08:45"));
        res.addRapportage(new Rapportage("F. Visser", "Schoolstraat 42", "09:25"));
        res.addRapportage(new Rapportage("H. de Bruin", "Lange Kade 4", "10:00"));
        res.addRapportage(new Rapportage("N. van de Berg", "Kerklaan 12", "11:20"));
        res.addRapportage(new Rapportage("F. Schrijver", "Snipperlingsdijk 1", "12:00"));
        res.addRapportage(new Rapportage("P. Witteberg", "Snipperlingsdijk 1" ," 12:40" ));
        res.addRapportage(new Rapportage("C. Balster", "Alphons Diepenbrocklaan 20" , " 13:10" ));

        gebruikers = res.getGebruikersList();

        // Makes sure there is a button.
        if (btnLogIn != null) {
            btnLogIn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Checking if the user can be found in the userlist and if so, and the text that
                    // was entered in the field equals the ones found in the list, the user is brought
                    // to the next activity.
                    for (Gebruiker gebruiker : gebruikers) {
                        if (etUsername.getText().toString().equalsIgnoreCase(gebruiker.getUsername())) {
                            if (etPassword.getText().toString().equalsIgnoreCase(gebruiker.getPassword())) {
                                Intent myIntent = new Intent(MainActivity.this, ListActivity.class);
                                MainActivity.this.startActivity(myIntent);
                            }
                            // Show the user their log-in data was not correct.
                            else Toast.makeText(MainActivity.this, "Incorrecte inloggegevens", Toast.LENGTH_SHORT).show();
                        } else Toast.makeText(MainActivity.this, "Incorrecte inloggegevens", Toast.LENGTH_SHORT).show();
                    }

                }
            });
        }


    }


}
