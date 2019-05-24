package com.example.userssignup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

   private EditText name, email, address, sapID, phone;
  private   Button submit;
    private RadioGroup rg;

    private String mUserName;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.editName);
        email = findViewById(R.id.editEmail);
        address = findViewById(R.id.editAddress);
        sapID = findViewById(R.id.editSap);
        phone = findViewById(R.id.editText5);
        rg = findViewById(R.id.radioGroup);
        submit=findViewById(R.id.btnSubmit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                validateFields();


            }
        });


    }

    private void validateFields()
    {

        if(name.getText().toString().trim().length() ==0 )
        {
            name.requestFocus();
            name.setError("Enter Your Name !!");
        }
        else if(email.getText().toString().trim().length() ==0)
        {
            email.requestFocus();
            email.setError("Enter Your Email !!");


        }
        else if(sapID.getText().toString().trim().length() ==0)
        {
            sapID.requestFocus();
            sapID.setError("Enter Your sapID !!");


        }
        else if(phone.getText().toString().trim().length() ==0)
        {
            phone.requestFocus();
            phone.setError("Enter Your phone !!");


        }
        else if(address.getText().toString().trim().length() ==0)
        {
            address.requestFocus();
            address.setError("Enter Your address !!");


        }

        else {
            String txtName = name.getText().toString();
            String txtemail = email.getText().toString();
            String txtaddress = address.getText().toString();
            String txts = sapID.getText().toString();
            String txtphone = phone.getText().toString();
            int gen = rg.getCheckedRadioButtonId();
            String gender = "";
            if (gen == R.id.btnMale)
                gender = "Male";
            else if (gen == R.id.btnFemale)
                gender = "Female";
            Intent secondIntent = new Intent(MainActivity.this, Second.class);
            secondIntent.putExtra("name", txtName);
            secondIntent.putExtra("email", txtemail);
            secondIntent.putExtra("gender", gender);
            secondIntent.putExtra("sap", txts);
            secondIntent.putExtra("phone", txtphone);
            secondIntent.putExtra("address", txtaddress);
            startActivity(secondIntent);
        }






    }


}

