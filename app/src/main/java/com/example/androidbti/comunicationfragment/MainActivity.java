package com.example.androidbti.comunicationfragment;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity implements TopFragment.onInvertListener{

    private BottomFragment bottomFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomFragment = (BottomFragment) getFragmentManager().findFragmentById(R.id.bottomFragment);
    }

    @Override
    public void onInvert(String text) {
        bottomFragment.invert(text);
    }
}
