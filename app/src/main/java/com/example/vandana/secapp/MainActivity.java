package com.example.vandana.secapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bDot,bSub,bMul,bAdd,bClear,bEqual;
    TextView ans;
    double var1,var2;
    boolean Add, Sub, Mul;
    boolean dot=true;
    boolean v1=false;
    boolean v2=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button) findViewById(R.id.bn1);
        b2=(Button) findViewById(R.id.bn2);
        b3=(Button) findViewById(R.id.bn3);
        b4=(Button) findViewById(R.id.bn4);
        b5=(Button) findViewById(R.id.bn5);
        b6=(Button) findViewById(R.id.bn6);
        b7=(Button) findViewById(R.id.bn7);
        b8=(Button) findViewById(R.id.bn8);
        b9=(Button) findViewById(R.id.bn9);
        b0=(Button) findViewById(R.id.bnZero);
        bMul=(Button) findViewById(R.id.bnMul);
        bAdd=(Button) findViewById(R.id.bnAdd);
        bSub=(Button) findViewById(R.id.btnSub);
        bDot=(Button) findViewById(R.id.bnDot);
        bClear=(Button)findViewById(R.id.bnClear);
        bEqual=(Button)findViewById(R.id.bnEqual);

        ans=(TextView) findViewById(R.id.txtResult);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              ans.setText(ans.getText()+"1");
                v1=true;

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ans.setText(ans.getText()+"2");
                v1=true;
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ans.setText(ans.getText()+"3");
                v1=true;

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ans.setText(ans.getText()+"4");
                v1=true;
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ans.setText(ans.getText()+"5");
                v1=true;
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ans.setText(ans.getText()+"6");
                v1=true;
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ans.setText(ans.getText()+"7");
                v1=true;
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ans.setText(ans.getText()+"8");
                v1=true;
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ans.setText(ans.getText()+"9");
                v1=true;
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ans.setText(ans.getText()+"0");
                v1=true;

            }
        });


        bDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(dot){
                    ans.setText(ans.getText()+".");
                    dot=false;
                }


            }
        });


        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(ans.getText()+"");
                Add=true;
                ans.setText(" ");
                dot=true;
                v1=false;
                v2=true;


            }
        });

        bMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(ans.getText()+"");
                Mul=true;
                ans.setText(" ");
                dot=true;
                v1=false;
                v2=true;

            }
        });


        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(ans.getText()+"");
                Sub=true;
                ans.setText(" ");
                dot=true;
                v1=false;
                v2=true;

            }
        });


        bClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v1)
                {
                    ans.setText(null);
                }

            }
        });

        bEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                var2=Double.parseDouble(ans.getText()+"");
                if(Add==true) {
                    ans.setText(var1 + var2 + "");
                    Add = false;

                }

                if(Sub==true)
                {
                    ans.setText(var1-var2+"");
                    Sub=false;

                }

                if(Mul==true)
                {
                    ans.setText(var1*var2+"");
                    Mul=false;

                }

            }
        });




    }
}
