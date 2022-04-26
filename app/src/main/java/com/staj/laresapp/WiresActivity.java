package com.staj.laresapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.android.material.tabs.TabLayout;
import com.staj.laresapp.ParentFragment.BasicFragment;
import com.staj.laresapp.ParentFragment.GraphicsFragment;
import com.staj.laresapp.ParentFragment.TableFragment;

public class WiresActivity extends AppCompatActivity {

    //İÇ MENÜSÜ İÇİN

    TabLayout tabLayout;
    ViewPager viewPager;
    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wires);
         
        addFragment();//içmenü
        
    }

    private void addFragment() {

        tabLayout =findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        ViewPagerAdapter adapter =new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new BasicFragment(),"BASIC");
        adapter.addFragment(new TableFragment(),"TABLE");
        adapter.addFragment(new GraphicsFragment(),"GRAPHICS");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }


















}