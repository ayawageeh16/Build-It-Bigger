package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.app.baking.wageeh.jokejavalib.JokeClass;
import com.udacity.gradle.builditbigger.free.MainActivityFragment;


public class MainActivity extends AppCompatActivity {

    JokeClass jokeClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //jokeClass = new JokeClass();
        getSupportFragmentManager().beginTransaction().
                add(R.id.fragment,new MainActivityFragment()).commit();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
       // Toast.makeText(this,jokeClass.getJoke(),Toast.LENGTH_LONG).show();
        new EndpointsAsyncTask(this);
    }


}
