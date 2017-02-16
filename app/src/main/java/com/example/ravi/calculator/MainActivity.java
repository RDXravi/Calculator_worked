package com.example.ravi.calculator;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tf1;
    private TextView tf2;
    private TextView tf3;
    private TextView tf4;
    private TextView tf5;
    private TextView tf6;
    private TextView tf7;
    private TextView tf8;
    private TextView tf9;
    private TextView tf0;
    private TextView tfdot;
    private TextView tfequal;
    private TextView tfdel;
    private TextView tfdivide;
    private TextView tfplus;
    private TextView tfmultiply;
    private TextView tfminus;
    private TextView datafeed;
    private static ArrayList<String> array = new ArrayList<String>();
    private plus plusobj = new plus();
    private equals equalObj = new equals();



    public static String valueFromArray(int index){

        String value = array.get(index);
        return value;
         }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tf1 = (TextView)findViewById(R.id.one);
        tf2 = (TextView)findViewById(R.id.two);
        tf3 = (TextView)findViewById(R.id.three);
        tf4 = (TextView)findViewById(R.id.four);
        tf5 = (TextView)findViewById(R.id.five);
        tf6 = (TextView)findViewById(R.id.six);
        tf7 = (TextView)findViewById(R.id.seven);
        tf8 = (TextView)findViewById(R.id.eight);
        tf9 = (TextView)findViewById(R.id.nine);
        tf0 = (TextView)findViewById(R.id.zero);
        tfdot = (TextView)findViewById(R.id.dot);
        tfequal = (TextView)findViewById(R.id.equal);
        tfdel = (TextView)findViewById(R.id.del);
        tfdivide = (TextView)findViewById(R.id.divide);
        tfplus = (TextView)findViewById(R.id.plus);
        tfminus = (TextView)findViewById(R.id.minus);
        datafeed = (TextView)findViewById(R.id.displayfeeds);

        tf1.setFocusable(true);
        tf2.setFocusable(true);
        tf3.setFocusable(true);
        tf4.setFocusable(true);
        tf5.setFocusable(true);
        tf6.setFocusable(true);
        tf7.setFocusable(true);
        tf8.setFocusable(true);
        tf9.setFocusable(true);
        tf0.setFocusable(true);
        tfdot.setFocusable(true);
        tfequal.setFocusable(true);
        tfdel.setFocusable(true);
        tfminus.setFocusable(true);
        tfplus.setFocusable(true);
        tfdivide.requestFocus();



        tf1.setOnClickListener(this);
        tf2.setOnClickListener(this);
        tf3.setOnClickListener(this);
        tf4.setOnClickListener(this);
        tf5.setOnClickListener(this);
        tf6.setOnClickListener(this);
        tf7.setOnClickListener(this);
        tf8.setOnClickListener(this);
        tf9.setOnClickListener(this);
        tf0.setOnClickListener(this);
        tfdot.setOnClickListener(this);
        tfplus.setOnClickListener(this);
        tfminus.setOnClickListener(this);
        tfequal.setOnClickListener(equalObj);


    }

    public static int lengthOfArrayList(){
        return(array.size());
    }

    @Override
    public void onClick(View v) {
            TextView temp;

        temp = (TextView)v;



            if(temp == tf1){
                array.add("1");
            }
            else if(temp == tf2){
                array.add("2");
            }else if(temp == tf3){
                array.add("3");
            }else if(temp == tf4){
                array.add("4");
            }else if(temp == tf5){
                array.add("5");
            }else if(temp == tf6){
                array.add("6");
            }else if(temp == tf7) {
                array.add("7");
            }else if(temp == tf8){
            array.add("8");
            }else if(temp == tf9){
                array.add("9");
            }else if(temp == tf0){
                array.add("0");
            }else if(temp==tfdot){
                array.add(".");
            }else if(temp == tfplus){
                array.add("+");
            }else if(temp == tfminus){
                array.add("-");
            }

        Log.d("yash", String.valueOf(lengthOfArrayList()));


    }
}
