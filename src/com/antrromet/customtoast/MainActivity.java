

package com.antrromet.customtoast;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity {

    private Button mSimpleToastButton;
    private Button mAwesomeToastButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSimpleToastButton = (Button) findViewById(R.id.simpleToastButton);
        mSimpleToastButton.setOnClickListener(this);

        mAwesomeToastButton = (Button) findViewById(R.id.awesomeToastButton);
        mAwesomeToastButton.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public void onClick(View v) {

        super.onClick(v);
        if (v == mSimpleToastButton) {
            showMessage(getString(R.string.simple_toast_message));
        }
        else if (v == mAwesomeToastButton) {
            showMessage(getString(R.string.no_connection), R.drawable.toast_icon_refresh, "RETRY", null);
        }
    }
}
