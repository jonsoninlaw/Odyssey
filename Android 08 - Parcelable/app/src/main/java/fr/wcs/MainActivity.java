package fr.wcs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText brand = findViewById(R.id.brandField);
        final EditText kilometers = findViewById(R.id.kmField);
        final Button goButton = findViewById(R.id.goButton);

        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (brand.getText().toString().length() == 0 || kilometers.getText().toString().length() == 0) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Veuillez remplir les champs !", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.TOP| Gravity.CENTER, 0, 200);
                    toast.show();
                }
                else {
                    try {
                        int km = Integer.parseInt(kilometers.getText().toString());
                        Vehicle vehicle = new Vehicle(brand.getText().toString(), km);
                        Intent parking = new Intent(MainActivity.this, ParkingActivity.class);
                        parking.putExtra("vehicle", vehicle);
                        startActivity(parking);
                    }
                    catch(NumberFormatException e){
                        Toast toast = Toast.makeText(getApplicationContext(), "Veuillez entrer un nombre valide !", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.TOP| Gravity.CENTER, 0, 200);
                        toast.show();
                    }
                }
            }
        });
    }
}
