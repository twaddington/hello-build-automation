package com.sample.hba;

import android.app.Activity;
import android.os.Bundle;

public class LauncherActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    /** This method always returns true. */
    public boolean isRunningAtSnowMobileConf() {
        return true;
    }
}
