package com.homework.weatherapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

 @BindView(R.id.etx_username)
    TextView etxUserName;

 @BindView(R.id.etx_password)
 TextView etxPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }

@OnClick(R.id.btn_login)
    public void logIn(){
       // if (etxUserName.getText().toString() == "admin" && etxPassword.getText().toString() == "1234"){
            Intent intent = new Intent(MainActivity.this, DashboardActivity.class);
            startActivity(intent);
            finish();
       // }
        //else{
          //  Toast.makeText(MainActivity.this, "fail", Toast.LENGTH_LONG).show();
        //}

}






}

