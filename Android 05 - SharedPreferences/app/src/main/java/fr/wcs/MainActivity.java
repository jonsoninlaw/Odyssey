package fr.wcs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText rememberField = findViewById(R.id.rememberField);
        final Button rememberButton = findViewById(R.id.rememberButton);
        final TextView backupText = findViewById(R.id.backupText);

        final Context context = MainActivity.this;
        final SharedPreferences sharedPref = context.getSharedPreferences(getString(R.string.preferences_file), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        backupText.setText(sharedPref.getString(getString(R.string.preferences_file), "Backup"));

        rememberButton.setEnabled(false);
        rememberField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                rememberButton.setEnabled(s.toString().length() != 0);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        rememberButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backupText.setText(rememberField.getText().toString());

                editor.putString(getString(R.string.preferences_file), rememberField.getText().toString());
                editor.commit();
            }
        });


    }
}
