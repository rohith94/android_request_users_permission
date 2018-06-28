package com.rohith.requestpermission;

import android.Manifest;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button permissionRequestAccess = findViewById(R.id.button);
        permissionRequestAccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] PERMISSIONS = {Manifest.permission.ACCESS_COARSE_LOCATION,Manifest.permission.READ_CONTACTS, Manifest.permission.GET_ACCOUNTS
                        , Manifest.permission.READ_SMS, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.RECEIVE_SMS,
                        Manifest.permission.GET_ACCOUNTS, Manifest.permission.READ_CALL_LOG, Manifest.permission.READ_PHONE_STATE};

                ActivityCompat.requestPermissions(MainActivity.this,
                        PERMISSIONS, 1);
            }
        });
    }
}
