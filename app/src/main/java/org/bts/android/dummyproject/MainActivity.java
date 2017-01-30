package org.bts.android.dummyproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{

    private static final String TAG = MainActivity.class.getSimpleName();

    private TextView mTvInfo;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this,"onCreate()", Toast.LENGTH_LONG).show();
        Log.d(MainActivity.TAG, "In-onCreate()");

        final Button btnStartActivity = (Button) findViewById(R.id.btn_main_activity_start_activity);
        btnStartActivity.setOnClickListener(this);

        final Button btnSecond = (Button) findViewById(R.id.second_btn);
        btnSecond.setOnClickListener(this);

        final Button btnThird = (Button) findViewById(R.id.third_btn);
        btnThird.setOnClickListener(this);

        this.mTvInfo = (TextView) findViewById(R.id.tv_info_main_activity);

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

     //   Intent activityIntent = new Intent(this, SecondActivity.class);
     //   startActivity(activityIntent);
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

    public void startSecondActivity(View view) {
        Intent activityIntent = new Intent(this, SecondActivity.class);
        startActivity(activityIntent);
    }


    @Override
    public void onClick(View whichView) {

        if (whichView.getId() == R.id.btn_main_activity_start_activity) {

            Log.e("OnClickClass", "Button 1 Clicked");

        } else if (whichView.getId() == R.id.second_btn){

            Log.w("OnClickClass", "Button 2 Clicked");
            Intent activityIntent = new Intent(this, SecondActivity.class);
//            startActivity(activityIntent);
            startActivityForResult(activityIntent, 0);

        } else {

            Log.w("OnClickClass", "Button 3 Clicked");

        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Log.w(MainActivity.TAG, "In-onActivityResult");

        if (requestCode == 0 && resultCode == 55){
            String returnData = data.getStringExtra("my data");
            Log.w(MainActivity.TAG, "return String " + returnData);
            mTvInfo.setText(returnData);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("myTextViewValue", this.mTvInfo.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        String returnString = savedInstanceState.getString("myTextViewValue", "nothing returned");
        this.mTvInfo.setText(returnString);
    }
}
