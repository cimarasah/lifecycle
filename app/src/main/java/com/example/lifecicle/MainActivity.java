package com.example.lifecicle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "App Criado", Toast.LENGTH_LONG).show();;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "App Começado", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "App Reiniciado", Toast.LENGTH_SHORT).show();;

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "App Resumido", Toast.LENGTH_SHORT).show();;

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "App Pausado", Toast.LENGTH_SHORT).show();;

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "App Parado", Toast.LENGTH_SHORT).show();;

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "App Destruido", Toast.LENGTH_SHORT).show();;

    }
}
