package com.example.mycity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.example.mycity.databinding.ActivityHomeBinding;

public class home extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
private ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

     binding = ActivityHomeBinding.inflate(getLayoutInflater());
     setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarHome.toolbar);

        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_home);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }



  /*  public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
        // return true;
    }
    public boolean onOptionsItemsSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.emcall) {
            Intent i = new Intent(this, call.class);
            startActivity(i);
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/


    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_home);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
    public void how(View view){
        Intent intent=new Intent(this,howtoreach.class);
        startActivity(intent);
    }
    public void food(View view){
        Intent intent=new Intent(this,food.class);
        startActivity(intent);
    }
    public void places(View view){
        Intent intent=new Intent(this,places.class);
        startActivity(intent);
    }
    public void temp(View view){
        Intent intent=new Intent(this,weather.class);
        startActivity(intent);
    }
    public void call(View view){
        Intent intent=new Intent(this,call.class);
        startActivity(intent);
    }
    public void lang(View view){
        Intent intent=new Intent(this,lang.class);
        startActivity(intent);
    }



}