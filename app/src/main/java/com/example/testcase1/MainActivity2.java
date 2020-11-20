package com.example.testcase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        SharedPreferences sharedPreferences = getSharedPreferences("IMAGEDATA", Context.MODE_PRIVATE);
        if(sharedPreferences.getInt("session",-1) == -1){
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putInt("IMAGE 1",R.drawable.ic_check_black);
            editor.putInt("IMAGE 2",R.drawable.ic_check_black);
            editor.putInt("IMAGE 3",R.drawable.ic_check_black);
            editor.putInt("IMAGE 4",R.drawable.ic_check_black);
            editor.putInt("IMAGE 5",R.drawable.ic_check_black);
            editor.commit();
            Toast.makeText(this, "GOIN TO NEXT ACTIVITY", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this,MainActivity.class));

        } else {
            startActivity(new Intent(this,MainActivity.class));

        }

    }
}