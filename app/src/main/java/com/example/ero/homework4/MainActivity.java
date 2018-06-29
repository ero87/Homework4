package com.example.ero.homework4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private final static int REQURSCODE = 11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button color = findViewById(R.id.color);
        final Button dizayn = findViewById(R.id.dizayn);
        final Button realtiv = findViewById(R.id.realtiv);
        final Button frame = findViewById(R.id.frame);
        final Button coordin = findViewById(R.id.cordin);


        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Main2ActivityColor.class);
                startActivityForResult(intent, REQURSCODE);
            }
        });

        realtiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Main2ActivityRealtive.class);
                startActivityForResult(intent, REQURSCODE);
            }
        });

        frame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Main2ActivityFrame.class);
                startActivityForResult(intent, REQURSCODE);
            }
        });

        dizayn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Main2ActivityEditorImage.class);
                startActivityForResult(intent, REQURSCODE);
            }
        });

        coordin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ScrollingActivity.class);
                startActivityForResult(intent, REQURSCODE);
            }
        });
    }
}
