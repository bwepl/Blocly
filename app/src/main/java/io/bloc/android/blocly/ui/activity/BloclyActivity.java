package io.bloc.android.blocly.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import io.bloc.android.blocly.BloclyApplication;
import io.bloc.android.blocly.R;

/**
 * Created by Ben Weinstein on 9/4/2016.
 */
public class BloclyActivity extends Activity
{


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blocly);
        TextView feedText = (TextView) findViewById(R.id.feed_name);
        feedText.setText(BloclyApplication.getSharedDataSource().getFeeds().get(0).getTitle());
    }
}
