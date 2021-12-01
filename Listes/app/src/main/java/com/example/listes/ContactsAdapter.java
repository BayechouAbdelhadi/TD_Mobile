package com.example.listes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import com.bumptech.glide.Glide;

public class ContactsAdapter  extends RecyclerView.Adapter<ContactsAdapter.ViewHolder> {

    private final List<Contact> mContacts;

    public ContactsAdapter(List<Contact> mContacts) {
        this.mContacts = mContacts;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView firstNameTextView;
        public TextView lastNameTextView;
        public ImageView avatarImageView;

        public ViewHolder(View itemView){
            super(itemView);
            firstNameTextView = (TextView)itemView.findViewById(R.id.firstName);
            lastNameTextView = (TextView)itemView.findViewById(R.id.lastName);
            avatarImageView =  (ImageView) itemView.findViewById(R.id.image_avatar);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater =LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.item_contact,parent,false);

        return new ViewHolder(contactView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Contact contact =mContacts.get(position);
        Context context = holder.itemView.getContext();
        TextView firstNameTextView = holder.firstNameTextView;
        firstNameTextView.setText(contact.getFirstName());
        TextView lastNameTextView = holder.lastNameTextView;
        lastNameTextView.setText(contact.getLastName());
        ImageView avatarImageView = holder.avatarImageView;
        Glide.with(context).
                load(contact.getImageUrl()).
                into(avatarImageView);


    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }


}
