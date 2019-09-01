package com.leon.filepicker.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.RelativeLayout;

import com.leon.filepicker.R;

public class FragmengActivity extends AppCompatActivity {
    RelativeLayout mRootLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmeng);
        mRootLayout = (RelativeLayout) findViewById(R.id.rootlayout);
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        FileFragment fileFragment = FileFragment.newInstance();
        transaction.replace(R.id.rootlayout, fileFragment);
        transaction.commit();


    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

    }
}
