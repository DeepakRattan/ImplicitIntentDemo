package com.example.deepakrattan.implicitintentdemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnShowWeb, btnGallery, btnCall;
    EditText edtCAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShowWeb = (Button) findViewById(R.id.btnShowWeb);
        btnGallery = (Button) findViewById(R.id.btnGallery);
        btnCall = (Button) findViewById(R.id.btnCall);
        edtCAll = (EditText) findViewById(R.id.edtCAll);

        btnGallery.setOnClickListener(this);
        btnCall.setOnClickListener(this);
        btnShowWeb.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnShowWeb:
                Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse("https:www.facebook.com"));
                startActivity(intentWeb);
                break;
            case R.id.btnCall:
                Intent intentCall = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + edtCAll.getText().toString()));
                startActivity(intentCall);
                break;
            case R.id.btnGallery:
                Intent intentGallery = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/external/images/media"));
                startActivity(intentGallery);
                break;

        }

    }
}
