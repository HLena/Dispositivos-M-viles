package es.ua.jtech.daa.ciudades;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class CiudadesActivity extends Activity {
    
	Spinner ciudades, paises;
	TextView texto;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        /** TODO asigna los views a los objetos, una vez definidos en main.xml:
        paises = (Spinner)findViewById(R.id.paises);
        ciudades = (Spinner)findViewById(R.id.ciudades);
        texto = (TextView)findViewById(R.id.texto);
        */
        
        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(
                this, R.array.paises, android.R.layout.simple_spinner_item);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        paises.setAdapter(adaptador);
        
        /**
         * TODO crear oto adaptador a partir de R.array.ciudadesespana y ponérselo al objeto ciudades,
         * igual que se le ha asignado uno al objeto paises.
         */
        
        
        paises.setOnItemSelectedListener(new OnItemSelectedListener() {
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				int idarray = R.array.ciudadesespana;
				/**
				 * TODO Asignar a idarray uno de estos valores:
				 * R.array.ciudadesespana, R.array.ciudadesalemania, R.array.ciudadesfrancia
				 * según si arg2 vale 0, 1 ó 2
				 */

				
				ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(
		                CiudadesActivity.this, idarray, android.R.layout.simple_spinner_item);
		        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		        ciudades.setAdapter(adaptador);
				
			}

			public void onNothingSelected(AdapterView<?> arg0) {
			}         
        });
        
        
        /** De la misma manera que el anterior listener, crar uno para el objeto ciudades.
         *  en su método onItemSelected( ) deberá mostrar la ciudad en el campo de texto:
         *  
         *  texto.setText(ciudades.getSelectedItem().toString());
         *  
         */
        

    }
}