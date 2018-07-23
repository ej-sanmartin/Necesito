package edu.esanmartinjrfordham.necesito;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class UserInfo extends Activity {

    // For have_spinner view
    Spinner have_spinner;
    ArrayAdapter<CharSequence> have_adapter;

    // For want_spinner view
    Spinner want_spinner;
    ArrayAdapter<CharSequence> want_adapter;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.profile_setup);
        // For have_spinner view on profile setup xml file
        have_spinner = (Spinner)findViewById(R.id.have_spinner);
        have_adapter = ArrayAdapter.createFromResource(this, R.array.have_list, android.R.layout.simple_spinner_item);
        have_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        have_spinner.setAdapter(have_adapter);
        have_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemAtPosition(position)+ " selected", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // Thrown just in case nothing is selected
                Toast.makeText(getBaseContext(), "Nothing Selected", Toast.LENGTH_SHORT).show();
            }
        });

        // For want_spinner view on profile setup xml file
        want_spinner = (Spinner)findViewById(R.id.want_spinner);
        want_adapter = ArrayAdapter.createFromResource(this, R.array.want_list, android.R.layout.simple_spinner_item);
        want_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        want_spinner.setAdapter(want_adapter);
        want_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemAtPosition(position)+ " selected", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // Thrown just in case nothing is selected
                Toast.makeText(getBaseContext(), "Nothing Selected", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
