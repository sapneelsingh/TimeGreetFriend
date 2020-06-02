package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends ListActivity {

    String [] names;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       names = getResources().getStringArray(R.array.Friends);
       setListAdapter((ListAdapter) new ArrayAdapter<String>(this, R.layout.friend_item, names));

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int hour = cal.get(Calendar.HOUR_OF_DAY);

        String greeting = null;
        if (hour >= 12 && hour<17){
            greeting = "Good Afternoon ";
        } else if (hour>= 17 && hour <21){
            greeting = "Good evening ";
        } else if (hour>=21 && hour <24){
            greeting = "Good Night ";
        } else {
            greeting = "Good Morning ";
        }

        Intent i = new Intent(this, ShowMessage.class);
        i.putExtra("message",greeting + "" + names[(int)id] + "!" );
        startActivity(i);
    }


        }

