package com.example.ravi.calculator;

import android.util.Log;
import android.view.View;

/**
 * Created by rAVI on 8/21/16.
 */
public class equals implements View.OnClickListener {

    private int variableOfEquals = 0;
    private int k = 1;
    private int Add_Phase_Variable;
    private int Subtract_Phase_Variable;
    private int Inter_operation_var;

    @Override
    public void onClick(View v) {
        int length = MainActivity.lengthOfArrayList();

        for(int i = (length-1);i>=0;i--){


            if(MainActivity.valueFromArray(i)== "+"){

                k = 1;
                i--;
                Add_Phase_Variable = variableOfEquals;
                Inter_operation_var += Add_Phase_Variable;
                variableOfEquals = 0;


            }
            if(MainActivity.valueFromArray(i)== "-"){

                k = 1;
                i--;
                Subtract_Phase_Variable = variableOfEquals;
                Inter_operation_var -= Subtract_Phase_Variable;
                variableOfEquals = 0;

            }


            variableOfEquals = variableOfEquals + (Integer.parseInt(MainActivity.valueFromArray(i)) * k);
                k = k * 10;

            if(i==0){
                Inter_operation_var += variableOfEquals;
            }


            Log.d("Yash @ ", String.valueOf(length));


        }

        Log.d("Ans is",""+Inter_operation_var);
    }
}
