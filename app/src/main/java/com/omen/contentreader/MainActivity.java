package com.omen.contentreader;

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Uri uri = Uri.parse("content://com.omen.contentwriter/tab");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Cursor cursor = getContentResolver().query(uri, null, null, null, null, null);
        cursor.moveToFirst();
        for (int i = 0; i < cursor.getCount(); i++) {
            String value = cursor.getString(cursor.getColumnIndex("name"));
            Toast.makeText(getApplicationContext(),value,Toast.LENGTH_LONG).show();
        }

    }
}
