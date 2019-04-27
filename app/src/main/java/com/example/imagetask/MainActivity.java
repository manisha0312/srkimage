package com.example.imagetask;
import java.util.Random;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Random rand = new Random();
    public void clickFunction(View view){
        Log.i("click","pic working");
        // for dynamically update image
        if (rand.nextInt(2)==0){
        ImageView image = (ImageView) findViewById(R.id.srkImage);
        image.setImageResource(R.drawable.srk);}
        else{
        ImageView image1 = (ImageView) findViewById(R.id.srkImage);
        image1.setImageResource(R.drawable.srk_1_thu_1512910811);
    }}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
