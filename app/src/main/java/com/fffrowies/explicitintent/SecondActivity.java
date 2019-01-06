package com.fffrowies.explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = SecondActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = findViewById(R.id.textView);

        StringBuilder msg = new StringBuilder("Welcome \n");

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        if (b.containsKey(Constants.KEY_NAME)) {  // to be Safe
            String name = b.getString(Constants.KEY_NAME);
            msg.append(name).append("\n");
            Log.i(TAG, "Name: " + name);
        }

        if (b.containsKey(Constants.KEY_AGE)) {  // to be Safe
            int age = b.getInt(Constants.KEY_AGE);
            msg.append(age).append(" years old");
            Log.i(TAG, "Age: " + age);
        }

        textView.setText(msg);

    }
}
