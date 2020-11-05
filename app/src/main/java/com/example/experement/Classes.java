package com.example.experement;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Classes extends AppCompatActivity implements View.OnClickListener {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classes);

        button= findViewById(R.id.button);

        button.setOnClickListener(this);

        ScrollView scrollView = (ScrollView) findViewById(R.id.scroll);
        LinearLayout layout = (LinearLayout) findViewById(R.id.Liner_scrol1);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.classes);

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

    @Override
    public void onClick(View v) {
        Intent intent;
        if (v.getId() == R.id.button) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1604059360&rver=7.1.6819.0&wp=MBI_SSL&wreply=https%3A%2F%2Flw.skype.com%2Flogin%2Foauth%2Fproxy%3Fclient_id%3D572381%26redirect_uri%3Dhttps%253A%252F%252Fweb.skype.com%252FAuth%252FPostHandler%26state%3Ddb95bac0-388d-4964-a0e0-93c6ab246816&lc=1033&id=293290&mkt=ru-RU&psi=skype&lw=1&cobrandid=2befc4b5-19e3-46e8-8347-77317a16a5a5&client_flight=ReservedFlight33%2CReservedFlight67"));startActivity(intent);
        }
    }
}
