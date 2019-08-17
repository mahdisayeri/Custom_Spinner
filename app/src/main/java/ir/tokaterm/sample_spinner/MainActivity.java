package ir.tokaterm.sample_spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import ir.tokaterm.customspinner_libs.CustomAdapter;

public class MainActivity extends AppCompatActivity {

    int[] flags={R.drawable.finland,R.drawable.hungary,R.drawable.indonesia,R.drawable.israel,R.drawable.italy,R.drawable.spain};
    String[] name={"finland","hungary","indonesia","israel","italy","spain"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner=findViewById(R.id.main_spinner);

        CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),flags,name);
        spinner.setAdapter(customAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "You Select Position: "+position+" "+name[position], Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }
}
