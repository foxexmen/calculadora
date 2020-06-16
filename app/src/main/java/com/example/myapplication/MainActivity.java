package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public EditText pantalla;
    public double operador1, operador2, resu;
    public int operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pantalla=(EditText)findViewById(R.id.resultado);
    }

    public void bt1 (View v){
        String cap=pantalla.getText().toString();
        cap=cap+"1";
        pantalla.setText(cap);
    }
    public void bt2 (View v){
        String cap=pantalla.getText().toString();
        cap=cap+"2";
        pantalla.setText(cap);
    }
    public void bt3 (View v){
        String cap=pantalla.getText().toString();
        cap=cap+"3";
        pantalla.setText(cap);
    }
    public void bt4 (View v){
        String cap=pantalla.getText().toString();
        cap=cap+"4";
        pantalla.setText(cap);
    }
    public void bt5 (View v){
        String cap=pantalla.getText().toString();
        cap=cap+"5";
        pantalla.setText(cap);
    }
    public void bt6 (View v){
        String cap=pantalla.getText().toString();
        cap=cap+"6";
        pantalla.setText(cap);
    }
    public void bt7 (View v){
        String cap=pantalla.getText().toString();
        cap=cap+"7";
        pantalla.setText(cap);
    }
    public void bt8 (View v){
        String cap=pantalla.getText().toString();
        cap=cap+"8";
        pantalla.setText(cap);
    }
    public void bt9 (View v){
        String cap=pantalla.getText().toString();
        cap=cap+"9";
        pantalla.setText(cap);
    }
    public void bt0 (View v){
        String cap=pantalla.getText().toString();
        cap=cap+"0";
        pantalla.setText(cap);
    }
    public void btpunto (View v){
        String cap=pantalla.getText().toString();
        cap=cap+".";
        pantalla.setText(cap);
    }


    public void suma (View v){
        try{
            String aux1=pantalla.getText().toString();
            operador1=Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){}
        pantalla.setText("");
        operacion=1;
    }
    public void resta (View v){
        try{
            String aux1=pantalla.getText().toString();
            operador1=Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){}
        pantalla.setText("");
        operacion=2;
    }

    public void producto (View v){
        try{
            String aux1=pantalla.getText().toString();
            operador1=Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){}
        pantalla.setText("");
        operacion=3;
    }

    public void division (View v){
        try{
            String aux1=pantalla.getText().toString();
            operador1=Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){}
        pantalla.setText("");
        operacion=4;
    }

    public void sin (View v){
        try{
            String aux1=pantalla.getText().toString();
            operador1=Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){}
        pantalla.setText("Sin("+operador1+")");
        operacion=5;
    }

    public void cos (View v){
        try{
            String aux1=pantalla.getText().toString();
            operador1=Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){}
        pantalla.setText("Cos("+operador1+")");
        operacion=6;
    }

    public void tan (View v){
        try{
            String aux1=pantalla.getText().toString();
            operador1=Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){}
        pantalla.setText("Tan("+operador1+")");
        operacion=7;
    }

    public void igual (View v){
        try{
            String aux2=pantalla.getText().toString();
            operador2=Double.parseDouble(aux2);
        }catch(NumberFormatException nfe){}
        pantalla.setText("");

        if (operacion==1){
            resu=operador1+operador2;
        }else if (operacion==2){
            resu=operador1-operador2;
        }else if (operacion==3){
            resu=operador1*operador2;
        }else if (operacion==4){
            if(operador2==0){
                pantalla.setText("Error");

            }else{
                resu=operador1/operador2;
            }
        }else if(operacion==5){
            double rad=Math.toRadians(operador1);
            resu=(Math.sin(rad));
        }else if(operacion==6){
            double rad=Math.toRadians(operador1);
            resu=(Math.cos(rad));
        }else if(operacion==7){
            double rad=Math.toRadians(operador1);
            resu=(Math.tan(rad));
        }

        pantalla.setText(""+resu);
        operador1=resu;



    }
    public void clear (View v){
        pantalla.setText("");
        operador1=0.0;
        operador2=0.0;
        resu=0.0;

    }
    public void borrar (View v){
        if (!pantalla.getText().toString().equals("")){
            pantalla.setText(pantalla.getText().subSequence(0, pantalla.getText().length()-1)+"");
        }
    }

    public void off (View v){
        finish();
    }

}