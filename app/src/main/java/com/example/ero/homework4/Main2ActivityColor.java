package com.example.ero.homework4;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class Main2ActivityColor extends AppCompatActivity {

    private int red, blue, green;
    private LinearLayout back1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_color);

        back1 = findViewById(R.id.back1);
        final SeekBar seekBarRed = findViewById(R.id.red);
        final SeekBar seekBarBlue = findViewById(R.id.blue);
        final SeekBar seekBarGreen = findViewById(R.id.green);
        final TextView textView1 = findViewById(R.id.text1);
        final TextView textView2 = findViewById(R.id.text2);
        final TextView textView3 = findViewById(R.id.text3);

        seekBarRed.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textView1.setText(i + "");
                red = i;
                duSamtingColor();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBarBlue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textView2.setText(i + "");
                blue = i;
                duSamtingColor();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBarGreen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textView3.setText(i + "");
                green = i;
                duSamtingColor();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    private void duSamtingColor() {
        int color = Color.rgb(red, blue, green);
        back1.setBackgroundColor(color);
    }
}
