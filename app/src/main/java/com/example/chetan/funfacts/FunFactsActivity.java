package com.example.chetan.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

    private TextView mFactTextView;
    private Button mShowFactButton;
    private RelativeLayout mLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        mFactTextView = (TextView) findViewById(R.id.factTextView);
        mShowFactButton = (Button) findViewById(R.id.funFactButton);
        mLayout = (RelativeLayout) findViewById(R.id.layout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] facts = {
                        "Ants stretch when they wake up in the morning",
                        "Ostriches can run faster than horses",
                        "Mammoths walked the Earth when the pyramids were built",
                };

                String[] colors = {
                        "#03d4fc",
                        "#fdc802",
                        "#ff00be",
                };

                Random random = new Random();
                int randomNumber = random.nextInt(facts.length);
                mFactTextView.setText(facts[randomNumber]);
                mShowFactButton.setTextColor(Color.parseColor(colors[randomNumber]));
                mLayout.setBackgroundColor(Color.parseColor(colors[randomNumber]));
            }
        };
        mShowFactButton.setOnClickListener(listener);
    }

}
