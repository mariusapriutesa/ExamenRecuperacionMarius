package com.example.examenrecuperacionmarius;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private EditText et1_dias;
    private TextView pAdultos1,pNinios1,descuento1,total1;
    private RadioButton rb_si1;
    private RadioButton rb_no1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        et1_dias=(EditText) findViewById(R.id.et_dias);
        pNinios1=(TextView) findViewById(R.id.pNinios);
        pAdultos1=(TextView) findViewById(R.id.pAdultos);
        descuento1=(TextView) findViewById(R.id.descuento);
        total1=(TextView) findViewById(R.id.total);
        rb_si1 = (RadioButton) findViewById(R.id.rb_si);
        rb_no1 = (RadioButton) findViewById(R.id.rb_no);


       String totalAdultos = getIntent().getStringExtra("totalAdultos");//hemos cogido dato del a activity1
        pAdultos1.setText(totalAdultos);


        String totalNinios = getIntent().getStringExtra("totalNinios");//hemos cogido dato del a activity1
        pNinios1.setText(totalNinios);
    }

    public void Calcular(View view) {

 String et2_dias  =et1_dias.getText().toString();

if (et2_dias.isEmpty()){

    Toast.makeText(this,"Porfavor introduce una cantidad mayor que 0 para el campo dias",Toast.LENGTH_LONG).show();

}else if(Integer.parseInt(et2_dias)<1){

    Toast.makeText(this,"Porfavor introduce una cantidad mayor que 0 para el campo dias",Toast.LENGTH_LONG).show();


}else{
    int val1_int= Integer.parseInt(et2_dias);

    String et3_adultos = pAdultos1.getText().toString();
  String et3_ninios = pNinios1.getText().toString();


  int val2_int= Integer.parseInt(et3_adultos);
  int val3_int= Integer.parseInt(et3_ninios);

  double total = val1_int *(val2_int +val3_int);

  //String totalS= String.valueOf(total);



        if(rb_no1.isChecked()) {
            descuento1.setText("  sin descuento");
            total=total;
            String totalS= String.valueOf(total);
            total1.setText(totalS);
        }else{

            descuento1.setText("10%");
            total=total-(total*0.10);
           String totalS= String.valueOf(total);
            total1.setText(totalS);
        }
}




    }
}