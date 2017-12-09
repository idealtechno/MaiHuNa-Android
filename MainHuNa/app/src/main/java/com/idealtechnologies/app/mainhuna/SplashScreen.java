package com.idealtechnologies.app.mainhuna;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by vadion on 12/9/17.
 */

public class SplashScreen extends AppCompatActivity {

    @Override
    public void onCreate(Bundle bundle){
    super.onCreate(bundle);
        Intent intent = new Intent(this,MainActivity.class);
        startActivity((intent));
        finish();
    }
}
