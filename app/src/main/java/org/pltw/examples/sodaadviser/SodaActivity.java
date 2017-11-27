package org.pltw.examples.sodaadviser;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class SodaActivity extends AppCompatActivity {
private Button findSodaButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soda);
        findSodaButton = (Button) findViewById(R.id.findSodaButton);
    }
}
