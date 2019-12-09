package fr.wildcodeschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText firstName;
    EditText lastName;
    Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName = (EditText) findViewById(R.id.firstname);
        lastName = (EditText) findViewById(R.id.lastname);
        sendButton = (Button) findViewById(R.id.send_button);

        sendButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Context context = getApplicationContext();
                String toastText = "Congratulation " + firstName.getText().toString() + " " + lastName.getText().toString();
                Toast toast = Toast.makeText(context, toastText, Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP|Gravity.CENTER, 0, 800);
                toast.show();

            }
        });
    }
}
