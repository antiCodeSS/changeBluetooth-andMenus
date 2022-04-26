package com.staj.laresapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BaglantiActivity extends AppCompatActivity {

    //değişkenler
    BluetoothAdapter myBluetooth;
    Button toggle_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baglanti);

        myBluetooth= BluetoothAdapter.getDefaultAdapter();  // cihazda bluetooth özelliği kontrolünü yapar
        toggle_button=(Button) findViewById(R.id.button_toggle);  //butonu bağladık

        toggle_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleBluetooth();
            }
        });
    }
    private void toggleBluetooth() {//onCREATE DIŞI

        if ( myBluetooth==null){
            Toast.makeText(getApplicationContext(),"BLUETOOTH CIHAZI YOK",Toast.LENGTH_SHORT).show();     // toast mesajı eklendi
        }

        if(!myBluetooth.isEnabled()){   //enable değil ise

            Intent enableIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);  //talepten sonra bluetooth açılır
            startActivity(enableIntent);
        }

        if(myBluetooth.isEnabled()){
            myBluetooth.disable();
        }

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