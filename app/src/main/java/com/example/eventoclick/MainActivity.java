package com.example.eventoclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView texto, texto2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = findViewById(R.id.eventoClick);
        texto2 = findViewById(R.id.eventoClick2);
        texto.setOnClickListener(this);
        texto2.setOnClickListener(this);
    }

    public void iniciarSecundarioActivity(View view) {
        Toast.makeText(this, "Evento click desde método onClick", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {

        int myId = v.getId();

        if( myId == R.id.eventoClick){
            Toast.makeText(this, "Evento Click método 1",
                    Toast.LENGTH_LONG).show();
        }else if(myId == R.id.eventoClick2){
            Toast.makeText(this, "Evento Click método 2",
                    Toast.LENGTH_LONG).show();
        }
    }
}