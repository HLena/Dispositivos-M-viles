package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.security.cert.TrustAnchor;

public class MainActivity extends AppCompatActivity {

    //getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

    Button button0,button1,button2,button3, button4,button5,button6,button7,
            button8,button9,buttonSum,buttonRest,buttonAC,buttonMult,buttonDiv,
            buttonEqual,buttonP,buttonDEL;

    EditText edt1;
    float val1, val2,val3;
    boolean mSum, mRest,mMult,mDiv;
    int limite = 15;
    boolean mP = false;
    boolean clean = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonSum = (Button) findViewById(R.id.buttonSum);
        buttonRest = (Button) findViewById(R.id.buttonRest);
        buttonMult = (Button) findViewById(R.id.buttonMult);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonAC = (Button) findViewById(R.id.buttonAC);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);
        buttonP = (Button) findViewById(R.id.buttonP);
        buttonDEL = (Button) findViewById(R.id.buttonDEL);

        edt1 = (EditText) findViewById(R.id.edt1);
        //edt1.setInputType(InputType.TYPE_CLASS_NUMBER);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                if(edt1.getText().length() < limite)
                    edt1.setText(edt1.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                if(edt1.getText().length() < limite) {
                    edt1.setText(edt1.getText() + "2");
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                if(edt1.getText().length() < limite)
                    edt1.setText(edt1.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                if(edt1.getText().length() < limite)
                    edt1.setText(edt1.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                if(edt1.getText().length() < limite)
                    edt1.setText(edt1.getText()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                if(edt1.getText().length() < limite)
                    edt1.setText(edt1.getText()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                if(edt1.getText().length() < limite)
                    edt1.setText(edt1.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                if(edt1.getText().length() < limite)
                    edt1.setText(edt1.getText()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                if(edt1.getText().length() < limite)
                    edt1.setText(edt1.getText()+"9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                if(edt1.getText().length() < limite)
                    edt1.setText(edt1.getText()+"0");
            }
        });

        buttonDEL.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View v){
                String text = edt1.getText().toString();
                String last = text.substring(text.length()-1,text.length());
                if(last.equals(".")) {
                    mP = false;
                }else if(last.equals("+")){
                    mSum = false;
                }else if(last.equals("-")){
                    mRest = false;
                }else if(last.equals("*")){
                    mMult = false;
                }else if(last.equals("/")){
                    mDiv = false;
                }
                Editable currentText = edt1.getText();
                currentText.delete(currentText.length() - 1,currentText.length());
                edt1.setText(currentText);
            }
        });

        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edt1.getText().length()>0) {
                    String text = edt1.getText().toString();
                    if (!text.contains("-") && !text.contains("*") && !text.contains("/")) {
                        String last = text.substring(text.length() - 1, text.length());
                        System.out.println("ultimo_caracter: " + last);
                        if (!last.equals("-") && !last.equals("*") && !last.equals("/") && !last.equals("+")) {
                            if (text.contains("+") == false && mSum == false) {
                                System.out.println("suma");
                                val1 = Float.parseFloat(edt1.getText() + "");
                                edt1.setText(edt1.getText() + "+");
                                mSum = true;
                            } else {
                                int index = text.indexOf("+") + 1;
                                val2 = Float.parseFloat(text.substring(index, text.length()));
                                val3 = val1 + val2;
                                edt1.setText(Float.toString(val3));
                                System.out.println(val3);
                                mSum = false;
                            }
                        }

                    }
                }
            }
        });

        buttonRest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edt1.getText().length()>0) {
                    String text = edt1.getText().toString();
                    if (!text.contains("+") && !text.contains("*") && !text.contains("/")) {
                        String last = text.substring(text.length() - 1, text.length());
                        if (!last.equals("+") && !last.equals("*") && !last.equals("/") && !last.equals("-")) {
                            System.out.println("ultimo_caracter: " + last);
                            if (mRest == true) {
                                if (val1 < 0) {
                                    System.out.println("valor negativo: " + val1);
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(text);
                                    sb.deleteCharAt(0);
                                    text = sb.toString();
                                }
                                System.out.println("operacion: " + val1);
                                int index = text.indexOf("-");
                                val2 = Float.parseFloat(text.substring(index + 1, text.length()));
                                System.out.println("val2: " + val2);
                                val3 = val1 - val2;
                                System.out.println("val3: " + val3);
                                edt1.setText(Float.toString(val3));
                                mRest = false;

                            } else {

                                val1 = Float.parseFloat(edt1.getText() + "");
                                System.out.println("val1: " + val1);
                                System.out.println("resta");
                                edt1.setText(edt1.getText() + "-");
                                mRest = true;
                            }
                        }
                    }
                }
            }
        });

        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edt1.getText().length()>0) {
                    String text = edt1.getText().toString();
                    if (!text.contains("-") && !text.contains("+") && !text.contains("/")) {
                        String last = text.substring(text.length() - 1, text.length());
                        if (!last.equals("+") && !last.equals("*") && !last.equals("/") && !last.equals("-")) {
                            System.out.println("ultimo_caracter: " + last);
                            if (text.contains("*") == false) {
                                System.out.println("multiplicacion");
                                val1 = Float.parseFloat(edt1.getText() + "");
                                edt1.setText(edt1.getText() + "*");
                                mMult = true;
                            } else {
                                int index = text.indexOf("*") + 1;
                                val2 = Float.parseFloat(text.substring(index, text.length()));
                                val3 = val1 * val2;
                                edt1.setText(Float.toString(val3));
                                mMult = false;
                                System.out.println(val3);
                            }
                        }
                    }
                }
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edt1.getText().length()>0) {
                    String text = edt1.getText().toString();
                    if (!text.contains("-") && !text.contains("*") && !text.contains("+")) {
                        String last = text.substring(text.length() - 1, text.length());
                        if (!last.equals("+") && !last.equals("*") && !last.equals("/") && !last.equals("-")) {
                            System.out.println("ultimo_caracter: " + last);
                            if (text.contains("/") == false) {
                                System.out.println("division");
                                val1 = Float.parseFloat(edt1.getText() + "");
                                edt1.setText(edt1.getText() + "/");
                                mDiv = true;
                            } else {
                                int index = text.indexOf("/") + 1;
                                val2 = Float.parseFloat(text.substring(index, text.length()));
                                if (val2 != 0) {
                                    val3 = val1 / val2;
                                    edt1.setText(Float.toString(val3));
                                    System.out.println(val3);
                                } else {
                                    System.out.println("No es posible dividir entre cero");
                                }
                                mDiv = false;
                            }
                        }
                    }
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(edt1.getText());
                String text = edt1.getText().toString();
                String last = text.substring(text.length()-1,text.length());
                if(!last.equals("+") && !last.equals("*") && !last.equals("-") && !last.equals("/")) {
                    if (edt1.getText().length() > 0) {
                        int index;
                        if (mSum == true) {
                            index = text.indexOf("+");
                            val2 = Float.parseFloat(text.substring(index + 1, text.length()));
                            edt1.setText(val1 + val2 + "");
                            mSum = false;
                        }

                        if (mRest == true) {
                            if (val1 < 0) {
                                //System.out.println("valor negativo: "+val1);
                                StringBuilder sb = new StringBuilder();
                                sb.append(text);
                                sb.deleteCharAt(0);
                                text = sb.toString();
                            }
                            //System.out.println("operacion: "+val1);
                            index = text.indexOf("-");
                            val2 = Float.parseFloat(text.substring(index + 1, text.length()));
                            //System.out.println("val2: "+val2);
                            //val3 = val1 - val2;
                            //System.out.println("val3: "+val3);
                            edt1.setText(val1 - val2 + "");
                            mRest = false;

                        }

                        if (mMult == true) {
                            index = text.indexOf("*");
                            val2 = Float.parseFloat(text.substring(index + 1, text.length()));
                            edt1.setText(val1 * val2 + "");
                            mMult = false;
                        }

                        if (mDiv == true) {
                            index = text.indexOf("/");
                            val2 = Float.parseFloat(text.substring(index + 1, text.length()));
                            if (val2 > 0)
                                edt1.setText(val1 / val2 + "");
                            else
                                System.out.println("No se puede dividir entre cero");

                            mDiv = false;
                        }
                    }
                }
            }
        });

        buttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mP = false;
                mMult = false;
                mSum = false;
                mDiv = false;
                mRest = false;
                edt1.setText("");
            }
        });

        buttonP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = edt1.getText().toString();
                String last = text.substring(text.length()-1,text.length());
                System.out.println("last is: "+last);
                if(!last.equals("+") && !last.equals("*") && !last.equals("-") && !last.equals("/")) {
                    if (mP == false) {
                        if (edt1.getText().length() == 0)
                            edt1.setText(edt1.getText() + "0.");
                        //else if(Character.isDigit(last.charAt(0))){
                          //  edt1.setText(edt1.getText() + ".");
                        //}
                        else {
                            edt1.setText(edt1.getText() + ".");
                        }
                        mP = true;
                    }
                }

            }
        });

    }
}
