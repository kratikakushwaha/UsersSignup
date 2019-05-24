package com.example.userssignup;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Second extends AppCompatActivity {
TextView name,email,gender,sap,address,phone;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondlayout);
        Intent it= getIntent();
        name=findViewById(R.id.name);
       email=findViewById(R.id.email);
       gender=findViewById(R.id.gender);
       sap=findViewById(R.id.sapid);
       address=findViewById(R.id.address);
       phone=findViewById(R.id.phone);


        String name1=it.getStringExtra("name");
        name.setText(name1);

        String email1=it.getStringExtra("email");
        email.setText(email1);

        String gender1=it.getStringExtra("gender");
        gender.setText(gender1);

        String sap1=it.getStringExtra("sap");
        sap.setText(sap1);

        String address1=it.getStringExtra("address");
        address.setText(address1);

        String phone1=it.getStringExtra("phone");
        phone.setText(phone1);


    }
}
