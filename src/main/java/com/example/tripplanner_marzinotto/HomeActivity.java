package com.example.tripplanner_marzinotto;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.app.Fragment;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity {
    //dichiarazione attributi
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    //private Toolbar toolbar;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //inizializzazione
        drawerLayout = findViewById(R.id.DrawerLayout);
        navigationView = findViewById(R.id.NavigationView);


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                //switch per le selezioni da navigation view
                switch (item.getItemId()) {
                    case R.id.mappa:
                        Toast.makeText(HomeActivity.this, "Click mappe", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.meteo:
                        Toast.makeText(HomeActivity.this, "Click meteo", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.cosaFare:
                        Toast.makeText(HomeActivity.this, "Click cosa fare", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(HomeActivity.this, CosaFareFragment.class)); //indirizza all'activity
                        break;
                    case R.id.impostazioni:
                        Toast.makeText(HomeActivity.this, "Click impostazioni", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.logout:
                        Toast.makeText(HomeActivity.this, "Click logout", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(HomeActivity.this, MainActivity.class)); //torna al login
                        break;
                }
                return true;
            }
        });

    }



}
