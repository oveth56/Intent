package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ActivityFragmentos extends AppCompatActivity {
    private TextView tv1;
    private ListView listView;
    private String continentes [] = {"America", "Centroamerica","Europa", "Africa"};
    private String paises [] = {"Argentina, Chile, Brazil, Colombia, Peru","Nicaragua, Honduras, Salvador, Guatemala, Costa Rica y Belice","España, Italia, Francia, Inglaterra","Angola, Argelia, Benin"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmentos);

        tv1 = (TextView)findViewById(R.id.tv1);
        listView = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_geekipedia, continentes);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tv1.setText("Los paises de " +listView.getItemAtPosition(i) + " son: " +paises[i] + " :)");
            }
        });
    }
    //Metdo Boton Anterior
    public void Anterior(View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
}