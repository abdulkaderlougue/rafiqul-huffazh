package org.tangaya.quranasrclient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void recordButtonClickAction(View view) {

        Toast.makeText(this, "record button clicked", Toast.LENGTH_SHORT).show();

    }

}