package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class BMLMActivity1 extends AppCompatActivity {
    private ListView lstOrdenar;
    private ListView lstIndices;
    private ListView lstOriginal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmlmactivity1);
    }
}