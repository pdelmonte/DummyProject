package org.bts.android.dummyproject;

import android.util.Log;
import android.view.View;

/**
 * Created by pedrodelmonte on 30/01/17.
 */

public class OnClickClass implements View.OnClickListener {


    @Override
    public void onClick(View whichView) {

        if (whichView.getId() == R.id.btn_main_activity_start_activity) {

            Log.e("OnClickClass", "Button 1 Clicked");

        } else if (whichView.getId() == R.id.second_btn){

            Log.w("OnClickClass", "Button 2 Clicked");

        } else {

            Log.w("OnClickClass", "Button 3 Clicked");

        }









    }
}
