package com.android.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class HelloworldActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("Hello world,hahahahaha!!!");
        //setContentView(R.layout.main);
        setContentView(tv);
        }
}
