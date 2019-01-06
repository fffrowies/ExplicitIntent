package com.fffrowies.explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button submitBtn;
    private EditText nameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submitBtn = findViewById(R.id.submitBtn);
        nameEditText = findViewById(R.id.nameEditText);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //moveToSecondActivity_FirstWay();
                moveToSecondActivity_SecondWay();
            }
        });
    }

    private void moveToSecondActivity_FirstWay() {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);

        Bundle b = new Bundle();
        b.putString(Constants.KEY_NAME, nameEditText.getText().toString());
        b.putInt(Constants.KEY_AGE, 57);

        intent.putExtras(b);
        startActivity(intent);
    }

    private void moveToSecondActivity_SecondWay() {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);

        intent.putExtra(Constants.KEY_NAME, nameEditText.getText().toString());
        intent.putExtra(Constants.KEY_AGE, 56);

        startActivity(intent);
    }
}
