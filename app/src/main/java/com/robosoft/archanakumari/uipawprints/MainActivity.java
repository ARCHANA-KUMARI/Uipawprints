package com.robosoft.archanakumari.uipawprints;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.robosoft.archanakumari.uipawprints.adapter.RecyclerViewAdapter;

public class MainActivity extends AppCompatActivity {

    private ImageView mIageViewHexaGon;
    private Toolbar mToolbar;
    private RecyclerView mRecyclerview;
    private RecyclerViewAdapter mRecyclerViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar) findViewById(R.id.appbar);
        setSupportActionBar(mToolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.toolbaritems, null);
        actionBar.setCustomView(view);
        mIageViewHexaGon = (ImageView)findViewById(R.id.imageView_hexagon);
        Bitmap icon = BitmapFactory.decodeResource(getResources(), R.drawable.dog);
        mIageViewHexaGon.setImageBitmap(icon);

        mRecyclerViewAdapter = new RecyclerViewAdapter(this);
        mRecyclerview = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerview.setLayoutManager(linearLayoutManager);
        mRecyclerview.setAdapter(mRecyclerViewAdapter);

    }


}
