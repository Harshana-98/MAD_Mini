package com.example.mad_mini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home_Page extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__page);

        btn=findViewById(R.id.login_btn_home);
    }
    @Override
    protected void onResume() {
        super.onResume();
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Home_Page.this,Custom_profile.class);
                startActivity(intent1);
            }
        });
    }
}