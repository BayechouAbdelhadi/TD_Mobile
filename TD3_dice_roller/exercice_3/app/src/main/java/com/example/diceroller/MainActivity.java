package com.example.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button diceButton =(Button)findViewById(R.id.dice_button);
        final TextView diceValue=(TextView)findViewById(R.id.dice_value);
        final EditText nbFacesInput =(EditText)findViewById(R.id.nb_faces);
        diceButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(MainActivity.this, "Dé lancé!", Toast.LENGTH_SHORT);
                toast.show();
                int nbFaces = Integer.parseInt(String.valueOf(nbFacesInput.getText()));
                int rand =(int)(Math.random()*nbFaces) +1;
                diceValue.setText(Integer.toString(rand));
            }
        });
    }
}
