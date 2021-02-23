package com.example.chipnavigation;

import android.os.Bundle;

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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        chipNavigationBar = findViewById(R.id.chipNavigation);

        chipNavigationBar.setItemSelected(R.id.home1, true);
        getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new HomeFragment()).commit();

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

                }

                if (fragment != null) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, fragment).commit();
                }
            }
        });
























       /* BottomNavigationView navView = findViewById(R.id.nav_host_fragment);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.home1, R.id.Favorite_Drug, R.id.Inbox,R.id.Store)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);*/
    }

}