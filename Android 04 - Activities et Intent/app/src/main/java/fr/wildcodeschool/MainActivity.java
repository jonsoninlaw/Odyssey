package fr.wildcodeschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button sendButton;
    EditText input;
    String login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendButton = (Button) findViewById(R.id.send_button);
        input = (EditText) findViewById(R.id.input);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent home = new Intent(MainActivity.this, HomeActivity.class);
                login = input.getText().toString();
                home.putExtra("LOGIN", login);
                startActivity(home);
            }
        });
    }
}
