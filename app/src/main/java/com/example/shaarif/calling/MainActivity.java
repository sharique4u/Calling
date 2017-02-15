package com.example.shaarif.calling;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private EditText t1;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnZero, btnDial, btnHash, btnStar, btnDel;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1= (EditText) findViewById(R.id.t1);
        btn1= (Button) findViewById(R.id.btn1);
        btn2= (Button) findViewById(R.id.btn2);
        btn3= (Button) findViewById(R.id.btn3);
        btn4= (Button) findViewById(R.id.btn4);
        btn5= (Button) findViewById(R.id.btn5);
        btn6= (Button) findViewById(R.id.btn6);
        btn7= (Button) findViewById(R.id.btn7);
        btn8= (Button) findViewById(R.id.btn8);
        btn9= (Button) findViewById(R.id.btn9);
        btnZero= (Button) findViewById(R.id.btnZero);
        btnDial = (Button) findViewById(R.id.btnDial);
        btnHash= (Button) findViewById(R.id.btnHash);
        btnStar = (Button) findViewById(R.id.btnStar);
        btnDel = (Button) findViewById(R.id.btnDel);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnZero.setOnClickListener(this);
        btnDial.setOnClickListener(this);
        btnHash.setOnClickListener(this);
        btnStar.setOnClickListener(this);
        btnDel.setOnClickListener(this);
    }




    private boolean checkCallPermission(){
        String permission = "android.permission.CALL_PHONE";
        int res = getApplicationContext().checkCallingOrSelfPermission(permission);
        return  (res == PackageManager.PERMISSION_GRANTED);
    }

    @Override
    public void onClick(View v)
    {
        if(v.getId()==R.id.btn1)
        {

            t1.setText(t1.getText().toString() + "1");
        }

        else if(v.getId()==R.id.btn2)
        {

            t1.setText(t1.getText().toString()+"2");

        }
        else if(v.getId()==R.id.btn3)
        {
            t1.setText(t1.getText().toString()+"3");

        }
        else if(v.getId()==R.id.btn4)
        {

            t1.setText(t1.getText().toString()+"4");

        }
        else if(v.getId()==R.id.btn5)
        {

            t1.setText(t1.getText().toString()+"5");

        }
        else if(v.getId()==R.id.btn6)
        {

            t1.setText(t1.getText().toString()+"6");

        }
        else if (v.getId()==R.id.btn7)
        {

            t1.setText(t1.getText().toString()+"7");

        }
        else if(v.getId()==R.id.btn8)
        {
            t1.setText(t1.getText().toString()+"8");

        }
        else if(v.getId()==R.id.btn9)
        {

            t1.setText(t1.getText().toString()+"9");

        }
        else if(v.getId()==R.id.btnZero)
        {

            t1.setText(t1.getText().toString()+"0");

        }
        else if(v.getId()==R.id.btnHash)
        {
            t1.setText(t1.getText().toString()+"#");

        }
        else if(v.getId()==R.id.btnStar)
        {
            t1.setText(t1.getText().toString()+"*");

        }
        else if(v.getId()==R.id.btnDial) {
            if (t1.getText().toString().isEmpty())
                Toast.makeText(getApplicationContext(), "Enter Some Digits:", Toast.LENGTH_LONG).show();
            else if (checkCallPermission())
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + t1.getText())));
        }
        else if(v.getId()==R.id.btnDel) {
            if (t1.getText().toString().length() >= 1) {
                String newScreen = t1.getText().toString().substring(0, t1.getText().toString().length() - 1);
                t1.setText(newScreen);
            }
        }

    }

}