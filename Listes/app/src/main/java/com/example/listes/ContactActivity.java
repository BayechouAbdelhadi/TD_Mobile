package com.example.listes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ContactActivity extends AppCompatActivity {
    List<Contact> contacts = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        RecyclerView rvContacts = (RecyclerView) findViewById(R.id.rvContacts);

        contacts.add(new Contact("Jean","Pierre","https://bit.ly/3CKt70G"));
        contacts.add(new Contact("Jean1","Pierre1","https://bit.ly/3CKt70G"));
        contacts.add(new Contact("Jean2","Pierre2","https://bit.ly/3CKt70G"));
        contacts.add(new Contact("Jean3","Pierre3","https://bit.ly/3CKt70G"));
        contacts.add(new Contact("Jean4","Pierre4","https://bit.ly/3CKt70G"));

        ContactsAdapter adapter = new ContactsAdapter(contacts);
        rvContacts.setAdapter(adapter);
        rvContacts.setLayoutManager(new LinearLayoutManager(this));

    }
}