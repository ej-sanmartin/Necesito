package edu.esanmartinjrfordham.necesito;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import edu.esanmartinjrfordham.necesito.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the food category
        TextView food = (TextView) findViewById(R.id.food);

        // Set a click listener on that View
        food.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Food category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FoodActivity}
                Intent foodIntent = new Intent(MainActivity.this, FoodActivity.class);

                // Start the new activity
                startActivity(foodIntent);
            }
        });

        // Find the View that shows the water category
        TextView water = (TextView) findViewById(R.id.water);

        // Set a click listener on that View
        water.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the water category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link WaterActivity}
                Intent waterIntent = new Intent(MainActivity.this, WaterActivity.class);

                // Start the new activity
                startActivity(waterIntent);
            }
        });

        // Find the View that shows the clothes category
        TextView clothes = (TextView) findViewById(R.id.clothes);

        // Set a click listener on that View
        clothes.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the clothes category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ClothesActivity}
                Intent clothesIntent = new Intent(MainActivity.this, ClothesActivity.class);

                // Start the new activity
                startActivity(clothesIntent);
            }
        });

        // Find the View that shows the toys category
        TextView toys = (TextView) findViewById(R.id.toys);

        // Set a click listener on that View
        toys.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the toys category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ToysActivity}
                Intent toysIntent = new Intent(MainActivity.this, ToysActivity.class);

                // Start the new activity
                startActivity(toysIntent);
            }
        });

        // Find the View that shows the electronics category
        TextView electronics = (TextView) findViewById(R.id.electronics);

        // Set a click listener on that View
        electronics.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the electronics category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ElectronicsActivity}
                Intent electronicsIntent = new Intent(MainActivity.this, ElectronicsActivity.class);

                // Start the new activity
                startActivity(electronicsIntent);
            }
        });

        // Find the View that shows the hygiene category
        TextView hygiene = (TextView) findViewById(R.id.toys);

        // Set a click listener on that View
        hygiene.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the hygiene category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link HygieneActivity}
                Intent hygieneIntent = new Intent(MainActivity.this, HygieneActivity.class);

                // Start the new activity
                startActivity(hygieneIntent);
            }
        });

        // Find the View that shows the medicine category
        TextView medicine = (TextView) findViewById(R.id.medicine);

        // Set a click listener on that View
        medicine.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MedicineActivity}
                Intent medicineIntent = new Intent(MainActivity.this, MedicineActivity.class);

                // Start the new activity
                startActivity(medicineIntent);
            }
        });

        // Find the View that shows the labour category
        TextView labour = (TextView) findViewById(R.id.labour_skills);

        // Set a click listener on that View
        labour.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the labour category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link LabourActivity}
                Intent labourIntent = new Intent(MainActivity.this, LabourActivity.class);

                // Start the new activity
                startActivity(labourIntent);
            }
        });

        // Find the View that shows the cleaning category
        TextView cleaning = (TextView) findViewById(R.id.cleaning_skills);

        // Set a click listener on that View
        cleaning.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the cleaning category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ToysActivity}
                Intent cleaningIntent = new Intent(MainActivity.this, CleaningActivity.class);

                // Start the new activity
                startActivity(cleaningIntent);
            }
        });

        // Find the View that shows the repairing category
        TextView repairing = (TextView) findViewById(R.id.repairing_skills);

        // Set a click listener on that View
        repairing.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the repairing category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RepairingActivity}
                Intent repairingIntent = new Intent(MainActivity.this, RepairingActivity.class);

                // Start the new activity
                startActivity(repairingIntent);
            }
        });

        // Find the View that shows the medical category
        TextView medical = (TextView) findViewById(R.id.medical_skills);

        // Set a click listener on that View
        medical.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the medical category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MedicalActivity}
                Intent medicalIntent = new Intent(MainActivity.this, MedicalActivity.class);

                // Start the new activity
                startActivity(medicalIntent);
            }
        });

        // Find the View that shows the cooking category
        TextView cooking = (TextView) findViewById(R.id.cooking_skills);

        // Set a click listener on that View
        cooking.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the cooking category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link CookingActivity}
                Intent cookingIntent = new Intent(MainActivity.this, CookingActivity.class);

                // Start the new activity
                startActivity(cookingIntent);
            }
        });
    }
}