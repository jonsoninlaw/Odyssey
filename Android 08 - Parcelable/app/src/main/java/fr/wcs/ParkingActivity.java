package fr.wcs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ParkingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking);

        TextView brand = findViewById(R.id.brandShow);
        TextView kilometers = findViewById(R.id.kmShow);

        Intent intent = getIntent();
        Vehicle vehicle = intent.getParcelableExtra("vehicle");

        brand.setText(vehicle.getBrand());
        kilometers.setText(Integer.toString(vehicle.getKilometers()));
    }
}