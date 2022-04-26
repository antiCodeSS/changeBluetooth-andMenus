package com.staj.laresapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class VerilerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veriler);
    }

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
            Intent intent = new Intent(this, WiresActivity.class);
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














}