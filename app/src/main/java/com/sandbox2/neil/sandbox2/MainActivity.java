package com.sandbox2.neil.sandbox2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    private Button answerYesButton, answerNoButton;
    private EditText usersNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answerYesButton = (Button) findViewById(R.id.answerYesButton);
        answerNoButton = (Button) findViewById(R.id.answerNoButton);
        usersNameEditText = (EditText) findViewById(R.id.users_name_edit_text);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            Toast.makeText(this, "Pahaha funny how you think this app has a search functionality xD", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onYesButtonClick(View view) {

        String usersName = String.valueOf(usersNameEditText.getText()); //get text from EditText and convert to string
        String yourYesResponse = "That's great " + usersName;

        Toast.makeText(this, yourYesResponse, Toast.LENGTH_SHORT).show();
    }

    public void onNoButtonClick(View view) {

        String usersName = String.valueOf(usersNameEditText.getText()); //get text from EditText and convert to string
        String yourNoResponse = "Awww that's cute " + usersName;

        Toast.makeText(this, yourNoResponse, Toast.LENGTH_SHORT).show();
    }
}
