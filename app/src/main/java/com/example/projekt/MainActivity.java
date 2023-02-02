package com.example.projekt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

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

        ArrayList<String> planszowki = new ArrayList<>();
        planszowki.add("cyklady");
        planszowki.add("Satorini");
        planszowki.add("Szachy");
        planszowki.add("Uno");
        planszowki.add("Sonar");
        planszowki.add("Remik");


        ArrayAdapter<String> adapterPlanszowki= new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                planszowki
        );

        ListView listViewPlanszowki=findViewById(R.id.ListViewPlanszowki);
        listViewPlanszowki.setAdapter(adapterPlanszowki);

 listViewPlanszowki.setOnItemClickListener(new AdapterView.OnItemClickListener() {
     @Override
     public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
         planszowki.remove(i);
         adapterPlanszowki.notifyDataSetChanged();
     }
 });

 AdapterView.OnItemClickListener wpisano=new AdapterView.OnItemClickListener() {
     @Override
     public void onItemClick(AdapterView<?> parent, View view, int i, long id) {


     }
 };

 Button button=findViewById(R.id.buttonDodaj);
 button.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         EditText editText= findViewById(R.id.editTextPlanszowka);
         planszowki.add(editText.getText().toString());
         adapterPlanszowki.notifyDataSetChanged();
     }
 });

new planszowka("uno",2,4,"karciane",10,"trudne");





    }
}