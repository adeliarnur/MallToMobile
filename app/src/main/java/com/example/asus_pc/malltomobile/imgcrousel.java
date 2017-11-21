package com.example.asus_pc.malltomobile;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.asus_pc.malltomobile.R.mipmap.ic_uwong;

public class imgcrousel extends AppCompatActivity {
    ViewPager viewPager;
    Button button;
    Integer [] img = Menu.img;
    String a = Menu.a;

    TextView Nama, Harga, Avaiable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imgcrousel);

        Nama = (TextView) findViewById(R.id.textView);
        Harga = (TextView) findViewById(R.id.textView2);
        Avaiable = (TextView) findViewById(R.id.textView3);


        viewPager = (ViewPager) findViewById(R.id.viewPager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this, img);

        Nama.setText(Menu.Nama);
        Harga.setText(Menu.Price);
        Avaiable.setText(Menu.Avaiable);

        viewPager.setAdapter(viewPagerAdapter);
    }
}
