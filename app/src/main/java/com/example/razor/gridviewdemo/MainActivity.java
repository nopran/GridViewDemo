package com.example.razor.gridviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //membuat array namamakanan
    private String[] namamakanan = new String[]{
            "Ayam Goreng", "Nasi Goreng", "Nasi Uduk", "Mie Goreng", "Mie Rebus",
            "Sate Padang", "Bakso", "Soto", "Rawon", "Pecel Lele"};

    //inisiasi gridview
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.gridview); //inisialisasi object gridview pada layout

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, android.R.id.text1, namamakanan);
        gridView.setAdapter(adapter); //menset data di dalam gridview

        //set onclick ketika item dari gridview diklik akan menampilkan toast
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Memilih : " + namamakanan[position], Toast.LENGTH_LONG).show();
            }
        });
    }


}