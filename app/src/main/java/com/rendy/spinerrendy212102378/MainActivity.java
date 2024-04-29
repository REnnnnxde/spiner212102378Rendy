package com.rendy.spinerrendy212102378;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner _spinner1, _spinner2, _spinner3, _spinner4, _spinner5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _spinner1 = (Spinner)findViewById(R.id.spinner1);
        _spinner2 = (Spinner)findViewById(R.id.spinner2);
        _spinner3 = (Spinner)findViewById(R.id.spinner3);
        _spinner4 = (Spinner)findViewById(R.id.spinner4);
        _spinner5 = (Spinner) findViewById(R.id.spinner5);

        initSpinner1();
        initSpinner2();
        initSpinner3();
        initSpinner4();
        initSpinner5();
    }


    private void initSpinner1(){
        List<String> buahList = new ArrayList<>();
        buahList.add("rambutan");
        buahList.add("Langsa");
        buahList.add("Nangka");
        buahList.add("Mangga");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,buahList);
        _spinner1.setAdapter(arrayAdapter);

    }

    private void initSpinner2(){
        List<String> mahasiswaList = new ArrayList<>();

        for (int i =1; i <= 1000; i++){
            mahasiswaList.add("mahasiswa ke-" + i);
        }
        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mahasiswaList);
        _spinner2.setAdapter(arrayAdapter2);
    }

    private void initSpinner3(){
        List<String> ganjilList = new ArrayList<>();

        for(int i = 1; i <=999; i +=2) {
            ganjilList.add("Bilangan Ganjil ke-" + i);
        }
        ArrayAdapter<String >arrayAdapter3 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ganjilList);
        _spinner3.setAdapter(arrayAdapter3);
    }
    private void initSpinner4(){
        List<String> genapList = new ArrayList<>();

        for(int i = 2; i <=1000; i +=2) {
            genapList.add("Bilangan Genap ke-" + i);
        }
        ArrayAdapter<String >arrayAdapter4 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, genapList);
        _spinner4.setAdapter(arrayAdapter4);
    }
    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    private void initSpinner5(){
        List<String> primaListText = new ArrayList<>();

        for (int i = 2; i <= 1000; i++) {
            if (isPrime(i)) {
                primaListText.add("Bilangan prima - " + i);
            }
        }

        ArrayAdapter<String> arrayAdapter5 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, primaListText);
        _spinner5.setAdapter(arrayAdapter5);
    }



}