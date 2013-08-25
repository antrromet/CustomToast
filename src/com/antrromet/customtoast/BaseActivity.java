

package com.antrromet.customtoast;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.antrromet.customtoast.CustomToast.OnToastActionListener;

public class BaseActivity extends Activity implements OnClickListener, OnToastActionListener {

    private CustomToast mCutomToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onResume() {

        super.onResume();
        mCutomToast = new CustomToast(findViewById(R.id.custom_toast), this);
    }

    @Override
    public void onToastAction(Bundle object) {

    }

    /**
     * Show the custom toast
     * 
     * @param message
     *            The text to be displayed in the toast
     */
    public void showMessage(String message) {

        mCutomToast.hideCustomToast(true);
        mCutomToast.showMessage(false, message, CustomToast.SHORT_DELAY);
    }

    /**
     * 
     * @param message
     *            The text to be displayed in the toast
     * @param leftDrawableRes
     *            The icon to be displayed at the left side of the toast
     * @param actionMessage
     *            The message to be displayed on which action is to be performed
     * @param actionParams
     *            The params if needed to do the action
     */
    public void showMessage(String message, int leftDrawableRes, String actionMessage, Bundle actionParams) {

        mCutomToast.hideCustomToast(true);
        mCutomToast.showMessage(false, message, leftDrawableRes, actionMessage, actionParams, CustomToast.SHORT_DELAY);
    }

    @Override
    public void onClick(View v) {

    }

}
