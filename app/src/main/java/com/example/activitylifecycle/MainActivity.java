package com.example.activitylifecycle;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

public class MainActivity extends AppCompatActivity {

    SharedPreferences preferences;
    SharedPreferences.Editor sharedPrefEditor;
    OnModifier onModifier;
    Context ctx;
    TextView onCreate;
    TextView onStart;
    TextView onResume;
    TextView onPause;
    TextView onRestart;
    TextView onDestroy;
    TextView onStop;

    TextView onCreate2;
    TextView onStart2;
    TextView onResume2;
    TextView onPause2;
    TextView onRestart2;
    TextView onDestroy2;
    TextView onStop2;

    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onModifier = new OnModifier();
        setContentView(R.layout.activity_main);
        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        sharedPrefEditor = preferences.edit();
        ctx = getApplicationContext();
        onCreate = findViewById(R.id.onCreate);
        onStart = findViewById(R.id.onStart);
        onResume = findViewById(R.id.onResume);
        onPause = findViewById(R.id.onPause);
        onRestart = findViewById(R.id.onRestart);
        onDestroy = findViewById(R.id.onDestroy);
        onStop = findViewById(R.id.onStop);

        onCreate2 = findViewById(R.id.onCreate2);
        onStart2 = findViewById(R.id.onStart2);
        onResume2 = findViewById(R.id.onResume2);
        onPause2 = findViewById(R.id.onPause2);
        onRestart2 = findViewById(R.id.onRestart2);
        onDestroy2 = findViewById(R.id.onDestroy2);
        onStop2 = findViewById(R.id.onStop2);
        reset = findViewById(R.id.reset);
        onModifier.setOnCreate(onModifier.getOnCreate() + 1);
        onCreate2.setText(onModifier.getOnCreate() + "");
        if(preferences.contains("onStart()")) {
            onStart.setText(preferences.getInt("onStart()", 1) + "");
        }
        if(preferences.contains("onResume()")) {
            onResume.setText(preferences.getInt("onResume()", 1) + "");
        }
        if(preferences.contains("onPause()")) {
            onPause.invalidate();
            onPause.setText(preferences.getInt("onPause()", 1) + "");
        }
        if(preferences.contains("onRestart()")) {
            onRestart.setText(preferences.getInt("onRestart()", 1) + "");
            System.out.println("bullshit");
        }
        if(preferences.contains("onDestroy()")) {
            onDestroy.setText(preferences.getInt("onDestroy()", 1) + "");
        }
        if(preferences.contains("onStop()")) {
            onStop.setText(preferences.getInt("onStop()", 1) + "");
        }

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(preferences.contains("onCreate()")) {
                    onCreate.setText("0");
                    onCreate2.setText("0");
                }
                if(preferences.contains("onStart()")) {
                    onStart.setText("0");
                    onStart2.setText("0");
                }
                if(preferences.contains("onResume()")) {
                    onResume.setText( "0");
                    onResume2.setText("0");
                }
                if(preferences.contains("onPause()")) {
                    onPause.invalidate();
                    onPause.setText("0");
                    onPause2.setText("0");
                }
                if(preferences.contains("onRestart()")) {
                    onRestart.setText("0");
                    onRestart2.setText("0");
                    System.out.println("bullshit");
                }
                if(preferences.contains("onDestroy()")) {
                    onDestroy.setText("0");
                    onDestroy2.setText("0");
                }
                if(preferences.contains("onStop()")) {
                    onStop.setText( "0");
                    onStop2.setText("0");
                }
                sharedPrefEditor.clear();
                sharedPrefEditor.commit();
            }
        });
        if(!preferences.contains("onCreate()")) {
            Log.v("Start it!", "message");
            sharedPrefEditor.putInt("onCreate()", 1);
            sharedPrefEditor.commit();
            onCreate.setText(preferences.getInt("onCreate()", 1) + "");
        } else {
            Log.v("onCreate()", "lol");
            sharedPrefEditor.putInt("onCreate()", preferences.getInt("onCreate()", 1) + 1);
            sharedPrefEditor.commit();
            onCreate.setText(preferences.getInt("onCreate()", 1) + "");
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        onModifier.setOnStart(onModifier.getOnStart() + 1);
        onStart2.setText(onModifier.getOnStart() + "");
        if(!preferences.contains("onStart()")) {
            Log.v("Start it!", "message");
            sharedPrefEditor.putInt("onStart()", 1);
            sharedPrefEditor.commit();
            onStart.setText(preferences.getInt("onStart()", 1) + "");
        } else {
            Log.v("onStart()", "lol");
            sharedPrefEditor.putInt("onStart()", preferences.getInt("onStart()", 1) + 1);
            sharedPrefEditor.commit();
            onStart.setText(preferences.getInt("onStart()", 1) + "");
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        onModifier.setOnResume(onModifier.getOnResume() + 1);
        onResume2.setText(onModifier.getOnResume() + "");
        if(!preferences.contains("onResume()")) {
            Log.v("Start it!", "message");
            sharedPrefEditor.putInt("onResume()", 1);
            sharedPrefEditor.commit();
            onResume.setText(preferences.getInt("onResume()", 1) + "");
        } else {
            Log.v("onResume()", "lol");
            sharedPrefEditor.putInt("onResume()", preferences.getInt("onResume()", 1) + 1);
            sharedPrefEditor.commit();
            onResume.setText(preferences.getInt("onResume()", 1) + "");
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        onModifier.setOnPause(onModifier.getOnPause() + 1);
        onPause2.setText(onModifier.getOnPause() + "");
        if(!preferences.contains("onPause()")) {
            Log.v("Start it!", "message");
            sharedPrefEditor.putInt("onPause()", 1);
            sharedPrefEditor.commit();
            onPause.setText(preferences.getInt("onPause()", 1) + "");
        } else {
            Log.v("onPause()", "lol");
            sharedPrefEditor.putInt("onPause()", preferences.getInt("onPause()", 1) + 1);
            sharedPrefEditor.commit();
            onPause.setText(preferences.getInt("onPause()", 1) + "");
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        onModifier.setOnRestart(onModifier.getOnRestart() + 1);
        onRestart2.setText(onModifier.getOnRestart() + "");
        if(!preferences.contains("onRestart()")) {
            Log.v("Start it!", "message");
            sharedPrefEditor.putInt("onRestart()", 1);
            sharedPrefEditor.commit();
            onRestart.setText(preferences.getInt("onRestart()", 1) + "");
        } else {
            Log.v("onRestart()", "lol");
            sharedPrefEditor.putInt("onRestart()", preferences.getInt("onRestart()", 1) + 1);
            sharedPrefEditor.commit();
            onRestart.setText(preferences.getInt("onRestart()", 1) + "");
        }
    }
    
    @Override
    protected void onStop() {
        super.onStop();
        onModifier.setOnStop(onModifier.getOnStop() + 1);
        onStop2.setText(onModifier.getOnStop() + "");
        if(!preferences.contains("onStop()")) {
            Log.v("Start it!", "message");
            sharedPrefEditor.putInt("onStop()", 1);
            sharedPrefEditor.commit();
            onStop.setText(preferences.getInt("onStop()", 1) + "");
        } else {
            Log.v("onStop()", "lol");
            sharedPrefEditor.putInt("onStop()", preferences.getInt("onStop()", 1) + 1);
            sharedPrefEditor.commit();
            onStop.setText(preferences.getInt("onStop()", 1) + "");
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        onModifier.setOnDestroy(onModifier.getOnDestroy() + 1);
        onDestroy2.setText(onModifier.getOnDestroy() + "");
        if(!preferences.contains("onDestroy()")) {
            Log.v("Start it!", "message");
            sharedPrefEditor.putInt("onDestroy()", 1);
            sharedPrefEditor.commit();
            onDestroy.setText(preferences.getInt("onDestroy()", 1) + "");
        } else {
            Log.v("onDestroy()", "lol");
            sharedPrefEditor.putInt("onDestroy()", preferences.getInt("onDestroy()", 1) + 1);
            sharedPrefEditor.commit();
            onDestroy.setText(preferences.getInt("onDestroy()", 1) + "");
        }
    }
}