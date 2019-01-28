package com.studyhelper.jniproj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.jogern.jniauth.AuthLib;

public class MainActivity extends AppCompatActivity {

      @Override
      protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            AuthLib.initSignature(getApplicationContext());
            // Example of a call to a native method
            TextView tv = (TextView) findViewById(R.id.sample_text);

            tv.setText(AuthLib.md5("12456987", true) + "\n");
            String encrypt = AuthLib.encrypt("123456");
            Log.d("MainActivity", "encrypt: " + encrypt);
            tv.append("encrypt: " + encrypt + "\n");
            tv.append("decrypt: " + AuthLib.decrypt(encrypt) + "\n");

      }


}
