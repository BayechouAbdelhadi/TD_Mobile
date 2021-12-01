package com.example.listes;

public class Contact {

    private String firstName;
    private String lastName;
    private String imageUrl;

    public Contact() {}

    public Contact(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Contact(String firstName, String lastName, String imageUrl) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.imageUrl = imageUrl;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
