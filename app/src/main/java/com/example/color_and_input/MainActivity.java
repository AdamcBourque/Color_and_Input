package com.example.color_and_input;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submit(View view){
        EditText input = findViewById(R.id.input);
        String input_text = input.getText().toString();
        TextView output = findViewById(R.id.output);
        output.setText(input_text);
        LinearLayout app = findViewById(R.id.app);
        app.setBackgroundColor(input_text.hashCode());
        output.setTextColor(input_text.hashCode()*input_text.hashCode());
    }
}
