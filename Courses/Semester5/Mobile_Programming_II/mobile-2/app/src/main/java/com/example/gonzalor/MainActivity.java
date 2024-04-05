package com.example.gonzalor;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            Fragment selectedFragment;

            int itemId = item.getItemId();


            if (itemId == R.id.action_icono1) {
                selectedFragment = new DivisasFragment();
            } else if (itemId == R.id.action_icono2) {
                selectedFragment = new Icono2Fragment();
            } else if (itemId == R.id.action_icono3) {
                selectedFragment = new Icono3Fragment();
            } else {
                return false;
            }

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, selectedFragment)
                    .commit();

            return true;
        });

        // Cargar el primer fragmento por defecto
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new DivisasFragment())
                .commit();
    }
}
