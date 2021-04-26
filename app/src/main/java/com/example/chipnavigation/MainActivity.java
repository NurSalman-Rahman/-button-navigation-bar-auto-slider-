package com.example.chipnavigation;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.chipnavigation.ui.home.HomeFragment;
import com.example.chipnavigation.ui.favorite.FavoriteFragment;
import com.example.chipnavigation.ui.inbox.InboxFragment;
import com.example.chipnavigation.ui.store.StoreFragment;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


public class MainActivity extends AppCompatActivity {
    ChipNavigationBar chipNavigationBar;
    Fragment fragment = null;
    boolean back = false;
    // int backing = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);


        chipNavigationBar = findViewById(R.id.chipNavigation);
        chipNavigationBar.setItemSelected(R.id.home1, true);
        getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new HomeFragment()).commit();

        Bundle extras = getIntent().getExtras();

        int checking;

        if (extras != null) {

            checking= extras.getInt("Key");
            if (checking == 1) {

                chipNavigationBar.setItemSelected(R.id.Favorite_Drug, true);
                getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new FavoriteFragment()).commit();

                // and get whatever type user account id is
            }

        }




        //Start manu Icon



        //nav_host_fragment = framelayout

        chipNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {
                switch (i) {
                    case R.id.home1:
                        fragment = new HomeFragment();
                        break;
                    case R.id.Favorite_Drug:
                        fragment = new FavoriteFragment();


                        break;
                    case R.id.Inbox:
                        fragment = new InboxFragment();
                        break;
                    case R.id.Store:
                        fragment = new StoreFragment();
                        break;

                    case R.id.Call:

                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(intent);
                        finish();
                        break;


                }

                if (fragment != null) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, fragment).commit();
                }
            }
        });


    }


    public void onRestart() {
        super.onRestart();

/*

        chipNavigationBar.setItemSelected(R.id.Favorite_Drug, true);
        getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new FavoriteFragment()).commit();



*/


    }
}
