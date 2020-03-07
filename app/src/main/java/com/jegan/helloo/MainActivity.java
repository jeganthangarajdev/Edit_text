package com.jegan.helloo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
     editText e1;
     button b1;
     textView4 t1;
     int i;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(editText)FindViewById(R.Id.editNum);
        b1=(button)FindViewById(R.Id.buttonclk);
        t1=(Textview)FindViewById(R.Id.txt successfully);
        b1=setonClickListener(newView.OnClickListener());
        {
            @override
            public void onclick()
            {
                i=e1.getText().toInt();
                t1.setText("Successfully+i");
            }

        }
    }
}
