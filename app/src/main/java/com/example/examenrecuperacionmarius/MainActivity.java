package com.example.examenrecuperacionmarius;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner1;
    private EditText et1_adultos ,et1_ninios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1_adultos=(EditText)findViewById(R.id.et_adultos);
        et1_ninios=(EditText)findViewById(R.id.et_ninios);
        spinner1=(Spinner) findViewById(R.id.sp1);
        String [] opciones = {"Temporada Media","Temporada Alta","Temporada Baja"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item_examen,opciones);
        spinner1.setAdapter(adapter);


    }

    public void Siguiente(View view) {
        String val1_string= et1_adultos.getText().toString();
        String val2_string= et1_ninios.getText().toString();

        if (val1_string.isEmpty() || val2_string.isEmpty()){
            Toast.makeText(this,"Porfavor introduce una cantidad entre 0 y 10 por cada uno de los campos y al menos 1 en uno de ellos",Toast.LENGTH_LONG).show();

        }

        else{
        int val1_int=Integer.parseInt(val1_string);//adultos
        int val2_int=Integer.parseInt(val2_string);//ninios



         if (val1_int==0 && val2_int==0){
            Toast.makeText(this,"Porfavor introduce una cantidad entre 0 y 10 por cada uno de los campos y al menos 1 en uno de ellos",Toast.LENGTH_LONG).show();

        }else if (val1_int>=0 && val1_int<=10 &&val2_int>=0 && val2_int<=10){
    String seleccion= spinner1.getSelectedItem().toString();
    if (seleccion.equals("Temporada Media")) {
        String precio = String.valueOf(25);
        int totalAdultos = Integer.parseInt(precio) * val1_int;
        int totalNinios = 10 * val2_int;
        String total1= String.valueOf(totalAdultos);
        String total2= String.valueOf(totalNinios);

        Intent i =new Intent(this,MainActivity2.class);
        i.putExtra("adultos",et1_adultos.getText().toString());//mandamos et01 al segundo activity
        i.putExtra("precio",precio.toString());//mandamos et01 al segundo activity
        i.putExtra("totalAdultos",total1.toString());//mandamos et01 al segundo activity
        i.putExtra("totalNinios",total2.toString());//mandamos et01 al segundo activity
        startActivity(i);

    }else if (seleccion.equals("Temporada Alta")) {
        String precio = String.valueOf(30);
        int totalAdultos = Integer.parseInt(precio) * val1_int;
        int totalNinios = 10 * val2_int;
        String total1= String.valueOf(totalAdultos);
        String total2= String.valueOf(totalNinios);

        Intent i =new Intent(this,MainActivity2.class);
        i.putExtra("adultos",et1_adultos.getText().toString());//mandamos et01 al segundo activity
        i.putExtra("precio",precio.toString());//mandamos et01 al segundo activity
        i.putExtra("totalAdultos",total1.toString());//mandamos et01 al segundo activity
        i.putExtra("totalNinios",total2.toString());//mandamos et01 al segundo activity
        startActivity(i);

    }else if (seleccion.equals("Temporada Baja")) {
        String precio = String.valueOf(20);
        int totalAdultos = Integer.parseInt(precio) * val1_int;
        int totalNinios = 10 * val2_int;
        String total1= String.valueOf(totalAdultos);
        String total2= String.valueOf(totalNinios);

        Intent i =new Intent(this,MainActivity2.class);
        i.putExtra("adultos",et1_adultos.getText().toString());//mandamos et01 al segundo activity
        i.putExtra("precio",precio.toString());//mandamos et01 al segundo activity
        i.putExtra("totalAdultos",total1.toString());//mandamos et01 al segundo activity
        i.putExtra("totalNinios",total2.toString());//mandamos et01 al segundo activity
        startActivity(i);

    }


}else {
    Toast.makeText(this,"Porfavor introduce una cantidad entre 0 y 10 por cada uno de los campos",Toast.LENGTH_LONG).show();


}}

    }
}