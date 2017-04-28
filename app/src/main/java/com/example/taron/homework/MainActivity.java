package com.example.taron.homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v){
        TextView john_foto = (TextView) findViewById(R.id.john_foto);
        TextView sarah_foto = (TextView) findViewById(R.id.sarah_foto);
        switch (v.getId()){
            case R.id.rel_lay1:
                if(john_foto.getVisibility() == View.VISIBLE)
                    john_foto.setVisibility(View.GONE);
                else
                    john_foto.setVisibility(View.VISIBLE);
                break;
            case R.id.rel_lay2:
                if(sarah_foto.getVisibility() == View.VISIBLE)
                    sarah_foto.setVisibility(View.GONE);
                else
                    sarah_foto.setVisibility(View.VISIBLE);
                break;

        }
    }


}
