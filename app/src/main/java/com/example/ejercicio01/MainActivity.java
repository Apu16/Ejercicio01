package com.example.ejercicio01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView lbSaludar;
    private EditText lbNombre;
    private Button btnReset;
    private Button btnSaludar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lbNombre = findViewById(R.id.lbNombreMain);
        lbSaludar = findViewById(R.id.lbSaludarMain);
        btnReset = findViewById(R.id.btnResetMain);
        btnSaludar = findViewById(R.id.btnSaludarMain);

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lbNombre.setText("");
            }
        });
        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (lbNombre.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Tienes que poner algo en el nombre:(", Toast.LENGTH_SHORT).show();
                }else {
                    lbSaludar.setText("Hola " + lbNombre.getText() + ". buenos días!");
                    Toast.makeText(MainActivity.this, "Hola " + lbNombre.getText() + ". buenos días!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}