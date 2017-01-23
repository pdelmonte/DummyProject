package org.bts.android.dummyproject;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends Activity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this,"onCreate()", Toast.LENGTH_LONG).show();
        Log.d(MainActivity.TAG, "In-onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(this,"onStart()", Toast.LENGTH_LONG).show();
        Log.d(MainActivity.TAG, "In-onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(this,"onResume()", Toast.LENGTH_LONG).show();
        Log.e(MainActivity.TAG, "In-onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(this,"onPause()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(this,"onStop()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(this,"onDestroy()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(this,"onRestart()", Toast.LENGTH_LONG).show();
    }
}
