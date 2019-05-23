package com.example.implicitintentsreceiver;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        Uri uri = intent.getData();
        if (uri != null) {
            String uriString = getString(R.string.uriLabel) + uri.toString();
            TextView textView = findViewById(R.id.textUriMessage);
            textView.setText(uriString);
        }
    }
}
