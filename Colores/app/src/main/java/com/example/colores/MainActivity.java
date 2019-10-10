package com.example.colores;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup1,radioGroup2;
    private RadioButton radioButton;
    private CheckBox checkBox1;
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (TextView) findViewById(R.id.textView);
        radioGroup1 = (RadioGroup) findViewById(R.id.group1);
        radioGroup2 = (RadioGroup) findViewById(R.id.group2);
        //radioGroup1.clearCheck();
        //radioGroup2.clearCheck();
        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);

        //int g1 = radioGroup1.getCheckedRadioButtonId();
        //int g2 = radioGroup1.getCheckedRadioButtonId();

        /*switch(checkedId){
            case R.id.blackButton:
                Toast.makeText(getApplicationContext(),radioButton.getText(), Toast.LENGTH_SHORT);
                texto.setBackgroundColor(Color.BLACK);
                break;
            case R.id.greenButton:
                texto.setBackgroundColor(Color.GREEN);
                break;
            case R.id.redButton:
                texto.setBackgroundColor(Color.RED);
                break;
        }*/


        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                //String s = getResources().getResourceEntryName(id);
                //texto.setText(s);
                switch(checkedId){
                    case R.id.blackB:
                        texto.setBackgroundColor(Color.BLACK);
                        break;
                    case R.id.greenB:
                        texto.setBackgroundColor(Color.GREEN);
                        break;
                    case R.id.redB:
                        texto.setBackgroundColor(Color.RED);
                        break;
                }
            }
        });


        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch(checkedId){
                    case R.id.whiteT:
                        texto.setTextColor(Color.WHITE);
                        break;
                    case R.id.yellowT:
                        texto.setTextColor(Color.YELLOW);
                        break;
                    case R.id.blueT:
                        texto.setTextColor(Color.BLUE);
                        break;
                }
            }
        });


        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    texto.setText(R.string.text);
                }else {
                    texto.setText("");
                }
            }

        });

    }
}
