/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package y.doghri.medecins;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;
import model.Medecin;

/**
 *
 * @author ydoghri
 */
public class MedAdapter extends BaseAdapter {

    private List<Medecin> lesMeds;
    private Context c;

    MedAdapter(List data, Context c) {
        lesMeds = data;
        this.c = c;
    }
    public int getCount() {
        return lesMeds.size();
    }
    public Object getItem(int i) {
        return lesMeds.get(i);
    }
    public long getItemId(int i) {
        return i;
    }
    public View getView(int i, View v, ViewGroup vg) {
        //création de la vue en analysant le xml ligneChev
        LayoutInflater vi = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = vi.inflate(R.layout.lignemed, null);
        TextView nom = (TextView) v.findViewById(R.id.nom);
        TextView prenom = (TextView) v.findViewById(R.id.nomProprio);
        TextView num = (TextView) v.findViewById(R.id.race);
        Medecin leMed = lesMeds.get(i);
        nom.setText(leMed.getNom());
        prenom.setText(leMed.getPrenom());
        num.setText(leMed.getNum());
        return v;
    }
}