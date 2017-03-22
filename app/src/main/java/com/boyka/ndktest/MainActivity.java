package com.boyka.ndktest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textShow= (TextView) findViewById(R.id.textShow);
        findViewById(R.id.btnRun).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textShow.setText(MyNative.helloJNI());
            }
        });
    }

}
