package org.bts.android.dummyproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = SecondActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btnReturnInfo = (Button) findViewById(R.id.btn_return_info_second_activity);
        btnReturnInfo.setOnClickListener(this);

    }


    @Override
    public void onClick(View whichView) {

        if(whichView.getId() == R.id.btn_return_info_second_activity) {

            Log.w(SecondActivity.TAG, "Return Info Button Clicked");
            Intent returnIntent = new Intent();
            returnIntent.putExtra("my data", "Info returned Here from Second Activity");
            setResult(55, returnIntent);
            finish();

        }


    }
}
