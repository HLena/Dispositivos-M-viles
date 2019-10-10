package com.example.ciudades;


import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements OnItemSelectedListener{

    Spinner spinnerPaises, spinnerCiudades;
    TextView texto1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerPaises = (Spinner) findViewById(R.id.paises);
        spinnerCiudades = (Spinner) findViewById(R.id.ciudades);

        ArrayAdapter<CharSequence> adapter =ArrayAdapter.createFromResource(
                this,R.array.array_paises,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPaises.setAdapter(adapter);
        spinnerPaises.setOnItemSelectedListener(this);
        //String text = spinnerCiudades.getSelectedItem().toString();
        //texto1.setText(text);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        texto1 = (TextView) findViewById(R.id.texto);
        int[] pos = {R.array.Peru,R.array.Colombia,R.array.Francia};
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                pos[position],
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCiudades.setAdapter(adapter);
        //spinnerCiudades.setOnItemSelectedListener(this);
        String text = spinnerCiudades.getSelectedItem().toString();
        texto1.setText(text);

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


}
