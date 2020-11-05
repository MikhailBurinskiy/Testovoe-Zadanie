package com.example.experement;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.about);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext()
                                ,MainActivity.class));
                        overridePendingTransition( 0, 0);
                        return true;
                    case R.id.classes:
                        startActivity(new Intent(getApplicationContext()
                                ,Classes.class));
                        overridePendingTransition( 0, 0);
                        return true;
                    case R.id.notification:
                        startActivity(new Intent(getApplicationContext()
                                ,Notifications.class));
                        overridePendingTransition( 0, 0);
                        return true;
                    case R.id.about:
                        return true;

                }
                return false;
            }
        });
    }
}
