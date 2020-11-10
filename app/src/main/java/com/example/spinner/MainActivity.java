package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.icu.text.Transliterator;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinner_colores;
    TextView textoMostrar;
    ConstraintLayout cl;
    String color="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner_colores = (Spinner)findViewById(R.id.spinner);
        cl = (ConstraintLayout)findViewById(R.id.cl_back);
        textoMostrar = (TextView)findViewById(R.id.txt_View);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.colores_spinner, android.R.layout.simple_spinner_dropdown_item);
        spinner_colores.setAdapter(adapter);
        spinner_colores.setOnItemSelectedListener(this);

    }

    protected void onStart(){
        super.onStart();
        Toast.makeText(this,"onStart", Toast.LENGTH_LONG).show();
    }

    protected void onPause(){
        super.onPause();
        Toast.makeText(this,"onPause", Toast.LENGTH_LONG).show();
    }

    protected void onStop(){
        super.onStop();
        Toast.makeText(this,"onStop", Toast.LENGTH_LONG).show();
    }

    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this,"onDestroy", Toast.LENGTH_LONG).show();
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {

        if (adapterView.getItemAtPosition(position).toString().equals("Negro")){
            cl.setBackgroundColor(getResources().getColor(R.color.Negro));
            textoMostrar.setTextColor(getResources().getColor(R.color.Blanco));
            spinner_colores.setBackgroundResource(android.R.drawable.btn_dropdown);
        }else{
            textoMostrar.setTextColor(getResources().getColor(R.color.Negro));
            spinner_colores.setBackgroundResource(android.R.drawable.btn_dropdown);

            switch (adapterView.getItemAtPosition(position).toString()){
                case "Azul":
                    cl.setBackgroundColor(getResources().getColor(R.color.Azul));
                    break;
                case "Blanco":
                    cl.setBackgroundColor(getResources().getColor(R.color.Blanco));
                    break;
                case "Rojo":
                    cl.setBackgroundColor(getResources().getColor(R.color.Rojo));
                    break;
                case "Rosa":
                    cl.setBackgroundColor(getResources().getColor(R.color.Rosa));
                    break;
                case "Verde":
                    cl.setBackgroundColor(getResources().getColor(R.color.Verde));
                    break;
                case "Morado":
                    cl.setBackgroundColor(getResources().getColor(R.color.Morado));
                    break;
                case "Naranja":
                    cl.setBackgroundColor(getResources().getColor(R.color.Naranja));
                    break;
                case "Amarillo":
                    cl.setBackgroundColor(getResources().getColor(R.color.Amarillo));
                    break;
                case "Gris":
                    cl.setBackgroundColor(getResources().getColor(R.color.Gris));
                    break;
                case "Marron":
                    cl.setBackgroundColor(getResources().getColor(R.color.Marron));
                    break;
                default:
                    break;
            }
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
