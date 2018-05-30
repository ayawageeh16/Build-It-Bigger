package com.app.baking.wageeh.jokeandroidlibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokesActivity extends AppCompatActivity {

    TextView jokeTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);

        jokeTextView = findViewById(R.id.jokeTextView);
        Intent intent = getIntent();
        String joke = intent.getStringExtra("joke");
        if(joke == null){
            jokeTextView.setText("the joke is null!");
        }else{
            jokeTextView.setText(joke);
        }

    }
}
