package org.pltw.examples.sodaadviser;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class SodaActivity extends AppCompatActivity {
private Button findSodaButton;
private TextView brandsTextView;
private Spinner colorSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soda);
        findSodaButton = (Button) findViewById(R.id.findSodaButton);
        brandsTextView = (TextView) findViewById(R.id.brandsTextView);
        colorSpinner = (Spinner) findViewById(R.id.colorSpinner); colorSpinner.getSelectedItem();

        findSodaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((String.valueOf(colorSpinner.getSelectedItem()).equals("Lemon-Lime"))) {
                    brandsTextView.setText("Sprite");
                }
                else if ((String.valueOf(colorSpinner.getSelectedItem()).equals("Fruit"))) {
                    brandsTextView.setText("Welches Grape Soda\n" + " Crush Orange Soda");
                }
                else if ((String.valueOf(colorSpinner.getSelectedItem()).equals("Cola"))) {
                    brandsTextView.setText("Coca-cola");
                }
                else if ((String.valueOf(colorSpinner.getSelectedItem()).equals("Caffeinated Citrus"))) {
                    brandsTextView.setText("Mountain Dew\n" + " Mellow Yellow");
                }

            }


        });
    }
}
