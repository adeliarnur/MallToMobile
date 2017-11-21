package com.example.asus_pc.malltomobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Menu extends AppCompatActivity {
    ImageButton button1, button2, button3, button4, button5, button6;
    public static Integer [] img;
    public static String a;
    public static String Nama,Price, Avaiable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        button1 = (ImageButton) findViewById(R.id.orang);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, imgcrousel.class);
                Integer [] images1 = {R.drawable.slide11, R.drawable.slide12, R.drawable.slide13};
                img = images1;
                Nama = "Kutek n bag shoes";
                Price = "Rp. 60.000,00";
                Avaiable = "2 Days";
                startActivity(intent);
            }
        });


        button2 = (ImageButton) findViewById(R.id.gramd);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, imgcrousel.class);
                Integer [] images2 = {R.drawable.slide21, R.drawable.slide22, R.drawable.slide23};
                img = images2;
                Nama = "Books";
                Price = "Rp. 60.000,00";
                Avaiable = "2 Days";
                startActivity(intent);
            }
        });

        button3 = (ImageButton) findViewById(R.id.vcrs);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, imgcrousel.class);
                Integer [] images3 = {R.drawable.slide31, R.drawable.slide32, R.drawable.slide33};
                img = images3;
                Nama = "Bag n Parfume";
                Price = "Rp. 750.000,00";
                Avaiable = "1 days";
                startActivity(intent);
            }
        });

        button4 = (ImageButton) findViewById(R.id.mthr);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, imgcrousel.class);
                Integer [] images4 = {R.drawable.slide41, R.drawable.slide42, R.drawable.slide43};
                img = images4;
                Nama = "Bag n Shoes";
                Price = "Rp. 450.000,00";
                Avaiable = "1 days";
                startActivity(intent);
            }
        });

        button5 = (ImageButton) findViewById(R.id.lvs);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, imgcrousel.class);
                Integer [] images5 = {R.drawable.slide51, R.drawable.slide52, R.drawable.slide53};
                img = images5;
                Nama = "Jacket n Trousers";
                Price = "Rp. 550.000,00";
                Avaiable = "1 days";
                startActivity(intent);
            }
        });

        button6 = (ImageButton) findViewById(R.id.vans);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, imgcrousel.class);
                Integer [] images6 = {R.drawable.slide61, R.drawable.slide62, R.drawable.slide63};
                img = images6;
                Nama = "Bag n Shoes";
                Price = "Rp. 450.000,00";
                Avaiable = "1 days";
                startActivity(intent);
            }
        });






    }

}
