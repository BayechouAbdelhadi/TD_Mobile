package com.example.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button diceButton =(Button)findViewById(R.id.dice_button);
        final TextView diceValue=(TextView)findViewById(R.id.dice_value);

        diceButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(MainActivity.this, "Dé lancé!", Toast.LENGTH_SHORT);
                toast.show();

                int rand =(int)(Math.random()*6) +1;
                diceValue.setText(Integer.toString(rand));
            }
        });
    }
}
