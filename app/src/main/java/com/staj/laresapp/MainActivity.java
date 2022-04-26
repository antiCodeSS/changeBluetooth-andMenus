package com.staj.laresapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    //binding


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    } //ONCREATE


    //MENU
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    //menuye tıklanınca ne olcak


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.add_baglanti){
            Intent intent = new Intent(this,BaglantiActivity.class);
            startActivity(intent);
        }



        else if (item.getItemId() == R.id.add_olcum){
            Intent intent = new Intent(this, OlcumActivity.class);
            startActivity(intent);
        }


        else if (item.getItemId() == R.id.add_veriler){
            Intent intent = new Intent(this, VerilerActivity.class);
            startActivity(intent);
        }

        else if (item.getItemId() == R.id.add_terscozum){
            Intent intent = new Intent(this,TersCozumActivity.class);
            startActivity(intent);
        }

        else if (item.getItemId() == R.id.add_koordinat){
            Intent intent = new Intent(this,KoordinatActivity.class);
            startActivity(intent);
        }

        else if (item.getItemId() == R.id.add_hakkinda){
            Intent intent = new Intent(this,HakkindaActivity.class);
            startActivity(intent);}

        return super.onOptionsItemSelected(item);
    }



    //BUTONLARDAN AKTİVİTELERE GEÇİS
    public void changeBaglanti(View view){
        Intent intent = new Intent(MainActivity.this,BaglantiActivity.class);
        startActivity(intent);
    }

    public void changeOlcum(View view){
        Intent intent = new Intent(MainActivity.this, OlcumActivity.class);
        startActivity(intent);
    }

    public void changeVeriler(View view){
        Intent intent = new Intent(MainActivity.this,VerilerActivity.class);
        startActivity(intent);
    }

    public void changeTersCozum(View view){
        Intent intent = new Intent(MainActivity.this,TersCozumActivity.class);
        startActivity(intent);
    }

    public void changeKoordinat(View view){
        Intent intent = new Intent(MainActivity.this,KoordinatActivity.class);
        startActivity(intent);
    }

    public void changeHakkinda(View view){
        Intent intent = new Intent(MainActivity.this,HakkindaActivity.class);
        startActivity(intent);
    }



} //MAINACTIVITY