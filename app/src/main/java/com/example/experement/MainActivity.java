package com.example.experement;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.home);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.home:
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
                        startActivity(new Intent(getApplicationContext()
                                ,About.class));
                        overridePendingTransition( 0, 0);
                        return true;

                }
                return false;
            }
        });
    }
}
