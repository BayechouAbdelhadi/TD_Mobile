package com.example.newslist;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        setTitle(getLocalClassName());

        Button logoutButton = (Button) findViewById(R.id.logoutButton);
        Button detailButton = (Button) findViewById(R.id.detailsButton);
        Button aboutButton = (Button) findViewById(R.id.aboutButton);

        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NewsActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

        detailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NewsActivity.this, DetailsActivity.class);
                startActivity(intent);
            }
        });

        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://news.google.com/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}
