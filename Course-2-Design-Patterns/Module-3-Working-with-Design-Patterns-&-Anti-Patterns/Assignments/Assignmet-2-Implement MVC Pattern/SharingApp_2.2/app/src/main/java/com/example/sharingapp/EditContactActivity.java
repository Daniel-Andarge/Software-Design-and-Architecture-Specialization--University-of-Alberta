package com.example.sharingapp;

import java.util.Observer;

import android.content.Context;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Editing a pre-existing contact consists of deleting the old contact and adding a new contact with the old
 * contact's id.
 * Note: You will not be able contacts which are "active" borrowers
 */
public class EditContactActivity extends AppCompatActivity {

    private ContactList contact_list = new ContactList();

   
    private EditText email;
    private EditText username;
    private Context context;

    private Contact contact;
  

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_contact);

        context = getApplicationContext();
        contact_list_controller.loadContacts(context);

        Intent intent = getIntent();
        int pos = intent.getIntExtra("position", 0);

        contact = contact_list_controller.getContact(pos);

        username = (EditText) findViewById(R.id.username);
        email = (EditText) findViewById(R.id.email);

        username.setText(contact_controller.getUsername());
        email.setText(contact_controller.getEmail());
    }

    public void saveContact(View view) {

        String email_str = email.getText().toString();

        if (email_str.equals("")) {
            email.setError("Empty field!");
            return;
        }

        if (!email_str.contains("@")){
            email.setError("Must be an email address!");
            return;
        }

        String username_str = username.getText().toString();

        // Check that username is unique AND username is changed (Note: if username was not changed
        // then this should be fine, because it was already unique.)
        if (!contact_list.isUsernameAvailable(username_str) && !(contact_controller.getUsername().equals(username_str))) {
            username.setError("Username already taken!");
            return;
        }

        String id = contact_controller.getId(); // Reuse the contact id
        Contact updated_contact = new Contact(username_str, email_str, id);

        // Edit contact
        EditContactCommand edit_contact_command = new EditContactCommand(contact_list, contact, updated_contact, context);
        edit_contact_command.execute();

        boolean success = edit_contact_command.isExecuted();
        if (!success){
            return;
        }

        // End EditContactActivity
        finish();
    }

    public void deleteContact(View view) {
     // Delete item
     boolean success = contact_list_controller.deleteContact(contact, context);
     if (!success) {
         return;
     }


  
        // End EditContactActivity
     contact_list_controller.removeObserver(this);


     Intent intent = new Intent(this, MainActivity.class);
     startActivity(intent);


    }
}
