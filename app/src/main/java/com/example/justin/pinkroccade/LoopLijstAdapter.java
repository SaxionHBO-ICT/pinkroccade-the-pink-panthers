package com.example.justin.pinkroccade;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Wilco on 25-May-16.
 */
public class LoopLijstAdapter extends ArrayAdapter<Rapportage> {

    List<Rapportage> rapportages;

    /**
     * Constructor for the adapter which we use for the looplijst.
     * @param context
     * @param resource
     * @param objects
     */
    public LoopLijstAdapter(Context context, int resource, List<Rapportage> objects) {
        super(context, 0, objects);
        rapportages = objects;

    }

    /**
     * This method inflates the view and we also set Textviews accordingly to let the list know
     * which components to show.
     * @param position
     * @param convertView
     * @param parent
     * @return
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).
                    inflate(R.layout.rapportage, parent, false);
        }
        Rapportage rapport = rapportages.get(position);


        TextView rapportageNaam = (TextView) convertView.findViewById((R.id.tvRapportageNaam));
        rapportageNaam.setText(rapport.getRapportageNaam());
        TextView rapportageAdres = (TextView) convertView.findViewById((R.id.tvRapportageAdres));
        rapportageAdres.setText(rapport.getClientAdres());
        TextView rapportageTijd = (TextView) convertView.findViewById((R.id.tvRapportageTijd));
        rapportageTijd.setText(rapport.getTijd().toString());

        return convertView;
    }
}
