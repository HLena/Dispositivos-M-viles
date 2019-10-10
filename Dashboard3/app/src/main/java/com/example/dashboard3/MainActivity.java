package com.example.dashboard3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,
        f1.OnFragmentInteractionListener,f2.OnFragmentInteractionListener,
        f3.OnFragmentInteractionListener,f4.OnFragmentInteractionListener,
        f5.OnFragmentInteractionListener{
    ImageButton btnfr1,btnfr2,btnfr3,btnfr4;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        f5 frag = new f5();
        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, frag).commit();
        //btnfr1 = (ImageButton)findViewById(R.id.imageButton1);
        //btnfr2 = (ImageButton)findViewById(R.id.imageButton2);
        //btnfr3 = (ImageButton)findViewById(R.id.imageButton3);
        //btnfr4 = (ImageButton)findViewById(R.id.imageButton4);
        //btnfr2.setOnClickListener(this);
        //btnfr1.setOnClickListener(this);
        //btnfr3.setOnClickListener(this);
        //btnfr4.setOnClickListener(this);
    }
    @Override public void onClick(View v) {
        /*switch (v.getId()){
            case R.id.imageButton1:
                f1 fragmento1 = new f1();
                FragmentTransaction transition = getSupportFragmentManager().beginTransaction();
                transition.replace(R.id.contenedor, fragmento1);
                transition.commit();
                break;
            case R.id.imageButton2:
                f2 fragmento2 = new f2();
                FragmentTransaction transition1 = getSupportFragmentManager().beginTransaction();
                transition1.replace(R.id.contenedor, fragmento2);
                transition1.commit();
                break;
            case R.id.imageButton3:
                f3 fragmento3 = new f3();
                FragmentTransaction transition3 = getSupportFragmentManager().beginTransaction();
                transition3.replace(R.id.contenedor, fragmento3);
                transition3.commit();
                break;
            case R.id.imageButton4:
                f4 fragmento4 = new f4();
                FragmentTransaction transition4 = getSupportFragmentManager().beginTransaction();
                transition4.replace(R.id.contenedor, fragmento4);
                transition4.commit();
                break;
        }*/
       }

    @Override
    public void onFragmentInteraction(Uri uri) { }
}
