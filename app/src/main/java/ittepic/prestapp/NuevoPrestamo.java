package ittepic.prestapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Date;

public class NuevoPrestamo extends AppCompatActivity {
    Spinner cmb;
    DatePicker fecDev;
    EditText art,per;
    ImageButton agregar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_prestamo);

        cmb=(Spinner)findViewById(R.id.spinner);
        cmb.setBackgroundColor(Color.LTGRAY);
        fecDev=(DatePicker)findViewById(R.id.datePicker);
        fecDev.setBackgroundColor(Color.LTGRAY);

        art=(EditText)findViewById(R.id.editText);
        per=(EditText)findViewById(R.id.editText2);

        agregar=(ImageButton)findViewById(R.id.imageButton2);

        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NuevoPrestamo.this,"-Dia-"+fecDev.getDayOfMonth()+"-Mes-"+fecDev.getMonth(),Toast.LENGTH_LONG).show();
            }
        });
        eliminaTexto();
    }


    public void eliminaTexto(){
        art.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                art.setText("");
                art.setTextColor(Color.WHITE);
            }
        });

        per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                per.setText("");
                per.setTextColor(Color.WHITE);
            }
        });
    }
}