package com.example.projekt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdapterView.OnItemClickListener kliknietyElement = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String kategoria = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(MainActivity.this, kategoria, Toast.LENGTH_SHORT).show();

            }
        };
        ListView listViewKat=findViewById(R.id.ListViewKategoria);
        listViewKat.setOnItemClickListener(kliknietyElement);

        AdapterView.OnItemSelectedListener wybranyElement2=new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String kategoria=adapterView.getItemAtPosition(i).toString();
                Toast.makeText(MainActivity.this, kategoria, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        };
        Spinner spinner=findViewById(R.id.spinner2);
        spinner.setOnItemSelectedListener(wybranyElement2);


    }
}