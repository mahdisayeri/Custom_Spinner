package ir.tokaterm.customspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String[] flags;
    int[] name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flags={R.drawable.germany,R.drawable.united_states,R.drawable.australia};
    }
}
